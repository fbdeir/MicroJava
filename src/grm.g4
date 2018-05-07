grammar grm;

options{
    language=Java;
}
@parser::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;
}
@lexer:: members{
    boolean lexicalError=false;
    public ArrayList<Integer> tracker=new ArrayList<Integer>(){{   add(0);}};;
    Writer errors=new Writer("errors.txt");
    Writer symbols=new Writer("Symbol Table");
    public static Stack<Stack<ASTNode>> tempStack=new Stack<Stack<ASTNode>>(); //list of children of the current subroot
 	Stack<ASTNode> nodeStack=new Stack<ASTNode>(); //all subtrees
 	ASTNode Ptree=new ASTNode(); //The root of the program
 	static String name;
 	static int scope=0;
 	static int count=0;
 	static int isVar=0;
 	static int isClass=0;
 	static int isProgram=0;
 	static int isArray=0;
 	static int isAssign=0;
 	static int isMethod=0;
 	static int isField=0;
 	static int isFinal=0;
 	static String methodParams="";
 	static int isParams=0;
 	static String currType;
 	static SymbolHashTable classes=new SymbolHashTable();
 	static ArrayList<String> varTypes=new ArrayList<String>();
 	private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();
 	public static SymbolHashTable symbolTable=new SymbolHashTable();
 	public SymbolHashTable getSymbolTable(){
    	 return symbolTable;
    }
    public void setTable(){
        varTypes.add("int");
        varTypes.add("char");
        varTypes.add("void");
        symbolTable.insert("int","int", "preloaded", 0,0);
        symbolTable.insert("char","char", "preloaded", 0,0);
        symbolTable.insert("null","null", "preloaded", 0,0);
        symbolTable.insert("chr","chr", "preloaded", 0,0);
        symbolTable.insert("ord","ord", "preloaded", 0,0);
        symbolTable.insert("len","len", "preloaded", 0,0);
        symbolTable.insert("program","program", "keyword", 0,0);
        symbolTable.insert("class","class", "keyword", 0,0);
        symbolTable.insert("if","if", "keyword", 0,0);
        symbolTable.insert("else","else", "keyword", 0,0);
        symbolTable.insert("while","while", "keyword", 0,0);
        symbolTable.insert("read","read", "keyword", 0,0);
        symbolTable.insert("print","print", "keyword", 0,0);
        symbolTable.insert("return","return", "keyword", 0,0);
        symbolTable.insert("void","void", "keyword", 0,0);
        symbolTable.insert("final","final", "keyword", 0,0);
        symbolTable.insert("new","new", "keyword", 0,0);
    }
     public int lexGetLine(){
       return getLine();
     }

      public SymbolTableNode node;
      @Override
      public Token nextToken() {

            if(!queue.isEmpty()) {
              return queue.poll();
            }

            Token next = super.nextToken();

            while(next.getType()==WhiteSpace){

            }
            if(next.getType() != Unknown) {
                    if(next.getType()==TOK_LCB){
                        count++;
                        scope++;
                        tracker.add(count);
                    }else
                    if(next.getType()==TOK_LCB){
                        count++;
                        scope--;
                        tracker.remove(count);
                    }else
                    if(next.getType()==TOK_PROGRAM){
 		                isProgram=1;
                        node=new SymbolTableNode();
	                    node.type=getText();
 		            }else
 		             if(next.getType()==TOK_FINAL){
 		                isFinal=1;
                        node=new SymbolTableNode();
                        node.isFinal=1;
 		                node.type=getText();
 		             }else
 		             if(next.getType()==TOK_SEMI){
 		                isVar=0;
 		                isArray=0;
 		             }else
 		             if(next.getType()==TOK_LB){
 		                 /*isArray=1;
 		                 //System.out.println(name);
 		                 checkScopeNode(name).isArray=1;
 		                 checkScopeNode(name).type+="[]";
 		                 isVar=0;*/
 		             }else
 		             if(next.getType()==TOK_VOID){
                        isVar=1;
                        node=new SymbolTableNode();
                        node.type=getText();
 		             }else
 		             if(next.getType()==TOK_IDENTIFIER){
                            if(varTypes.contains(getText()) && !(isVar==1)){
                                isVar=1;
                                node=new SymbolTableNode();
                                node.type=getText();
                            }
                            else if(isVar==1){
                                if(getText().equals("i")){
                                    //System.out.println("hello i");
                                }
                                if(!checkScope(getText())){
                                    node.name=getText();
                                    node.scope=scope;
                                    node.isArray=0;
                                    node.structure="IDENTIFIER";
                                    symbolTable.insert(node);


                                }
                                else{
                                    SymbolTableNode n=checkScopeNode(getText());
                                    if(n.structure.equals("keyword") || n.structure.equals("preloaded")){
                                        errors.write(getText()+" is a "+n.structure+ " at line"+getLine()+"\n");
                                    }else{
                                        errors.write(getText()+" has already been defined at line"+getLine()+"\n");
                                    }
                                }
                                name=getText();
                                isVar=0;
                            }
                            else if(isClass==1){
                                if(!checkScope(getText())){
                                    node.name=getText();
                                    node.scope=count;
                                    node.isArray=0;
                                    node.structure="CLASS";
                                    symbolTable.insert(node);
                                    varTypes.add(getText());
                                }else{
                                    SymbolTableNode n=checkScopeNode(getText());
                                    if(n.structure.equals("keyword") || n.structure.equals("preloaded")){
                                        errors.write(getText()+" is a"+n.structure+" at line "+getLine()+"\n");
                                    }else{
                                        errors.write(getText()+" has already been defined at line"+getLine()+"\n");
                                    }
                                }
                                isClass=0;
                            }else if(isProgram==1){
                                node.name=getText();
                                node.scope=count;
                                node.isArray=0;
                                node.structure="TOK_PROGRAM";
                                symbolTable.insert(node);
                                isProgram=0;
                            }
                         //else if(checkScope(getText())){
                            //if(isAssign==1){
                            else{
                                try{
                                    if((checkScopeNode(getText()).isFinal==1)){
                                        errors.write(getText()+" is final "+getLine()+"\n");
                                    }
                                    else {
                                        currType=checkScopeNode(getText()).type;
                                    }
                                }catch(NullPointerException e){
                                    if(! (getText().equals("[") || getText().equals("]"))){
                                        //errors.write(getText()+" is not defined "+getLine()+"\n");
                                    }
                                }
                            }
                         //}
 	    	         }

                //check if class:
                 else if(next.getType()==TOK_CLASS){
                    isClass=1;
                    node=new SymbolTableNode();
                    node.type="class";
                 }



          return next;
             }


        StringBuilder builder = new StringBuilder();

        while(next.getType() == Unknown) {
          next = super.nextToken();
        }


    queue.offer(next);

    return new CommonToken(Unknown, builder.toString());
}
public Boolean checkScope(String name){
 					   SymbolTableNode n=null;
 					   if(name.equals("int") ||name.equals("char") || name.equals("null") ||name.equals("chr") ||name.equals("ord")||name.equals("len")||name.equals("program")||name.equals("class")
 							   ||name.equals("if") ||name.equals("else")||name.equals("while")||name.equals("read")||name.equals("print")||name.equals("return")||name.equals("void")||name.equals("final")||name.equals("new")){
 					   	return true;
 					   }

 					   for(int i=0; i<tracker.size(); i++) {
 						  // for(Integer temp: set) {
 							   n = (SymbolTableNode) symbolTable.get(tracker.get(i), name);

 						//   }
 						try {
 							if (n != null)
 								return true;
 						}catch(NullPointerException e){
 								return false;
 							}
 						}
 						return false;

 			   }
 			   public SymbolTableNode checkScopeNode(String name){
 	           	           				   SymbolTableNode n=null;
 	           	           				   for(int i=0; i<tracker.size(); i++) {
 	           	           					  // for(Integer temp: set) {
 	           	           						   n = (SymbolTableNode) symbolTable.get(tracker.get(i), name);
 	           								   try {
 	           									   if (n != null)
 	           										   return n;
 	           								   }catch(NullPointerException e){
 	           								   }
 	           							   }
 	           	           					return n;

 	           	           		   }
                public SymbolTableNode checkNode(String name){
                 	           	           				   SymbolTableNode n=null;
                 	           	           					  // for(Integer temp: set) {
                 	           	           						   n = (SymbolTableNode) symbolTable.get(name);
                 	           								   try {
                 	           									   if (n != null)
                 	           										   return n;
                 	           								   }catch(NullPointerException e){
                 	           								   }

                 	           	           					return n;

                 	           	           		   }
public void printSymbolTable(){
 					Set<Integer> keys=symbolTable.SymbolHashTable().keySet();
 	                int line=0;
 	                for(Integer i: keys){
 	                    SymbolTableNode n = (SymbolTableNode) symbolTable.SymbolHashTable().get(i);
 	                    while(n != null){
 	                        if(n.isArray!=1){
 		                    symbols.write(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type+Arrays.toString(n.parameters.toArray())+"\n");
 		                    }else{
 		                        symbols.write(line+": "+n.name+", "+n.structure+", scope: "+n.scope+", type: "+n.type+"[]"+Arrays.toString(n.parameters.toArray())+"\n");
 		                    }
 	                        n=n.child;
 	                        line++;
 	                    }
 	                }
 				}
}
@lexer::header{
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Set;
}
@parser:: members{
    int cCount=1;
    int iCount=1;
    int aCount=1;
    int oCount=1;

    grmLexer lexer;
    public void setLexer(grmLexer lexer){
			this.lexer=lexer;
	}

    @Override
		public void enterRule(ParserRuleContext localctx, int state, int ruleIndex) {
            super.enterRule(localctx, state, ruleIndex);
            if(ruleNames[ruleIndex].equals("statement")){
                lexer.isAssign=1;
            }else
            if(ruleNames[ruleIndex].equals("assignment")){
                //System.out.println("asssingment");
                lexer.isAssign=1;
            }
            if(ruleNames[ruleIndex].equals("factor")){
                //System.out.println("factor");
            }
        }
}
//SPACES

WhiteSpace: (' ' | '\n'| '\r'| '\t'){skip();};
Comments: '//'.*?'\n'{skip();};
Unknown: '!'|'@'|'#'|'$'|'^';

//
//MicroJava Tokens:
TOK_INTLIT : (DIGIT)+{
long y= Long.parseLong(getText());
if(y>2147483647){
//lexicalError=true;
}

};
//Keywords
TOK_CLASS : 'class';
TOK_FINAL : 'final';
TOK_ELSE : 'else';
TOK_IF : 'if';
TOK_NEW : 'new';
TOK_READ : 'read';
TOK_RETURN : 'return';
TOK_VOID : 'void';
TOK_WHILE : 'while';
TOK_PRINT : 'print';
TOK_PROGRAM: 'program';

//Rules
program: prog;
prog: TOK_PROGRAM   TOK_IDENTIFIER   (constDecl|varDecl|classDecl)*  TOK_LCB (methodDecl)* rcb eof;
eof: EOF;
constDecl: TOK_FINAL varType    TOK_IDENTIFIER  TOK_OP_ASSIGN (TOK_INTLIT|TOK_CHARLIT) TOK_SEMI;
varDecl:  varType TOK_IDENTIFIER  (TOK_COMMA   TOK_IDENTIFIER )* TOK_SEMI;

classDecl: TOK_CLASS  TOK_IDENTIFIER TOK_LCB  (varDecl)* TOK_RCB ;
methodDecl: (varType| TOK_VOID) TOK_IDENTIFIER TOK_LP (formPars)? TOK_RP (varDecl)* block;
formPars:  parsTemp (TOK_COMMA parsTemp)*;
parsTemp:varType TOK_IDENTIFIER;
block: TOK_LCB  (statement)* rcb ;
rcb: TOK_RCB;
statement: assignment
| ifStatment elseStatement*
| whileStatement
| returnStatement
| TOK_READ TOK_LP designator TOK_RP TOK_SEMI
| printStatement
|  block
| TOK_SEMI;
printStatement: TOK_PRINT TOK_LP expr (TOK_COMMA TOK_INTLIT)? TOK_RP TOK_SEMI;
ifStatment:TOK_IF TOK_LP  condition TOK_RP (TOK_LCB)? (statement)* endif? ;
endif: TOK_RCB;
elseStatement:TOK_ELSE (TOK_LCB)? statement endElse?;
endElse: TOK_RCB;
whileStatement:TOK_WHILE TOK_LP condition TOK_RP statement;

returnStatement:TOK_RETURN (expr)? TOK_SEMI;
assignment:designator (assign_helper|actPars) TOK_SEMI;
assign_helper:TOK_OP_ASSIGN expr;
actPars: TOK_LP (expr (TOK_COMMA expr)*)? TOK_RP;
condition: expr relop expr;
relop: TOK_OP_REL;
expr: (Minus)? term  (TOK_OP_ADD term)*;
Minus: '-';
term: factor (TOK_OP_TIMES factor)*;
factor: d
| TOK_INTLIT
| TOK_CHARLIT
| TOK_NEW x
| TOK_LP expr TOK_RP;
d: designator (actPars)?;
designator: TOK_IDENTIFIER (TOK_DOT TOK_IDENTIFIER | TOK_LB ex TOK_RB)*;
x:TOK_IDENTIFIER (object_call|array_call);
array_call: (TOK_LB (ex)? TOK_RB)*;
object_call: (TOK_LP expr TOK_RP)?;
varType: ident;
ex: expr;
ident: TOK_IDENTIFIER (TOK_LB TOK_RB)?;



//MicroJava Delimiters
TOK_COMMA : ',';
TOK_SEMI : ';';
TOK_DOT : '.';
TOK_LB : '[';
TOK_RB : ']';
TOK_LCB : '{' ;
TOK_RCB : '}';
TOK_LP : '(';
TOK_RP : ')';

//MicroJava Operators
TOK_OP_REL : TOK_EQ
   | TOK_OP_NE
   | TOK_OP_LT
   | TOK_OP_LE
   | TOK_OP_GT
   | TOK_OP_GE;

TOK_OP_ADD : OP_ADD_PLUS
   | OP_ADD_MINUS ;




TOK_OP_TIMES : OP_MUL_TIMES //OPP_MUL_TIMES
| OP_MUL_DIV
| OP_MUL_MOD;

//OPERATOR TOKENS
TOK_EQ:'==';
TOK_OP_NE: '!=';
TOK_OP_LT: '<';
TOK_OP_LE: '<=';
TOK_OP_GT: '>';
TOK_OP_GE: '<=';
TOK_OP_ASSIGN : '=' ;// OP_ASSIGN
OP_ADD_PLUS: '+';
OP_ADD_MINUS: '-';
OP_MUL_TIMES:'*';
OP_MUL_DIV:'/';
OP_MUL_MOD:'%';
//
TOK_INVALID_IDENTIFIER: '_' TOK_IDENTIFIER
  | DIGIT TOK_IDENTIFIER ;
TOK_IDENTIFIER : LETTER (LETTER|DIGIT)*;
TOK_INVALID_CHARLIT: '\'' (TOK_CHARLIT)? ~('\'');
TOK_CHARLIT: '\''(LETTER|DIGIT|'\\n'|'\\r'|'\\t')'\'';
UNRECOGNIZED_SYMBOL: . ;
//fragments
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
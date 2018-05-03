import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.PrintWriter;
        import java.util.ArrayList;

public class MIPSConverter {

    static int currProc = 0;
    static int forPrint = 1;


    static ArrayList<ArrayList<String>> instructions = new ArrayList<>();
    static ArrayList<QuadrupleInstructions.Quadruple> parameters = new ArrayList<>();
    static ArrayList<String> declarations = new ArrayList<String>();

    public static void convert() {
        for (QuadrupleInstructions.Quadruple instructions : QuadrupleInstructions.tac) {
            conditionCall(instructions);
        }
    }

    public static void conditionCall(QuadrupleInstructions.Quadruple instruction) {
        if (instruction.operator.equals("PARAMC")) {
            parameters.add(instruction);
        } else if (instruction.operator.equals("CALL")) {
            CALL(instruction.s2);
        } else if (instruction.operator.equals("JUMP")) {
            JUMP(instruction.s2);
        }  else if (instruction.operator.equals("LABEL")) {
            LABEL(instruction.s1);
        }  else if (instruction.operator.equals("PARAMI")) {
            parameters.add(instruction);
        } else if (instruction.operator.equals("PARAMC")) {
            parameters.add(instruction);
        }
    }

    // need to e checked
    public static void JUMP(String source2) {
        if (!source2.equals("main")) {
            String instruction1 = "j ." + source2;
            instructions.get(currProc).add(instruction1);
        }
    }

    public static void LABEL(String source1) {
        String instruction1 = "", instruction2 = "", instruction3 = "";
        if (!source1.equals("main")) {
            String instruction11 = "." + source1 + ":";
            instructions.get(currProc).add(instruction11);
        }
    }

    public static void CALL(String s2) {
        if (s2.equals("print")) {
            String instruction1 = "" , instruction2 = "" , instruction3 = "";

            if (s2.equals("print")) {
                for (QuadrupleInstructions.Quadruple param : parameters) {

                    if (param.operator.equals("PARAMI")) {
                        instruction1 = "li $v0, 1";
                        if(param.s1.matches("[0-9]+")) { instruction2 = "li $a0, "+param.s1; }
                        //  else { instruction2 = "lw $a0, "+Scope.getMIPSVarName(param.s1,currProc); }
                    }
                    else if(param.operator.equals("PARAMC")) {
                        instruction1 = "li $v0, 11";
                        declarations.add("print"+forPrint+": .byte "+param.s1);
                        instruction2 = "lb $a0, print" + forPrint ;
                        forPrint++; }
                }
                  /* else if(param.operator.equals("PARAMS")) {
                    instruction1 = "li $v0, 4";
                    declarations.add("print"+forPrint+": .asciiz "+param.source1+"");
                    instruction2 = "la $a0, print" + forPrint ;
                    forPrint++;

                }*/
                instructions.get(currProc).add(instruction1);
                instructions.get(currProc).add(instruction2);
                instructions.get(currProc).add("syscall");
              /*  instructions.get(currProc).add("li $v0, 4");
                instructions.get(currProc).add("la $a0, newline");*/



            }
            parameters = new ArrayList<>();
        }
    }

    public static void display() {
        try {
            PrintWriter mips = new PrintWriter(new File("MicroJava.asm"));
            String str = ".data\n";
            MIPSConverter.declarations.add("newline : .asciiz \"\\n\"");
            for (String decl : declarations) {
                str += "\t" + decl + "\n";
            }

            str += "\n";
            str += ".text\nmain:\n";
            boolean main = true;
            for (ArrayList<String> instruction : instructions) {
                for (String instruc : instruction) {
                    str += "\t" + instruc + "\n";
                }
                if (main) {
                    str += "li $v0, 10\n";
                    str += "syscall";
                    main = false;
                }
                str += "\n";
            }
            mips.print(str);
            mips.close();
        } catch (FileNotFoundException e) {
        }
    }
}
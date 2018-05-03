import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class QuadrupleInstructions {
    // this array list will store all the tac to be printed at the end of each
// program in a file
    static ArrayList<Quadruple> tac = new ArrayList<Quadruple>();


    static class Quadruple {
        String operator, s1, s2, result;

        public Quadruple(String operator, String s1, String s2, String result) {
            this.operator = operator;
            this.s1 = s1;
            this.s2 = s2;
            this.result = result;
        }

        public String toString() {
            String str = "";
            if ("CALL".equals(operator)) {
                str = "CALL\t" + s1 + "\t" + s2;
            } else if ("PARAMC".equals(operator)) {
                str = "PARAMC\t" + s1;
            } else if ("PARAMI".equals(operator)) {
                str = "PARAMI\t" + s1;
            } else if (operator.equals("JUMP")) {
                return "JUMP\t\t" + s2;
            }  else if (operator.equals("LABEL")) {
                return "LABEL\t" + s1;
            }

            return str;
        }
    }

    public static void params(String parameter, String type) {
//System.out.println(parameter +" first string "+ type+" type second");
        if ("Character".equals(type)) {
            tac.add(new Quadruple("PARAMC", parameter, null, null));
        } else if ("Integer".equals(type)) {
            tac.add(new Quadruple("PARAMI", parameter, null, null));
        }
    }

    public static void calls(String n, String l2, String value, String type) {
// Quadruple q=null;
        if ("void".equals(type)) {
            tac.add(new Quadruple("CALL", n, l2, value));
        }
    }


    public static void BJL(String operator, String source1, String source2) {

        if (operator.equals("JUMP")) {
            tac.add(new Quadruple("JUMP", null, source2, null));
        }   else if (operator.equals("LABEL")) {
            tac.add(new Quadruple("LABEL", source1, null, null));
        }

    }
    public static void print() {
        String tacs = "";
        for (Quadruple quadruple : tac) {
            tacs += quadruple.toString() + "\n";
        }
        PrintWriter tacFile = null;
        try {
            tacFile = new PrintWriter(new File("MicroJavaTAC.out"));
            tacFile.print(tacs);
            tacFile.close();
        } catch (Exception e) {

        }
    }
}
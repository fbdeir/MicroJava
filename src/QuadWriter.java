import java.util.Scanner;

public class QuadWriter {
    private static Writer quads= new Writer("mips.txt");
    public static int tabs=0;
    public static String waitString;
    public QuadWriter(){
        QuadWriter();
    }
    public static Writer QuadWriter(){
        quads.write(".data");
        quads.write(".text");
        return quads;
    }

    public static  void write(String s){
        for(int i=0; i<tabs; i++) {
            s = "\t" + s;
        }
        quads.write(s);
    }
    public static void hold(String s){
        for(int i=0; i<tabs; i++) {
            s = "\t" + s;
        }
        waitString+="\n"+s;
    }
    public static void drop(){
        quads.write(waitString);
    }


}

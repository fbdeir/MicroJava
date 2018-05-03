public class QuadWriter {
    private static Writer quads= new Writer("quads.txt");
    public static int tabs=0;
    public static Writer QuadWriter(){
        return quads;
    }
    public static  void write(String s){
        for(int i=0; i<tabs; i++) {
            s = "\t" + s;
        }
        quads.write(s);
    }
}

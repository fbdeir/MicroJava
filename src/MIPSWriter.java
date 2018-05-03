public class   MIPSWriter {
    private static Writer mips= new Writer("mips.txt");

    public static Writer QuadWriter(){
        return mips;
    }
    public static  void write(String s){
        mips.write(s);
    }
}

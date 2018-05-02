import java.io.FileWriter;

public class Writer {
    FileWriter writer;

    public Writer(String filename){
        try {
            this.writer= new FileWriter(filename, true);
        }catch(java.io.IOException e){

        }finally{
        }
    }

    public void write(String s){
        try {
            writer.append(s);
            writer.flush();
        }catch(java.io.IOException k){

        }
    }
}

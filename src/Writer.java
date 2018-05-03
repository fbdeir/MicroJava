import java.io.File;
import java.io.FileWriter;

public class Writer {
    FileWriter writer;

    public Writer(String filename){
        try {
            File f=(new File(filename));
            if(f.exists()) {
                f.delete();
            }
                this.writer = new FileWriter(filename, true);

        }catch(java.io.IOException e){

        }finally{
        }
    }

    public void write(String s){
        try {
            writer.append(s+"\n");
            writer.flush();
        }catch(java.io.IOException k){

        }
    }
}

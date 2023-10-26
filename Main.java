import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main extends FileFrequency{
    public static void main(String[] args){
        try{
            BufferedReader r = new BufferedReader(new FileReader(args[0]));
            PrintWriter w = new PrintWriter(System.out);

            iterateFile(r,w);
            
        }
        catch(IOException error){
            System.out.println(error);
            System.exit(-1);
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class Main extends FileFrequency{
    public static void main(String[] args){

        try{
            BufferedReader r;
            PrintWriter w;
            if (args.length >= 0){
                File path = new File(args[0]);
                if (path.isDirectory()){
                    File[] files = path.listFiles();
                    for (File file:files){
                        if (file.isFile() && file.toString().endsWith(".txt")){
                            r = new BufferedReader(new FileReader(args[0]));
                            w = new PrintWriter(System.out);
                            iterateFile(r,w);
                        }
                        else if(file.isFile() && file.toString().endsWith(".pdf")){

                        }
                        else if(file.isFile() && file.toString().endsWith(".word")){

                        }
                        else if (file.isFile() && file.toString().endsWith(".pptx")){

                        }
                        else{
                            //return error/not readable file
                        }
                    } 
                }
                else if (path.isFile() && args[0].endsWith(".txt")){
                    r = new BufferedReader(new FileReader(args[0]));
                    w = new PrintWriter(System.out);
                    iterateFile(r,w);
                }
                else if (path.isFile() && args[0].endsWith(".pdf")){

                }
                else if(path.isFile() && args[0].endsWith(".word")){

                }
                else if(path.isFile() && args[0].endsWith(".pptx")){

                }
                else{
                    //return error/not readable file
                }
            }  
        }
        catch(IOException error){
            System.out.println(error);
            System.exit(-1);
        }
    }
}
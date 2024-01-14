package fileorganizer.src.main.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

/*
 * Method: Main method
 * Purpose: Attempts to explore path provided by user. Will analyze files provided, and categorize them based on key words. 
 *  In progress - Determine which directory each file belonds to, and create said directory.
 */
public class Main{
    public static void main(String[] args){
        String pathString;
        pathString = Utils.pathName();

        try{
            BufferedReader r;
            PrintWriter w;
            if (args.length >= 0){
                File path = new File(pathString);
                if (path.isDirectory()){
                    File[] files = path.listFiles();
                    for (File file:files){
                        if (file.isFile() && file.getPath().endsWith(".txt")){
                            r = new BufferedReader(new FileReader(file));
                            w = new PrintWriter(System.out);
                            FileFrequency.iterateTextFile(r,w);
                        }
                        else if(file.isFile() && file.toString().endsWith(".pdf")){
                            FileFrequency.iteratePdfText(FileFrequency.pdfToText(file));
                        }
                        // else if(file.isFile() && file.toString().endsWith(".word")){

                        // }
                        // else if (file.isFile() && file.toString().endsWith(".pptx")){

                        // }
                        else{
                            System.out.println("Error: file not readable. Please use path of text or pdf document (Word or pptx dependencies will be added later).");
                        }
                    } 
                }
                else if (path.isFile() && args[0].endsWith(".txt")){
                    r = new BufferedReader(new FileReader(args[0]));
                    w = new PrintWriter(System.out);
                    FileFrequency.iterateTextFile(r,w);
                }
                else if (path.isFile() && args[0].endsWith(".pdf")){
                    File pathName = new File(args[0]);
                    FileFrequency.iteratePdfText(FileFrequency.pdfToText(pathName));
                }
                // else if(path.isFile() && args[0].endsWith(".word")){

                // }
                // else if(path.isFile() && args[0].endsWith(".pptx")){

                // }
                else{
                    System.out.println("Error: file not readable. Please use path of text or pdf document (Word or pptx dependencies will be added later).");
                }
            }  
        }
        catch(IOException error){
            System.out.println(error);
            System.exit(-1);
        }
    }
}
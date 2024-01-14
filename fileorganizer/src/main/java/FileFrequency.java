package fileorganizer.src.main.java;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class FileFrequency{

    private static final String regex = "[!._,@? ]";

    /*
     * Method: Iterates Over Text File
     * Purpose: Reads through every word in a text file, looking for key words. If a key word is found,
     * it adds to the frequency of the HashMap. Once the file has ended, based on the end results, the
     * HashMap will be analyzed and the file will be sorted.
     */
    public static Frequencies iterateTextFile(BufferedReader r, PrintWriter w){
        try{
            Frequencies frequency = new Frequencies();

            while(r.readLine() != null){
            String line = r.readLine();
            System.out.println("line: "+line);
            String[] formattedLine = line.toLowerCase().split(regex);
                System.out.println("formated line: " + Arrays.toString(formattedLine));
            for (String word:formattedLine){
                    if (frequency.words.containsKey(word)){
                        frequency.words.put(word, frequency.words.get(word) + 1);
                    }
                }
                Frequencies.printMap(frequency);
            }
            
            return frequency;
        }
        catch(IOException error){
            System.out.println(error);
        }
        return null;
    }
    
    /*
     * Method: Pick Directory
     * Purpose: Based on the HashMap frequencies, this method will determine which directory it should be sorted in.
     *  If the directory hasn't been created yet, it will create the directory. Otherwise it will add it to the given 
     * directory.
     */
    public static void pickDirectory(Frequencies freq){
        return;
    }
    /*
     * Method: PDF to Text
     * Purpose: Transforms the PDF contents into a String. Uses apache PDFBox dependencies to acheive this. 
     */
    public static String pdfToText(File path){
        try{
            PDDocument pdf = PDDocument.load(path);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String textContent = pdfStripper.getText(pdf);
            return textContent;
        }
        catch(IOException error){
            System.out.println(error);
        }
        return null;
    }

    /*
     * Method: Iterate PDF Text
     * Purpose: Splits the String returned by the pdf conversion function, and reads over every word, looking for key words.
     */
    public static Frequecies iteratePdfText(String text){
        if (!text.isEmpty()){
            Frequencies frequency = new Frequencies();
            String[] words = text.split(" ");
            for (String word:words){
                if (frequency.words.containsKey(word)){
                    frequency.words.put(word, frequency.words.get(word) + 1);
                }
            }
            return frequency;  
        }
        System.out.println("Error: String/PDF file provided is empty.");
        return null;
    }
}

package src.java;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;

public class FileFrequency{

    private static final String regex = "[!._,@? ]";

    public static Frequencies iterateFile(BufferedReader r, PrintWriter w){
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
    
    public static void createDirectories(){
        return;
    }


}

package fileorganizer.src.main.java;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class Frequencies {
   
   HashMap<String, Integer> words;
   
   /*
    * Class: Frequencies
      Purpose: Define the frequencies table that files will be sorted on. 
    */
   public Frequencies(){
      
      this.words = new HashMap<String, Integer>();
      //Key:Value pairs found in this map
      this.words.put("assignment", 0);
      this.words.put("assignments", 0);
      this.words.put("midterm", 0);
      this.words.put("final", 0);
      this.words.put("sylabus", 0);
      this.words.put("outline", 0);
      this.words.put("lecture", 0);
   } 

   /*
    * Method: Print Map
      Purpose: Prints out the map in a readable format. 
    */
   static void printMap(Frequencies map){
      System.out.println(Arrays.asList(map.words));
   }
     
   public ArrayList<String> directoryTypes(){
      ArrayList<String> dir = new ArrayList<>();
      return dir;
   }
}



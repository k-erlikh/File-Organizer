import java.util.Arrays;
import java.util.HashMap;

public class Frequencies {
    
    HashMap<String, Integer> words;
   
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

   static void printMap(Frequencies map){
        System.out.println(Arrays.asList(map.words));
   }
}

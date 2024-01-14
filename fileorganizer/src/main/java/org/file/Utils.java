package fileorganizer.src.main.java.org.file;
import java.util.Scanner;


public class Utils {
    public static String pathName(){
        boolean answer = true;
        while (answer){
            Scanner pathScanner = new Scanner(System.in);
            System.out.println("Enter path name: ");
            String path = pathScanner.nextLine();
            System.out.println("Is this the correct path? (y/n): "+ path);
            String userInput = pathScanner.nextLine();
            userInput.toLowerCase();
            if (userInput.equals("y")){
                answer = false;
                return path;
            }
        }
    }

}

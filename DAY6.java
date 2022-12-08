import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DAY 6
public class DAY6 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day6_input.txt");
        Scanner sc = new Scanner(myObj);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            char[] characters = line.toCharArray();
            for (int i = 0; i < line.length(); i++) {
                if(i-14 >= 0){
                    Set<Character> chars = new HashSet<>();
                    for (int j = 0; j < 14; j++) {
                        chars.add(characters[i-j]);
                    }
                    if(chars.size()==14){
                        System.out.println(i+1);
                    }
                }
            }
        }
    }
}
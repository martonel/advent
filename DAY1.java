import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DAY 1

public class DAY1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day1_input.txt");
        Scanner sc = new Scanner(file);
        List<Integer> calories = new ArrayList<>();
        int n = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.length()!=0){
                    n += Integer.parseInt(line);
            } else {
                calories.add(n);
                n=0;
            }
        }
        Collections.sort(calories);
        System.out.println(calories.get(calories.size()-1));
        System.out.println(calories.get(calories.size()-1)+calories.get(calories.size()-2)+calories.get(calories.size()-3));
        sc.close();
    }
}

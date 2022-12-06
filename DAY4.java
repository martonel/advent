import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//DAY 3
public class DAY4 {

    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day4_input.txt");
        Scanner sc = new Scanner(myObj);
        int score = 0;
        int score2 = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] values = line.split(",");
            String[] first = values[0].split("-");
            String[] second = values[1].split("-");
            int a = Integer.parseInt(first[0]);
            int b = Integer.parseInt(first[1]);
            int c = Integer.parseInt(second[0]);
            int d = Integer.parseInt(second[1]);
            if((a <= c && b >= d) || (c <= a && d >= b)){
                score++;
            }
            if(!(b < c  || a > d)){
                score2++;
            }
        }
        System.out.println(score);
        System.out.println(score2);
    }
}
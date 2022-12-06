import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DAY 2
public class DAY2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day2_input.txt");
        Scanner sc = new Scanner(myObj);
        int score = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] values = line.split(" ");
            /*if(values.length==2) {
                String value1 = values[0];
                String value2 = values[1];
                if ((value1.equals("A") && value2.equals("X"))) {
                    // kő - kő
                    score += 4;
                } else if ((value1.equals("B") && value2.equals("Y"))) {
                    //papír - papír
                    score += 5;
                } else if ((value1.equals("C") && value2.equals("Z"))) {
                    //olló - olló
                    score += 6;
                } else if ((value1.equals("A") && value2.equals("Y"))) {
                    //kő - papír
                    score += 8;
                } else if ((value1.equals("A") && value2.equals("Z"))) {
                    //kő - olló
                    score += 3;
                } else if ((value1.equals("B") && value2.equals("X"))) {
                    //papír - kő
                    score += 1;
                } else if ((value1.equals("B") && value2.equals("Z"))) {
                    //papír - olló
                    score += 9;
                } else if ((value1.equals("C") && value2.equals("X"))) {
                    //olló - kő
                    score += 7;
                } else if ((value1.equals("C") && value2.equals("Y"))) {
                    //olló - papír
                    score += 2;
                }*/
            if(values.length==2) {
                String value1 = values[0];
                String value2 = values[1];
                if ((value1.equals("A") && value2.equals("X"))) {
                    // kő - lose - olló
                    score += 3;
                } else if ((value1.equals("C") && value2.equals("X"))) {
                    //olló - lose - papír
                    score += 2;
                } else if ((value1.equals("B") && value2.equals("X"))) {
                    //papír - lose - kő
                    score += 1;
                }  else if ((value1.equals("C") && value2.equals("Y"))) {
                    //olló - draw - olló
                    score += 6;
                } else if ((value1.equals("B") && value2.equals("Y"))) {
                    //papír - draw - papír
                    score += 5;
                } else if ((value1.equals("A") && value2.equals("Y"))) {
                    //kő - draw - kő
                    score += 4;
                } else if ((value1.equals("C") && value2.equals("Z"))) {
                    //olló - win - kő
                    score += 7;
                }  else if ((value1.equals("A") && value2.equals("Z"))) {
                    //kő - win - papír
                    score += 8;
                }  else if ((value1.equals("B") && value2.equals("Z"))) {
                    //papír - win - olló
                    score += 9;
                }

            }
        }
        System.out.println(score);
    }
}

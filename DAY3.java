import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DAY 3
public class DAY3 {

    public static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }
//PART 1
/*
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day3_input.txt");
        Scanner sc = new Scanner(myObj);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        int score = 0;
        while (sc.hasNextLine()) {
            char characters[] = sc.nextLine().toCharArray();

            char firstList[] = Arrays.copyOfRange(characters, 0, characters.length / 2);
            char secondList[] = Arrays.copyOfRange(characters, characters.length / 2, characters.length);

            Set<Character> findedCharacters = new HashSet<>();
            Arrays.sort(characters);
            for (int i = 0; i < characters.length / 2; i++) {
                if (contains(firstList[i], secondList)){
                    findedCharacters.add(firstList[i]);
                }
            }

            for (char c : findedCharacters) {
                for (int i = 0; i < alphabet.length; i++) {
                    if(alphabet[i] == c){
                        score += i+1;
                        break;
                    }
                }
            }
        }
        System.out.println(score);
    }
*/

//PART 2
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day3_input.txt");
        Scanner sc = new Scanner(myObj);
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int score = 0;
        int n = 1;
        char firstCharacters[] = new char[0];
        char secondCharacters[] = new char[0];
        char thirdCharacters[] = new char[0];
        while (sc.hasNextLine()) {
            if(n==1) {
                firstCharacters = sc.nextLine().toCharArray();
                n=2;
            }
            if(n==2){
                secondCharacters = sc.nextLine().toCharArray();
                n=3;
            }
            if(n==3){
                thirdCharacters = sc.nextLine().toCharArray();
                Set<Character> findedCharacters = new HashSet<>();
                Set<Character> finalCharacters = new HashSet<>();
                for (int i = 0; i < firstCharacters.length; i++) {
                    if (contains(firstCharacters[i], secondCharacters)){
                        findedCharacters.add(firstCharacters[i]);
                    }
                }
                for (char c: findedCharacters) {
                    if(contains(c,thirdCharacters)){
                        finalCharacters.add(c);
                    }
                }
                for (char c : finalCharacters) {
                    for (int i = 0; i < alphabet.length; i++) {
                        if(alphabet[i] == c){
                            score += i+1;
                            break;
                        }
                    }
                }
                n=1;
            }
        }
        System.out.println(score);
    }



}

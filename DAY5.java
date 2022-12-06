import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DAY 3
public class DAY5 {


    static String[] array1 = new String[]{"N","W","F","R","Z","S","M","D"};
    static String[] array2 = new String[]{"S","G","Q","P","W"};
    static String[] array3 = new String[]{"C","J","N","F","Q","V","R","W"};
    static String[] array4 = new String[]{"L","D","G","C","P","Z","F"};
    static String[] array5 = new String[]{"S","P","T"};
    static String[] array6 = new String[]{"L","R","W","F","D","H"};
    static String[] array7 = new String[]{"C","D","N","Z"};
    static String[] array8 = new String[]{"Q","J","S","V","F","R","N","W"};
    static String[] array9 = new String[]{"V","W","Z","G","S","M","R"};

    public static ArrayList<LinkedList<String>>  addLists(){
        ArrayList<LinkedList<String>> lists = new ArrayList<>();
        lists.add(new LinkedList<>(Arrays.asList(array1)));
        lists.add(new LinkedList<>(Arrays.asList(array2)));
        lists.add(new LinkedList<>(Arrays.asList(array3)));
        lists.add(new LinkedList<>(Arrays.asList(array4)));
        lists.add(new LinkedList<>(Arrays.asList(array5)));
        lists.add(new LinkedList<>(Arrays.asList(array6)));
        lists.add(new LinkedList<>(Arrays.asList(array7)));
        lists.add(new LinkedList<>(Arrays.asList(array8)));
        lists.add(new LinkedList<>(Arrays.asList(array9)));
        return lists;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day5_input.txt");
        Scanner sc = new Scanner(myObj);
        List<LinkedList<String>> stackList = addLists();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.startsWith("move")){
                // 1 - 3 - 5
                String[] numbers = line.split(" ");
                int start = Integer.parseInt(numbers[1]);
                int from = Integer.parseInt(numbers[3]);
                int to = Integer.parseInt(numbers[5]);

                //PART 1
                /*for (int i = start-1; i >= 0; i--) {
                    stackList.get(to-1).addFirst(stackList.get(from-1).get(0));
                    stackList.get(from-1).removeFirst();
                }*/

                //PART 2
                for (int i = start-1; i >= 0; i--) {
                    stackList.get(to-1).addFirst(stackList.get(from-1).get(i));
                    stackList.get(from-1).remove(i);
                }
            }
        }
        for (LinkedList<String> lista: stackList) {
            for (String s : lista) {
                System.out.print(s);
                break;
            }
        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//DAY 3
public class DAY5 {

    public static ArrayList<LinkedList<String>>  addLists(int size){
        ArrayList<LinkedList<String>> lists = new ArrayList<>();
        for (int i = 0; i < size-1; i++) {
            lists.add(new LinkedList<>());
        }
        //azért linkedList, mert a removeFirst-t meg lehet rajta hívni!
        lists.add(new LinkedList<>());
        return lists;
    }

    static ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\borza\\IdeaProjects\\AdventCode\\src\\day5_input.txt");
        Scanner sc = new Scanner(file);
        //lista, amiben olyan lista van, aminek az elejéről is lehet törölni
        ArrayList<LinkedList<String>> finalList= new ArrayList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.startsWith("[")){
                lines.add(line);
            }
            if(line.startsWith(" ")){
                String[] numbers = line.split(" ");
                int lastNumber = Integer.parseInt(numbers[numbers.length-1]);
                finalList = addLists(lastNumber);
                for (int i = 0; i < lines.size(); i++) {
                    int k= 1;
                    for (int j = 0; j < lastNumber; j++) {
                        if(!Character.toString(lines.get(i).charAt(k)).equals(" ")) {
                            finalList.get(j).add(Character.toString(lines.get(i).charAt(k)));
                        }
                        k+=4;
                    }
                }
            }
            if(line.startsWith("move")){
                // 1 - 3 - 5
                String[] numbers = line.split(" ");
                int start = Integer.parseInt(numbers[1]);
                int from = Integer.parseInt(numbers[3]);
                int to = Integer.parseInt(numbers[5]);

                //PART 1
                /*for (int i = start-1; i >= 0; i--) {
                    finalList.get(to-1).addFirst(finalList.get(from-1).get(0));
                    finalList.get(from-1).removeFirst();
                }*/

                //PART 2

                for (int i = start-1; i >= 0; i--) {
                    finalList.get(to-1).addFirst(finalList.get(from-1).get(i));
                    finalList.get(from-1).remove(i);
                }
            }
        }
        for (LinkedList<String> list: finalList) {
            for (String s : list) {
                System.out.print(s);
                break;
            }
        }
    }
}
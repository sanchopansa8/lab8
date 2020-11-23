import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("to");
        list.add("everyone");

        ArrayList<Integer> lengths = new ArrayList<>();

        for(String word : list){
            lengths.add(word.length());
        }
        Collections.sort(lengths);
        System.out.println(lengths);
    }
}

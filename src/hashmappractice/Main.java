package hashmappractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void gerneric(){
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("Generric: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box: " + integerBox.getContent());
        Integer[] intarry = {1,2,3,4};
        String[]strArry = {"A","B", "C", "D"};
        prinArray(intarry);
        prinArray(strArry);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        for(Integer item : integerList){
            System.out.println(item);
        }
        Pair<String, Integer> pair = new OrderedPair<>("Age", 25);

        System.out.println("Key: " + pair.getkey() + ", Value: " + pair.getValue());
    }
    public static <T> void prinArray(T[] array)
    {
        for(T element : array){
            System.out.println(element + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        gerneric();
    }
}

package ExampleCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        //Truy cập phần tử
        System.out.println(colors.get(1));

        //Thay đổi phần tử tại vị trí chỉ định
        colors.set(0, "Red");
        System.out.println(colors);

        //Xoá phần tử theo giá trị
        colors.remove("Red");
        System.out.println(colors);
        //Xoá phần tử theo index
        colors.remove(1);

        for(String color: colors){
            System.out.println(color);
        }

        //Tạo 1 mảng

        String [] colorArray = {"Red", "Green", "Blue"};

        //Tạo 1 ArrayList từ mảng
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colorArray));

        Collections.sort(colorsList);

        Collections.sort(colorsList, (s1,s2) -> s1.compareTo(s2));

        System.out.println(colorsList);
        Long x = 1L;
        Long y = -2L;
        System.out.println(Long.compare(x,y)==1?"Yes":"No");
        System.out.println(Long.compareUnsigned(x,y));

    }
}

package ExampleCollection;

import com.sun.jdi.IntegerValue;
import services.Service;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {ArrayList<Point> listP = new ArrayList<>();

//        listP.add(new Point(3, 6));
//        listP.add(new Point(3, 7));
//        listP.add(new Point(5, 2));
        listP.add(new Point(3, 4));
        listP.add(new Point(7, 2));
        listP.add(new Point(2, 6));
        listP.add(new Point(7, 1));
        Comparator<Point> xyCompare = new Comparator<Point>() {
            @Override
//            public int compare(Point o1, Point o2) {
//                return Integer.compare(o1.getX(), o2.getX());
//            }
//            public int compare(Point o1, Point o2) {
//                int imp  = Integer.compare(o1.getX(), o2.getX());
//                if(imp == 0){
//                    return Integer.compare(o1.getY(), o2.getY());
//                }
//                return imp;
//            }
            public int compare(Point o1, Point o2) {
                return Integer.compare(o1.getX() + o1.getY(), o2.getX() + o2.getY());
            }
        };
        Collections.sort(listP, xyCompare);
        for (Point p : listP) {
            System.out.println(p);
        }

        //=====================================
        //Predicate trả về boolean
        System.out.println("===================Predicate");
        Predicate<Point> SumPoint = point -> point.getX() + point.getY() > 7;
        Predicate<Point> SumPoint2 = point -> {
            if (point.getX() > 5) {
                return point.getX() + point.getY() > 7;
            } else {
                return point.getX() + point.getY() > 6;
            }
        };
        for (Point point : listP) {
            if (SumPoint.test(point)) {
                System.out.println(point);
            }
        }
        //=====================================
        System.out.println("=====================================sumpoint3,4");
        Function<Point, Integer> SumPoint3 = point -> point.getX() + point.getY();
        Function<Point, Integer> SumPoint4 = point -> {
            return point.getX() > point.getY() ? point.getY() - point.getX() : point.getX() - point.getY();
        };
        for (Point point : listP) {
            System.out.println(SumPoint3.apply(point));
        }
        System.out.println("=====================Consumer");
        Consumer<Point> printmessage = point -> {
            if (point.getX() > point.getY()) {
                System.out.println(point.getY() - point.getX());
            } else {
                System.out.println(point.getY() + point.getX());
            }
        };
        listP.forEach(printmessage);
        System.out.println("=====================");
        for (Point point : listP) {
            if (point.getX() > 3) {
                System.out.println(point);
            }
        }
        System.out.println("=====================");
        listP.stream()
                .filter(point -> point.getX() > 3)
                .forEach(System.out::println);
        System.out.println("=====================");
        for (Point point : listP) {
            if (point.getX() > 3) {
                System.out.println(point);
            }
        }
        System.out.println("=====================Predicate");
        Predicate<Point> pre_x = point -> point.getX() > 3;
        for (Point point : listP) {
            if (pre_x.test(point)) {
                System.out.println(point.toString());
            }
        }
        System.out.println("=====================Consume");
        Consumer<Point> consumer = c -> {
            if (c.getX() > 3) {
                System.out.println(c);
            }
        };
        listP.forEach(consumer);

        System.out.println("=====================");
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Anna");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("=====================");
        List<String> ListName = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ListName);
        System.out.println("=====================Uppercase with filter");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("=====================Sort asc");
        names.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("=====================Sort reverse order desc");
        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("=====================Sum");
        int sum = listNumber.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
        System.out.println("=====================AVG");
        double avg = listNumber.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("AVG: " + avg);
        System.out.println("=====================Highest num");
        OptionalInt max = listNumber.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Highest num: "+ (max.isPresent()?max.getAsInt():"Not present"));
        System.out.println("=====================Lowest num");
        OptionalInt min = listNumber.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Lowest num: " + (min.isPresent()?min.getAsInt():"NotPresent"));
        System.out.println("=====================Sum num");
        int sum1 = listNumber.stream()
                .reduce(0,Integer::sum);
        System.out.println("Sum: " + sum1);
        System.out.println("=====================* num");
        int product = listNumber.stream()
                .reduce(1,(result, item) ->  result*item);
        System.out.println("Product using reduce: " + product);

        System.out.println("=====================Matrix");
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("a","b","c"),
                Arrays.asList("d","e","f"),
                Arrays.asList("g","h","i")
        );
        List<String> combineList = listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(combineList);

        Double num1 = listNumber.stream()
                        .mapToDouble(Integer::doubleValue)
                        .reduce( 0.0, (result, item) -> result+(1/item));
        System.out.println("Product using reduce: " + num1);

//        ================================================
        System.out.println("==========================");
        listP.stream()
                .filter(point -> point.getX() > 4)
                .mapToInt(point -> {
                    return point.getX() * point.getX() + 1 - point.getY();
                })
                .forEach(System.out::println);

        long total5 = listP.stream()
                .mapToLong(p->{
                    return p.getX()* p.getX() + 1 - p.getY();
                })
                .reduce(1L,(kq,item)->kq*item);
        System.out.println("Total5: " + total5);

        double totalProduct = listP.stream()
                .mapToDouble(p -> {
                    int x = p.getX();
                    int y = p.getY();
                    double tmp = x * x * y;
                    return 1/tmp;
                })
                .reduce(1.0,(res,item) -> res * item);
        System.out.println("Tích toàn bộ giá trị của 1 / (x^2 + y): "+totalProduct);

        //in ra danh sch 7
        listP.stream()
                .filter(p-> p.getY() + p.getX() > 7)
                .forEach(System.out::println);

        listP.stream()
                .filter(p-> p.getX()>5 && p.getY()>1)
                .forEach(System.out::println);

       int sum5= listP.stream()
                .mapToInt(point -> {
                    return point.getX() + point.getX();
                })
               .sum();
        System.out.println("sum: "+ sum5);


    }
}

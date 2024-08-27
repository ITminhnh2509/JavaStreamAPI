package hashmappractice;

import ExampleCollection.Point;

import java.util.*;
import java.util.stream.Collectors;

public class HashMap1 {
    public static void test1(){
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington D.C");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");

        //Kiểm tra sự tồn tại của một khoá
        System.out.println("Kiểm tra sự tồn tại của một khoá");
        if(map.containsKey("France")){
            System.out.println("Capital of France: " + map.get("France"));
        }

        //Kiểm tra sự toonf tại của một giá trị
        System.out.println("Kiểm tra sự toonf tại của một giá trị");
        if(map.containsValue("Tokyo")){
            System.out.println("Tokyo is in the map.");
        }

        //Xoá một tử
        System.out.println("Xoá một tử");
        map.remove("Japan");
        System.out.println("##################");

        // In ra các pần tử còn lại trong hashmap
        System.out.println("In ra các pần tử còn lại trong hashmap");
        for (String key: map.keySet()){
            System.out.println(key + ": " + map.keySet());
        }
        System.out.println("##################");

        // Lặp qua các cặp giá trị bằng cách sử dụng entryset()
        System.out.println("Lặp qua các cặp giá trị bằng cách sử dụng entryset()");
        for(Map.Entry<String, String> entry:map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Country: "+key + ", Capital: " + value);
        }
        System.out.println("##################");
        //Lấy giá trị với khoá có sẵn
        System.out.println("Lấy giá trị với khoá có sẵn");
        System.out.println("Value for key USA: "+map.getOrDefault("USA","Not Found"));

        //Cập nhật giá trị nếu khoá có mặt (thay đổi kiểu gi trị từ paris -> Paris (update))
        System.out.println("Cập nhật giá trị nếu khoá có mặt (thay đổi kiểu gi trị từ paris -> Paris (update))");
        map.computeIfPresent("France",(k, v) -> v + " (Update)");
        System.out.println("Update France capital: "+map.get("France"));
    }
    public static void test2 (){
        String s = "xin chào xin xin chào phố phường bao phường phố";
        HashMap<String, Integer> map = new HashMap<>();
        String [] words = s.split(" ");
        for(String x: words){
            int count = map.getOrDefault(x, 0);
            map.put(x, count+1);
        }
        for(String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
    public static void test3(){
        String s = "xin chào xin xin chào phố phường bao phường phố";
        HashMap<String, Integer> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
    public static void test4(){
        // Tạo mốt hashmap ể lưu trữ từ điển
        HashMap<String, String> dictionary = new HashMap<>();

        //Thêm một số từ và định nghĩa từ từ điển

        dictionary.put("apple", "a round fruit with firm, white flesh and a green, red, or yellow skin");
        dictionary.put("banana", "a long, curved fruit with a yellow skin and soft, sweet, white flesh inside");
        dictionary.put("cherry", "a small, round, soft red or black fruit with a single hard seed in the middle, or the tree on which the fruit grows");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập tra cứu");
        String find = scanner.nextLine();
        String result = dictionary.get(find);
        if(result != null){
            System.out.println(find + ": " + result);
        } else {
            System.out.println("Not Found");
        }
    }
    public static void test5_stream(){
        Map<String, Integer> map = new HashMap<>();

        map.put("USA", 3);
        map.put("France", 7);
        map.put("Japan", 2);
        map.put("VietNam", 25);

        System.out.println("###################");

        //in ra các phần tử còn lại trong HashMap
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("###################");
        //in ra các phần tử còn lại trong HashMap
        map.entrySet().stream()
                .forEach(item -> {
                    System.out.println(item.getKey() +": " +item.getValue());
                });
        System.out.println("###################");

        //Tính tổng số lượng các công ty
        int kq = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + kq);
        System.out.println("###################");

        //Lọc các công ty
        Map<String , Integer> newMap = map.entrySet().stream()
                .filter(item -> item.getValue() >5)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry->entry.getValue()));
        System.out.println(newMap);
    }
    public static void test_LinkedHashMap(){
        Map<String, Integer> linkedHasHMap = new LinkedHashMap<>();

        linkedHasHMap.put("one", 1);
        linkedHasHMap.put("two", 2);
        linkedHasHMap.put("three", 3);

        linkedHasHMap.put("two", 22);

        for (Map.Entry<String, Integer> entry : linkedHasHMap.entrySet()){
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }
    }

    public static void test_treemap(){
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("banana", 2);
        treeMap.put("apple",3);
        treeMap.put("cherry", 1);

        for(Map.Entry<String, Integer> entry: treeMap.entrySet())
            System.out.println(entry.getKey()+": " + entry.getValue());

        TreeMap<String, Integer> ageMap = new TreeMap<>();

        ageMap.put("John", 30);
        ageMap.put("Jane", 25);
        ageMap.put("Paul", 35);
        ageMap.put("Anna", 28);
        System.out.println("#########################");

        for (Map.Entry<String,Integer> entry : ageMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("#########################");
        System.out.println("First key: " + ageMap.firstKey());
        System.out.println("Last Key: " + ageMap.lastKey());
        System.out.println("SubMap from 'Anna' to 'Paul': "+ageMap.subMap("Anna","Paul"));
    }
        public static void test_hashCodepoint(){
            Map<Point, String> pointMap = new HashMap<>();
            Point p1 = new Point(1,2);
            Point p2 = new Point(1,2);
            Point p3 = new Point(3,4);

            pointMap.put(p1, "Point 1");
            pointMap.put(p2, "Point 2");
            pointMap.put(p3, "Point 3");

            System.out.println("Map containts p2: " + pointMap.containsKey(p2));
            System.out.println("Map content: " + pointMap);
        }
        public static void test_hashCodePerson(){
            Person person1= new Person("Alice", 30);
            Person person2 = new Person("Alice" ,30);
            Person person3 = new Person("Bob" ,25);

            Map<Person, Integer> map = new HashMap<>();
            map.put(person1, 1);
            map.put(person3,3);
            System.out.println("Map containts p2: " + map.containsKey(person2));
            System.out.println("Map content: " + map);
        }
        public static void test_optional(){
            Optional<String> optionalValue = Optional.of("Hello, World!");
            Optional<String> emptyOptional = Optional.empty();

            System.out.println("OptionalValue is present: " + emptyOptional.isPresent());
            optionalValue.ifPresent(value -> System.out.println("Value: " + value));

            String value =emptyOptional.orElse("Default Value");
            System.out.println("Value of Default: "+value);

            String generatedValue = emptyOptional.orElseGet(()->"Generate Default Value.");
            System.out.println("Generated Value: " + generatedValue);

            try {
                String result = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
            } catch (Exception e){
                System.out.println("Caught exception: " + e.getMessage());
            }

        }
    public static void main(String[] args) {
        test_hashCodePerson();
    }
}

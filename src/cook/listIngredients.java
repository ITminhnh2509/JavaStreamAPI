package cook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class listIngredients {

    List<Ingredients> arr;
    public listIngredients(){
        arr = new ArrayList<>();
    }
//    public void nhapNguyenLieu(){
//        Scanner sc = new Scanner(System.in);
//        int quantity = 0;
//
//        System.out.printf("Nhập số lượng gà: ");
//        quantity = sc.nextInt();
//        sc.nextLine();
//        Ingredients chicken = new Chicken();
//        chicken.setQuantity(quantity);
//        arr.add(chicken);
//
//        System.out.printf("Nhập số lượng Hạt sen: ");
//        quantity = sc.nextInt();
//        sc.nextLine();
//        Ingredients seed = new lotusSeeds();
//        seed.setQuantity(quantity);
//        arr.add(seed);
//
//        System.out.printf("Nhập số lượng Cà rốt: ");
//        quantity = sc.nextInt();
//        sc.nextLine();
//        Ingredients carrot = new Carrot();
//        carrot.setQuantity(quantity);
//        arr.add(carrot);
//
//        System.out.printf("Nhập số lượng Jujube: ");
//        quantity = sc.nextInt();
//        sc.nextLine();
//        Ingredients jujube = new Jujube();
//        jujube.setQuantity(quantity);
//        arr.add(jujube);
//
//        System.out.printf("Nhập số lượng nấm đông cô: ");
//        quantity = sc.nextInt();
//        sc.nextLine();
//        Ingredients mushroom = new ShiitakeMushrooms();
//        mushroom.setQuantity(quantity);
//        arr.add(mushroom);
//
//
//    }
public void nhapNguyenLieu() {
    Scanner sc = new Scanner(System.in);

    List<Ingredients> ingredients = Arrays.asList(
            new Chicken(), new lotusSeeds(), new Carrot(), new Jujube(), new ShiitakeMushrooms()
    );

    ingredients.stream()
            .forEach(ingredient -> {
                System.out.printf("Nhập số lượng %s: ", ingredient.getNameIngredient());
                ingredient.setQuantity(sc.nextInt());
                sc.nextLine();
                arr.add(ingredient);
            });
}

    public void xuatList(){
        arr.stream()
                .forEach(ingredients -> ingredients.Xuat());

    }

    public void chiSoQuyDinh(){
        Scanner scanner = new Scanner(System.in);
        int carb, fat,saturedfat, protein,calo =0;
        System.out.println("Nhập chỉ số carb: ");
        carb = scanner.nextInt();
        System.out.println("Nhập chỉ số fat: ");
        fat = scanner.nextInt();
        System.out.println("Nhập chỉ số saturedfat: ");
        saturedfat = scanner.nextInt();
        System.out.println("Nhập chỉ số protein: ");
        protein = scanner.nextInt();
        System.out.println("Nhập chỉ số calo: ");
        calo = scanner.nextInt();
        scanner.nextLine();

    }
    public void cau2(){
        Scanner sc = new Scanner(System.in);
        List<Ingredients> ingredients = Arrays.asList(
                new Chicken(), new lotusSeeds(), new Carrot(), new Jujube(), new ShiitakeMushrooms()
        );

        ingredients.stream()
                .forEach(ingredient -> {
                    System.out.printf("Nhập số lượng %s: ", ingredient.getNameIngredient());
                    ingredient.setQuantity(sc.nextInt());
                    sc.nextLine();
                    arr.add(ingredient);
                });

        System.out.println("=====================================");
        arr.forEach(ingredient -> ingredient.Xuat());
        System.out.println("=====================================");
        int sumCarb = arr.stream()
                .mapToInt(ca -> ca.getQuantity() * ca.getCarb())
                .sum();
        int sumFat = arr.stream()
                .mapToInt(ca -> ca.getQuantity() * ca.getCarb())
                .sum();
        int sumbSFat = arr.stream()
                .mapToInt(ca -> ca.getQuantity() * ca.getSaturatedFat())
                .sum();
        int sumProtein = arr.stream()
                .mapToInt(ca -> ca.getQuantity() * ca.getProtenin())
                .sum();
        int sumCalo = arr.stream()
                .mapToInt(ca -> ca.getQuantity() * ca.getCalo())
                .sum();

        int carb, fat,saturedfat, protein,calo =0;
        System.out.printf("Nhập chỉ số carb: ");
        carb = sc.nextInt();
        System.out.printf("Nhập chỉ số fat: ");
        fat = sc.nextInt();
        System.out.printf("Nhập chỉ số saturedfat: ");
        saturedfat = sc.nextInt();
        System.out.printf("Nhập chỉ số protein: ");
        protein = sc.nextInt();
        System.out.printf("Nhập chỉ số calo: ");
        calo = sc.nextInt();
        System.out.println("=====================================");
        if(carb <= sumCarb*0.8) {
            System.out.println("Carb trong quy định còn thiếu chất: " + (sumCarb*0.8 - carb));
        }else if(carb == sumCarb*0.8){
            System.out.println("Carb: Perfect");
        }
        else {
            System.out.println("Carb ngoài quy định dư  chất: -" + (carb*0.8 - sumCarb*0.8));
        }

        if(fat <= sumFat*0.8){
            System.out.println("fat trong quy định còn thiếu chất: " + (sumFat*0.8 - fat));
        } else if(fat == sumFat*0.8){
            System.out.println("fat: Perfect");
        }
        else {
            System.out.println("Carb ngoài quy định dư chất: -" + (fat - sumFat*0.8));
        }

        if(saturedfat <= sumbSFat*0.8){
            System.out.println("Satured Fat trong quy định");
        }
        else if(saturedfat == sumbSFat*0.8){
            System.out.println("Satured Fat: Perfect");
        }
        else {
            System.out.println("Satured ngoài quy định dư  chất: -" + (saturedfat - sumbSFat*0.8));
        }


        if(protein <= sumProtein*0.8){
            System.out.println("Protein trong quy định còn thiếu chất: " + (sumProtein*0.8 - protein));
        }
        else if(protein == sumProtein*0.8){
            System.out.println("Protein: Perfect");
        }else {
            System.out.println("Protein ngoài quy định dư  chất: -" + (protein - sumProtein*0.8));
        }
        if(calo <= sumCalo*0.8){
            System.out.println("Calo ngoài quy định dư  chất: -" + (sumCalo*0.8-calo));
        } else if (calo == sumCalo*0.8) {
            System.out.println("Calo : Perfect");
        } else {
            System.out.println("Calo ngoài quy định dư  chất: -" + (calo - sumCalo*0.8));
        }
        System.out.println("=====================================");
    }
    final static int caloDay = 1800;
    public void cau3(){
        int sumCalo = arr.stream()
                .mapToInt(calo -> calo.getCalo() * calo.getQuantity())
                .sum();
        int phut = 0;
        if(caloDay > sumCalo){
            System.out.println("bạn cần bổ sung thêm dinh dưỡng");
        } else if (caloDay < sumCalo) {
                phut = 30*(sumCalo - caloDay) / 145;

            System.out.println("Số phút cần chạy: " + phut);

        } else {
            System.out.println("Không cần chạy Nai sừ");
        }

    }
}

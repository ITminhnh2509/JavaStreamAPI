package nhommau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachMau {
    private List<Mau> arr;
    public DanhSachMau(){
        this.arr = new ArrayList<>();
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhap số lượng người: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Lựa chojn nhóm máu sau: ");
            System.out.println("1.Nhóm máu O");
            System.out.println("2.Nhóm máu A");
            System.out.println("3.Nhóm máu B");
            System.out.println("4.Nhóm máu AB");
            System.out.print("Lựa chọn của bạn -> ");
            int c = scanner.nextInt();
            scanner.nextLine();
            if(c==1){
                Mau m = new NhomMauO();
                m.Nhap();
                arr.add(m);
            } else if(c==2){
                Mau m = new NhomMauA();
                m.Nhap();
                arr.add(m);
            } else if(c==3){
                Mau m = new NhomMauB();
                m.Nhap();
                arr.add(m);
            } else if(c==4){
                Mau m = new NhomMauAB();
                m.Nhap();
                arr.add(m);
            }
        }
    }
    public void Xuat(){
        arr.stream()
                .forEach(Mau -> {
                    Mau.Xuat();
                    System.out.println("\n");
                });
    }
    public void cau3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn 1 người nhận máu");
        int index = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < arr.size();i++){
            if(i != index){
                if(this.arr.get(i).kiemtraMauCho(this.arr.get(index))){
                    System.out.printf("Bạn thứ %d có thể cho máu bạn thứ %d nhé \n",i, index);
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Không có ai để cho máu");
        }
    }
    public static void main(String[] args) {
        DanhSachMau ds = new DanhSachMau();
        ds.Nhap();
        ds.Xuat();
        Mau me = new NhomMauA();
        Mau cha = new NhomMauAB();
        Mau con = new NhomMauB();
        ds.cau3();
        if(me.kiemTraDiTruyen(cha,con)){
            System.out.println("Chúng ta là gia đình!!!");
        } else {
            System.out.println("Bạn là ai ?");
        }

    }
}

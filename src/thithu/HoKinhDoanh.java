package thithu;

import java.util.Scanner;

public final class HoKinhDoanh extends KhachHang {
    String linhVucKinhDoanh;


    public HoKinhDoanh() {
        super();
    }
    @Override
    public Long tinhTienDien(){
        Long tinhTienDien = tinhSoKW() * 3000L;
        if(linhVucKinhDoanh.equals("Công ty nhà nước".toLowerCase())){
         return (long) (tinhTienDien + (tinhTienDien * 0.1) - (tinhTienDien* 0.05));
    } else {
        return (long) (tinhTienDien + (tinhTienDien * 0.1));
    }
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Lĩnh vực kinh doanh: " + this.linhVucKinhDoanh);
    }

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        int chon;
        System.out.println("Chọn (số) lĩnh vực kinh doanh: ");
        System.out.println("1. Nhà hàng");
        System.out.println("2. Khách sạn");
        System.out.println("3. Công ty tư nhân");
        System.out.println("4. Công ty nhà nước");
        System.out.print("Lựa chọn: ");
        chon = sc.nextInt();
        switch (chon){
            case 1 -> this.linhVucKinhDoanh = "Nhà hàng".toLowerCase();
            case 2 -> this.linhVucKinhDoanh = "Khách sạn".toLowerCase();
            case 3 -> this.linhVucKinhDoanh = "Công ty tư nhân".toLowerCase();
            case 4 -> this.linhVucKinhDoanh = "Công ty nhà nước".toLowerCase();
        }
    }
}

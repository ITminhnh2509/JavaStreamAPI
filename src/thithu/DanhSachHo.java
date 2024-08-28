package thithu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHo {
    private final List<KhachHang> arr;

    public DanhSachHo() {
        arr = new ArrayList<>();
    }
    public void Nhap(){
        int sl;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lượng hộ cần nhập: ");
        sl = scanner.nextInt();
        while (sl >0){
            System.out.println("Hộ của bạn là (so): ");
            System.out.println("1. Hộ gia đình");
            System.out.println("2. Hộ kinh doanh");
            System.out.print("Lựa chọn của bạn: ");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1 -> {
                    KhachHang kh = new HoBinhThuong();
                    kh.Nhap();
                    arr.add(kh);
                }
                case 2 ->{
                    KhachHang kh = new HoKinhDoanh();
                    kh.Nhap();
                    arr.add(kh);
                }
            }
            sl--;
            System.out.println("########################");
        }
    }
    public void DanhSachThongtinCacHo(){

        System.out.println("Danh sách thông tin các Hộ");
        arr.forEach(KhachHang::Xuat);
        System.out.println("########################");
    }
    public void DanhSachTongtienCacHo(){
        System.out.println("Tổng tiền các Hộ");
        long kq =arr.stream()
                .mapToLong(KhachHang::tinhTienDien)
                .sum();
        System.out.println("Tổng tiền tất cả hộ là: " + kq);
        System.out.println("########################");
    }
    public int SuDungDienLonNhat(){
        int sudunglonnhat = 0;
        for (KhachHang kh : arr){
            if(kh instanceof HoKinhDoanh){
                if(kh.tinhSoKW() > sudunglonnhat){
                    sudunglonnhat = kh.tinhSoKW();
                }
            }
        }
        return sudunglonnhat;
    }
    public void HoSudungnhieunhat(){
        System.out.println("Khách hàng su dung dien lon nhat:");
        if(SuDungDienLonNhat() != 0){
            arr.stream()
                    .filter(khachHang -> khachHang.tinhSoKW() == SuDungDienLonNhat() && khachHang instanceof  HoKinhDoanh)
                    .forEach(khachHang -> {
                        System.out.println("Tên: " + khachHang.tenKH);
                        System.out.println("Lượng điện: " + khachHang.tinhSoKW());
                    });
        } else {
            System.out.println("Không có hộ kinh doanh nào!");
        }


    }
}

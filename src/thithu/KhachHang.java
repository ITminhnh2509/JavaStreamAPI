package thithu;

import java.util.Scanner;

public sealed abstract class KhachHang permits HoBinhThuong, HoKinhDoanh {
    protected String maKH;
    protected String tenKH;
    protected int chisodienCu;
    protected int chisodienMoi;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã khách hàng: ");
        this.maKH =scanner.nextLine();

        System.out.print("Nhập tên khách hàng: ");
        this.tenKH =scanner.nextLine();

        System.out.print("Nhập chỉ số điện cũ: ");
        this.chisodienCu =scanner.nextInt();


        System.out.print("Nhập chỉ số điện mới: ");
        this.chisodienMoi =scanner.nextInt();

    }

    public void Xuat(){
        System.out.println("Mã Khách hàng: " + this.maKH
                        + ", Tên khách hàng: " + this.tenKH
                        + ", Chỉ số điện cũ: " + this.chisodienCu
                        + ", Chỉ số điện mới: " + this.chisodienMoi
                        + ", Chênh lệch cu ma: " + this.tinhSoKW()
                        + ", Tiền cần thanh toán: " + this.tinhTienDien()
                );

    }
    public int tinhSoKW(){
        return this.chisodienMoi - this.chisodienCu;
    }
    public abstract Long tinhTienDien();
}

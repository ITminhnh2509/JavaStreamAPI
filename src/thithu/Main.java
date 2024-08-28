package thithu;


public class Main {
    public static void main(String[] args) {
        DanhSachHo ds = new DanhSachHo();
        System.out.println("Câu 1: ");
        ds.Nhap();
        System.out.println("Câu 2: ");
        ds.DanhSachThongtinCacHo();
        System.out.println("Câu 3:");
        ds.DanhSachTongtienCacHo();
        System.out.println("Câu 4: ");
        ds.HoSudungnhieunhat();
    }
}

package thithu;

public final class HoBinhThuong extends KhachHang{
    final static long M1 = 1500L;
    final static long M2 = 2000L;
    final static long M3 = 2800L;
    public HoBinhThuong() {
        super();
    }
    @Override
    public Long tinhTienDien() {
        int soKW = tinhSoKW();
        long tienthoanhtoan =0;
        if(soKW <=50){
            tienthoanhtoan = soKW * M1;
            return tienthoanhtoan;
        } else if (soKW <=100){
            soKW -= 50;
            tienthoanhtoan = 50 * M1 + soKW * M2;
            return tienthoanhtoan;
        } else {
            soKW -= 100;
            tienthoanhtoan = 50 * M1 + 50 * M2 + soKW * M3;
            return tienthoanhtoan;
        }
    }
}

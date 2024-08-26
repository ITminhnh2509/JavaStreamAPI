package nhommau;

import java.util.Scanner;

public abstract class Mau {
    protected boolean RH;
    protected int LoaiNhomMau;

    public static final int _O = 1;
    public static final int _A = 2;
    public static final int _B = 3;
    public static final int _AB = 4;

    public Mau() {
    }

    public boolean isRH() {
        return RH;
    }

    public void setRH(boolean RH) {
        this.RH = RH;
    }

    public int getLoaiNhomMau() {
        return LoaiNhomMau;
    }

    public void setLoaiNhomMau(int loaiNhomMau) {
        LoaiNhomMau = loaiNhomMau;
    }
    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại RH(+/-): ");
        String RH = scanner.nextLine();
        if(RH.equals("+")){
            setRH(true);
        } else if(RH.equals("-")) {
            setRH(false);
        }
    }
    public void Xuat(){
        if(this.LoaiNhomMau == _O){
            System.out.print("Nhóm Máu: O" );
        } else if(this.LoaiNhomMau == _A){
            System.out.print("Nhóm Máu: A" );
        } else if(this.LoaiNhomMau == _B){
            System.out.print("Nhóm Máu: B");
        } else if(this.LoaiNhomMau == _AB){
            System.out.print("Nhóm Máu: AB");
        }
        if(this.RH == true){
            System.out.print("+");
        } else if(this.RH == false){
            System.out.print("-");
        }
    }
    public abstract boolean kiemTraDiTruyen(Mau cha, Mau con);

    public abstract boolean kiemtraMauCho(Mau Cho);
}

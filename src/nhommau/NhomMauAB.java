package nhommau;

public class NhomMauAB extends Mau{
    public NhomMauAB(){
        this.LoaiNhomMau = _AB;
    }

    @Override
    public boolean kiemTraDiTruyen(Mau cha, Mau con) {
        if (cha.LoaiNhomMau == _A || cha.LoaiNhomMau == _B || cha.LoaiNhomMau == _AB)
            if (con.LoaiNhomMau == _A || con.LoaiNhomMau == _B || con.LoaiNhomMau == _AB) return true;
        if (cha.LoaiNhomMau == _O) if (con.LoaiNhomMau == _A || con.LoaiNhomMau == _B) return true;
        return false;
    }

    @Override
    public boolean kiemtraMauCho(Mau Cho) {
        if(this.RH == true) return true;
        else {
            if(Cho.RH == false) return true;
        }
        return false;
    }
}

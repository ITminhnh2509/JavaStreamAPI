package nhommau;

public class NhomMauO extends Mau{
    public NhomMauO(){
        this.LoaiNhomMau = _O;
    }

    @Override
    public boolean kiemTraDiTruyen(Mau cha, Mau con) {
        if (cha.LoaiNhomMau == _A)
            if (con.LoaiNhomMau == _O || con.LoaiNhomMau == _A) return true;
        if (cha.LoaiNhomMau == _B)
            if (con.LoaiNhomMau == _O ||  con.LoaiNhomMau == _B ) return true;
        if (cha.LoaiNhomMau == _AB)
            if (con.LoaiNhomMau == _A || con.LoaiNhomMau == _B ) return true;
        if (cha.LoaiNhomMau == _O)
            if (con.LoaiNhomMau == _O) return true;
        return false;
    }
    @Override
    public boolean kiemtraMauCho(Mau Cho) {
        if(this.RH == true){
            if(Cho.LoaiNhomMau == _O) return true;
            return false;
        } else {
            if(Cho.RH == false && Cho.LoaiNhomMau == _O) return true;
            return false;
        }
    }
}

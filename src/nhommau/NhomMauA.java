package nhommau;

public class NhomMauA extends Mau{
    public NhomMauA(){
        this.LoaiNhomMau = _A;
    }

    @Override
    public boolean kiemTraDiTruyen(Mau cha, Mau con) {
        if (cha.LoaiNhomMau == _A) {
            if (con.LoaiNhomMau == _O || con.LoaiNhomMau == _A) return true;
        }
        if (cha.LoaiNhomMau == _B) {
            if (con.LoaiNhomMau == _O || con.LoaiNhomMau == _A || con.LoaiNhomMau == _B || con.LoaiNhomMau == _AB)
                return true;
        }
        if (cha.LoaiNhomMau == _AB) {
            if (con.LoaiNhomMau == _A || con.LoaiNhomMau == _B || con.LoaiNhomMau == _AB) return true;
        }
        if (cha.LoaiNhomMau == _O) {
            if (con.LoaiNhomMau == _A || con.LoaiNhomMau == _O) return true;
        }
        return false;
    }
    @Override
    public boolean kiemtraMauCho(Mau Cho) {
        if(this.RH == true){
            if(Cho.getLoaiNhomMau() == _O || Cho.getLoaiNhomMau() == _A) {
                return true;
            }
            else {
                return false;
            }
        } else if(this.RH == false)
        {
            if(Cho.RH == false && Cho.LoaiNhomMau == _O || Cho.RH == false && Cho.LoaiNhomMau == _O) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}

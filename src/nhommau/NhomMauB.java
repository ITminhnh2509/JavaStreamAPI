package nhommau;

public class NhomMauB extends Mau{
    public NhomMauB(){
        this.LoaiNhomMau = _B;
    }

    @Override
    public boolean kiemTraDiTruyen(Mau cha, Mau con) {
        if (cha.LoaiNhomMau == _A || cha.LoaiNhomMau == _AB)
            if (con.LoaiNhomMau == _A || con.LoaiNhomMau == _B || con.LoaiNhomMau == _AB) return true;

        if (cha.LoaiNhomMau == _B || cha.LoaiNhomMau == _O)
            if (con.LoaiNhomMau == _O || con.LoaiNhomMau == _B)
                return true;

        return false;
    }

    @Override
    public boolean kiemtraMauCho(Mau Cho) {
        if(this.RH == true){
            if(Cho.LoaiNhomMau == _O || Cho.LoaiNhomMau == _B) return true;
            return false;
        } else {
            if(Cho.RH == false)
            if(Cho.LoaiNhomMau== _O || Cho.LoaiNhomMau == _B) return true;
            return false;
        }

    }
}

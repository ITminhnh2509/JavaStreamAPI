package services;

public class BasicService extends Service{
    private int soLop;
    public BasicService() {
        this.nameService="Basic Service";
        this.feeService = 500L;
        this.ptSupport = 100L;
        this.saunaService=false;
        this.feeEachClass=100L;
        this.soLop = soLop;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }

    @Override
    public Long tinhTien() {
        return feeService+ptSupport+(feeEachClass*soLop);
    }

    @Override
    public void Xuat() {
        super.Xuat();
    }
}

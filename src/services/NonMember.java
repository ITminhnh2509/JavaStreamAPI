package services;

public class NonMember extends Service {
    public NonMember() {
        this.nameService="Basic Service";
        this.feeService = 500L;
        this.ptSupport = 100L;
        this.saunaService=false;
        this.feeEachClass=100L;
    }


    @Override
    public void Xuat() {
        super.Xuat();
    }
}

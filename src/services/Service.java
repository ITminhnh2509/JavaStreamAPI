package services;

public class Service {
    protected String nameService;
    protected Long feeService;
    protected Long feeEachClass;
    protected boolean saunaService;
    protected Long ptSupport;

    public Long tinhTien(){
        return feeService + feeService + ptSupport;
    }

    public void Xuat(){
        System.out.println("Name service: " + this.nameService +"\n"
                            +"Fee service: " + this.feeService + "\n"
                            +"Fee each class: " + this.feeEachClass+ "\n"
                            +"Sauna serice: " + this.saunaService+ "\n"
                            +"Fee PT support: " + this.ptSupport+ "\n");
    }
}

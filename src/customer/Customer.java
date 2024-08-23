package customer;

import services.BasicService;
import services.NonMember;
import services.PremiumService;
import services.Service;

public class Customer {
    private String fullname;
    private String identity;
    private Service Service;
    private int time;

    public Customer() {
    }

    public Customer(String fullname, String identity, int time) {
        this.fullname = fullname;
        this.identity = identity;
        this.time = time;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Service getService() {
        return Service;
    }

    public void setService(Service service) {
        Service = service;
    }

    public void Nhap(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice = 0;
        System.out.printf("\nEnter your fullname: ");
        setFullname(sc.nextLine());
        System.out.printf("Enter your identity: ");
        setIdentity(sc.nextLine());
        System.out.println("These's our Service: ");
        System.out.println("Press 1. Non-Member");
        System.out.println("Press 2. Basic Service");
        System.out.println("Press 3. Premium Service");
        System.out.println("===========================");
        System.out.printf("Your choice is: ");
        choice = sc.nextInt();
        sc.nextLine();
        if(choice == 1){
            Service sc1 = new NonMember();
            setService(sc1);
        } else if (choice == 2){
            Service sc2 = new BasicService();
            setService(sc2);
        } else if (choice == 3){
            Service sc3 = new PremiumService();
            setService(sc3);
        }
        System.out.printf("Your time(month) with service is: ");
        setTime(sc.nextInt());
        sc.nextLine();
    }
    public void Xuat(){
        System.out.println("===========================");
        this.Service.Xuat();
        System.out.println("Name: " + this.fullname+"\n"
                + "Identity: " + this.identity+"\n"
                + "Month: " + this.time+"\n"
                + "Total price: " + TongTien() + "\n" );

    }
    public Long TongTien(){
        return Service.tinhTien();
    }
}

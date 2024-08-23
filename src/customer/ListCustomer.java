package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCustomer {
    private List<Customer> list;
    public ListCustomer(){
        list = new ArrayList<>();
    }
    public void NhapDanhSach(){
        Scanner sc = new Scanner(System.in);
        int flag=1;
        while(flag!=3){
            System.out.println("===========================");
            System.out.println("Lập danh sách khách hàng:");
            System.out.println("1. Tạo khách hàng");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Exit");
            System.out.printf("Your choice: ");
            flag = sc.nextInt();
            if(flag == 1){
                Customer cs = new Customer();
                cs.Nhap();
                list.add(cs);
            } else if (flag == 2){
                for(Customer cs1: this.list){
                    cs1.Xuat();
                }
            }
        }
    }
    public Long maxTien(){
        Long max = 0L;
        for(Customer cs1:this.list){
            if(max < cs1.TongTien()){
                max = cs1.TongTien();
            }
        }
        return max;
    }

    public void cau4(){
        System.out.println("====================");
        System.out.println("Danh sáhc khách hàng max");
        Long maxTien = maxTien();
        for(Customer cs : this.list){
            Long kq = cs.TongTien();
            if(maxTien.equals(kq)){
                cs.Xuat();
            }
        }
    }
}

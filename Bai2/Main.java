package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<KhachHangVN> arrKHVN = new ArrayList<>();
        ArrayList<KhachHangNG> arrKHNG = new ArrayList<>();
        int soKHVN = 0, soKHNG = 0;
        double tongTienKH =0 ;
        System.out.print("Nhap so khach hang VN : ");
        soKHVN= input.nextInt();
        System.out.print("Nhap so khach hang nuoc ngoai : ");
        soKHNG = input.nextInt();
        System.out.println("---------Nhap thong tin khach hang VN:---------");
        for ( int i = 0 ; i < soKHVN  ;i ++){
                System.out.println("Nhap thong tn khach hang - " + (i+1) + ":");
                    KhachHangVN KHVN = new KhachHangVN();
                    KHVN.nhap();
                    arrKHVN.add(KHVN);
        }
        System.out.println("---------Nhap thong tin khach hang Nuoc ngoai---------");
        for ( int i = 0 ; i < soKHNG  ;i ++){
            System.out.println("Nhap thong tn khach hang - " + (i+1) + ":");
                KhachHangNG KHNG = new KhachHangNG();
                KHNG.nhap();
                arrKHNG.add(KHNG);
    }
    }
}

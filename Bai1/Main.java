package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<GiaoDichDat> arrGDD = new ArrayList<>();
        ArrayList<GiaoDichNha> arrGDN = new ArrayList<>();
        int soGDD = 0, soGDN =0 ;
        double tongGDD = 0 , tongGDN = 0 , TBThanhTien = 0;
        System.out.print("Nhap so giao dich dat : ");
        soGDD = input.nextInt();
        System.out.print("Nhap so giao dich nha : ");
        soGDN = input.nextInt();
        System.out.println("Nhap thong tin giao dich dat  :");
        for ( int i = 0 ; i < soGDD  ;i ++){
            System.out.println("Nhap thong tin giao dich dat thu " + (i+1) + ":");
                GiaoDichDat GDD = new GiaoDichDat(null);
                GDD.nhap();
                arrGDD .add(GDD);
        }
        System.out.println("Nhap thong tin giao dich nha ");
        for ( int i = 0 ; i < soGDN  ;i ++){
            System.out.println("Nhap thong tin giao dich nha thu " + (i+1) + ":");
                GiaoDichNha GDN = new GiaoDichNha(null, null);
                GDN.nhap();
                arrGDN .add(GDN);
        }
        System.out.println("---------------------------THONG TIN GIAO DICH DAT---------------------------");
        for (int i = 0 ;i <arrGDD.size(); i++ ){
            System.out.println(arrGDD.get(i).toString());
        }

        System.out.println("---------------------------THONG TIN GIAO DICH NHA---------------------------");
        for (int i = 0 ;i <arrGDN.size(); i++ ){
            System.out.println(arrGDN.get(i).toString());
        }
        for ( int i = 0 ; i < arrGDN.size() ; i++ ){
            if ( arrGDD.get(i).getLoaiDat().equalsIgnoreCase("A")){
                tongGDD += arrGDD.get(i).getDienTich() * arrGDD.get(i).getDonGia() * 1.5;
            }else if (arrGDD.get(i).getLoaiDat().equalsIgnoreCase("B")||
                arrGDD.get(i).getLoaiDat().equalsIgnoreCase("C")){
                tongGDD += arrGDD.get(i).getDienTich() * arrGDD.get(i).getDonGia();
            }

        }
        TBThanhTien = tongGDD / (arrGDD.size());
        System.out.println("So tien trung binh cua giao dich dat : "+tongGDD);   
        
    }

   
}

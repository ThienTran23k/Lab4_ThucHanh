package Bai1;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;
    private int chon;
    public GiaoDichNha(){
        super();
    }
    public GiaoDichNha(  String loaiNha,String diaChi){
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public String getLoaiNha() {
        return loaiNha;
    }
    public void nhap(){
        super.nhap(null);
        System.out.print("Nhap dia chi : ");
        diaChi = input.next();
        System.out.print("Nhap loai nha :  0 la cao cap ,  1 la thuong");
        chon = input.nextInt();
        switch(chon){
            case 0:
                loaiNha = "cao cap";
                break;
            case 1 :
                loaiNha = "thuong";
                break;
            default :
                System.out.print("Nhap sai");
                break;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " , loai nha : " + loaiNha + " , dia chi : " + diaChi;
    }



}

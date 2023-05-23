package Bai1;

import java.sql.Date;
import java.util.Scanner;

public class GiaoDich {
    Scanner input = new Scanner(System.in);
    private String maGiaoDich;
    private String ngayGiaoDich;
    private double donGia;
    private double dienTich;
    public GiaoDich(){
        super();
    }
    public GiaoDich(String maGiaoDich,String ngayGiaoDich,double donGia ,double dienTich){
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich ;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public double tinhTienNhaCaoCap(){
        return dienTich * donGia;
    }
    public double tinhTienNhaThuong(){
        return dienTich * donGia * 0.9;
    }
    public String toString(){
        return "Ma giao dich : " + maGiaoDich + " ,Ngay giao dich : " + ngayGiaoDich +" ,Don gia : " + donGia + " , Dien tich : " + dienTich;
    }
    public void nhap(GiaoDichDat gdd) {
        System.out.print("Nhap ma giao dich: ");
        maGiaoDich = input.next();
        System.out.print("Nhap ngay giao dich - ngay - thang - nam ");
        ngayGiaoDich = input.next();
        System.out.print("Nhap don gia ");
        donGia = input.nextDouble();
        System.out.print("Nhap dien tich ");
        dienTich = input.nextDouble();
        }
        

}

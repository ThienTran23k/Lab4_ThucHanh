package Bai2;

import java.util.Scanner;

public class KhachHang {
    Scanner input = new Scanner(System.in);
    String MaKH;
    String hoTen;
    String ngayHD;
    double donGia;
    double soLuong;
    public KhachHang(){
        super();
    }
    public KhachHang(  String MaKH , String hoTen , String ngayHD , double donGia , double soLuong){
        this.MaKH =MaKH;
        this.hoTen = hoTen;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setMaKH(String maKH) {
        MaKH = maKH;
    }
    public String getMaKH() {
        return MaKH;
    }
    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }
    public String getNgayHD() {
        return ngayHD;
    }
    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    public double getSoLuong() {
        return soLuong;
    }
    public String toString(){
        return "Ma Khach hang : "+ MaKH + " , Ho ten : " + hoTen + " , Ngay xuat hoa don : "+ ngayHD + " , Don gia : "+donGia + " ,So luong :" + soLuong;
    }
    public void nhap() {
        System.out.print("Nhap ma khach hang : ");
        MaKH = input.next();
        System.out.print("Nhap ho ten Khach hang : ");
        hoTen = input.next();
        System.out.print("Nhap ngay xuat hoa don :");
        ngayHD = input.next();
        System.out.print("Nhap don gia :");
        donGia = input.nextDouble();
        System.out.print("Nhap So luong : ");
        soLuong = input.nextDouble();
    }
    
}

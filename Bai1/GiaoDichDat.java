package Bai1;

import java.sql.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    
    public GiaoDichDat(){
        super();
    }
    public GiaoDichDat(String loaiDat){
        super();
        this.loaiDat = loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public String getLoaiDat() {
        return loaiDat;
    }
    public void nhap() {
        super.nhap(null);
        System.out.print("Nhap dat  A/B/C");
        loaiDat = input.next();
    }
    public String toString() {
        return super.toString() + ", loai dat : " + loaiDat;
    }

}

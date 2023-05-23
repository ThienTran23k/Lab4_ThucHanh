package Bai2;

public class KhachHangVN extends KhachHang  {
    String DoiTuongKH;

    double dinhMuc;
    public KhachHangVN(){
        super();
    }
    public KhachHangVN( String DoiTuongKH,double dinhMuc){
        super();
        this.DoiTuongKH = DoiTuongKH;

        this.dinhMuc = dinhMuc;
    }
    public void setDoiTuongKH(String doiTuongKH) {
        DoiTuongKH = doiTuongKH;
    }
    public String getDoiTuongKH() {
        return DoiTuongKH;
    }
    public void setDinhMuc(double dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public double getDinhMuc() {
        return dinhMuc;
    }
    public double thanhTien1(){
        double thanhTien = donGia *dinhMuc;   
        return thanhTien;
    }
    public double thanhTien2(){
        double thanhTien2 = soLuong * donGia *dinhMuc ;
        return thanhTien2;
    }
    
    
}

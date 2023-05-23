package Bai2;

public class KhachHangNG  extends KhachHang{
    String quocTich;

    public KhachHangNG (){
        super();
    }
    public KhachHangNG(String quocTich){
        super();
        this.quocTich = quocTich;
    }
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public String getQuocTich() {
        return quocTich;
    }
    public double thanhTien(){
        return soLuong * donGia;
    }

}

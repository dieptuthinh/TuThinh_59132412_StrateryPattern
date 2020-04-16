package app.Lop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    public String hoTen;
    public Date ngaySinh;
    public float diemTB;


	public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
	}


	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
    }
    
    public String getThongTin() {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyy");
        return "Họ tên: " + hoTen + ", ngày sinh: " + formaterDate.format(ngaySinh) + ", điểm TB: " + diemTB;
    }

    
}
package app.Lop;

import java.util.ArrayList;

import app.Interface.ISoSanh;

public class QLSV {
    private ArrayList<SinhVien> dsSV = new ArrayList<>();
    private ISoSanh<SinhVien> iSoSanh;

    public ArrayList<SinhVien> getDS() {
        return dsSV;
    }

    public void setDS(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public ISoSanh<SinhVien> getiSoSanh() {
        return iSoSanh;
    }

    public void setiSoSanh(ISoSanh<SinhVien> iSoSanh) {
        this.iSoSanh = iSoSanh;
    }

    public void sapXep() {
        dsSV.sort((a, b) -> iSoSanh.soSanh((SinhVien)a, (SinhVien)b));
    }
 
    public void inDS() {
        dsSV.forEach(sv -> System.out.println( sv.getThongTin()));
    }

    
}
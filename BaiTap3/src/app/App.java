package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import app.Lop.*;
import app.Interface.SoSanhTheoDiem;
import app.Interface.SoSanhTheoTen;

public class App {
    public static void main(String[] args) throws ParseException {
        QLSV qlsv = new QLSV();
        ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");

        SinhVien sv1 =new SinhVien("Ngo Nguyen Tuong Nghi",formaterDate.parse("1/1/1999"),10.0f);
        SinhVien sv2 = new SinhVien("Tran Thanh Thi",formaterDate.parse("2/2/1999"),9.0f);
        SinhVien sv3 = new SinhVien("Tan Phuong Thanh",formaterDate.parse("3/3/1999"),7.5f);
        SinhVien sv4 = new SinhVien("Bui Xuan Huan",formaterDate.parse("4/4/1999"),5.5f);

        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        sv.add(sv4);

        SoSanhTheoDiem Diem = new SoSanhTheoDiem();
        SoSanhTheoTen Ten = new SoSanhTheoTen();

        qlsv.setDS(sv);

        qlsv.setiSoSanh(Ten);
        qlsv.sapXep();
        System.out.println("Danh sach sap xep theo ten Sinh Vien : ");
        qlsv.inDS();

        qlsv.setiSoSanh(Diem);
        qlsv.sapXep();
        System.out.println("Danh sach sap xep theo diem Sinh Vien : ");
        qlsv.inDS();
        
    }
}
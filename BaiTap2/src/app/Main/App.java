package app.Main;

import java.util.ArrayList;

import app.DanhSach.GioHang;
import app.DanhSach.HangHoa;
import app.Interface.ThanhToanCOD;
import app.Interface.ThanhToanOnline;

public class App {
    public static void main(String[] args) {
        ThanhToanOnline online = new ThanhToanOnline();
        HangHoa hang1 = new HangHoa("May Quat",6000000,"SenKO");
        ArrayList<HangHoa> DanhSach1 = new ArrayList<>();
        DanhSach1.add(hang1);
        GioHang GioHang1 = new GioHang();
        GioHang1.setHinhThucTT(online);
        GioHang1.setDSHangHoa(DanhSach1);
        System.out.print(hang1.tenHH + ": ");
        System.out.println("Thanh toan online:" + GioHang1.thanhToan());


        HangHoa hang3 = new HangHoa("May Quat bay bay",6000000,"SAGAKI");
        ArrayList<HangHoa> DanhSach3 = new ArrayList<>();
        DanhSach3.add(hang3);
        GioHang GioHang3 = new GioHang();
        GioHang3.setHinhThucTT(online);
        GioHang3.setDSHangHoa(DanhSach3);
        System.out.print(hang3.tenHH + ": ");
        System.out.println("Thanh toan online:" + GioHang3.thanhToan());


        ThanhToanCOD COD = new ThanhToanCOD();
        HangHoa hang2 = new HangHoa("May hoi nuoc",3000000,"Bata");
        ArrayList<HangHoa> DanhSach2 = new ArrayList<>();
        DanhSach2.add(hang2);
        GioHang GioHang2 =new GioHang();
        GioHang2.setHinhThucTT(COD);
        GioHang2.setDSHangHoa(DanhSach2);
        System.out.print(hang2.tenHH + ": ");
        System.out.println("Thanh toan COD:" + GioHang2.thanhToan());
    }
}
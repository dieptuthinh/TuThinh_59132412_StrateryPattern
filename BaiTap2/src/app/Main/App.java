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
        System.out.println("Thanh toan online:" + GioHang1.thanhToan());



        ThanhToanCOD COD = new ThanhToanCOD();
        HangHoa hang2 = new HangHoa("Ban",3000000,"Bata");
        ArrayList<HangHoa> DanhSach2 = new ArrayList<>();
        DanhSach2.add(hang2);
        GioHang GioHang2 =new GioHang();
        GioHang2.setHinhThucTT(COD);
        GioHang2.setDSHangHoa(DanhSach2);
        System.out.println("Thanh toan COD:" + GioHang2.thanhToan());
    }
}
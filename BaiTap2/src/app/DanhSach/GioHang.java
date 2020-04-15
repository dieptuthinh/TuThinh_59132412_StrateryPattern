package app.DanhSach;

import java.util.ArrayList;

import app.Interface.IThanhToan;

public class GioHang {
    private IThanhToan hinhThucTT;
    private ArrayList<HangHoa> DSHangHoa = new ArrayList<HangHoa>();

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public ArrayList<HangHoa> getDSHangHoa() {
        return DSHangHoa;
    }

    public void setDSHangHoa(ArrayList<HangHoa> dSHangHoa) {
        DSHangHoa = dSHangHoa;
    }

    public double thanhToan(){
        int tong = 0;
        for
        (int i = 0 ; i < DSHangHoa.size(); i++){
            tong += DSHangHoa.get(i).getGia();
        }
        return hinhThucTT.thanhToan(tong);
    }

    

    
}
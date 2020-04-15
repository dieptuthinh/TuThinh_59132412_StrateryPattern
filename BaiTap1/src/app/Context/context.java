package app.Context;

import app.Interface.Tinh;

public class context {
    private Tinh tinhToan ;

    public void setTinhtoan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public float tinh(float a,float b){
        return tinhToan.tinh(a,b);
    }
}
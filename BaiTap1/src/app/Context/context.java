package app.Context;

import app.Interface.Tinh;

public class context {
    private Tinh tinhtoan ;

    public void setTinhtoan(Tinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }

    public float tinh(float a,float b){
        return tinhtoan.tinh(a,b);
    }
}
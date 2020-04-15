package app.Main;

import app.Context.context;
import app.Interface.Cong;
import app.Interface.Tinh;
import app.Interface.Tru;

public class App {
    public static void main(String[] args)  {
        Tinh cong = new Cong();
        Tinh tru = new Tru();
        context con = new context();

        con.setTinhtoan(cong);
        float x = con.tinh(75,12);
        System.out.println("Ket qua x = " + x);

        con.setTinhtoan(tru);
        float y = con.tinh(54,78);
        System.out.println("Ket qua y = " +y);
    }
}
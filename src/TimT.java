
package Bab7;

public class TimT extends Member {

    public TimT(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public String yel() {
        return String.format("GO TEAM TI GO");
    }
    
    public void show(){
        super.show();
    }
}


package Bab7;

public class TimJ extends Member {

    public TimJ(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public String yel() {
        return String.format("WASSHOI J!");
    }

    public void show(){
        super.show();
    }
}

package PRAKTIKUM7;

public class TimJ extends Member {

    public TimJ(String nama, String asalDaerah) {
        super(nama, asalDaerah);
    }

    public String yel() {
        return String.format("WASSHOI J !");
    }

    public String show() {
        return super.show();
    }
}

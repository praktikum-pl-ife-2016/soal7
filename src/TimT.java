package PRAKTIKUM7;

public class TimT extends Member {

    public TimT(String nama, String asalDaerah) {
        super(nama, asalDaerah);
    }

    public String yel() {
        return String.format("GO TEAM TI GO");
    }

    public String show() {
        return super.show();
    }
}

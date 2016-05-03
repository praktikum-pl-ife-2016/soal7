
public abstract class Member {

    private String nama, asal;

    public Member(String nama, String asal) {

        this.nama = nama;
        this.asal = asal;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public abstract String yel();

    public String goJKT() {
        return String.format("GO JKT GO JKT GO");
    }

    public String show() {
        return String.format("Nama : " + getNama() + "\nAsal : " + getAsal());
    }
}


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

    public abstract void goJKT();

    public abstract void yel();

    public abstract void show();
}

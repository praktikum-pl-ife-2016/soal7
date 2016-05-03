package PRAKTIKUM7;

public abstract class Member {

    private String nama;
    private String asalDaerah;

    public Member(String nama, String asalDaerah) {
        this.nama = nama;
        this.asalDaerah = asalDaerah;
    }

    public String getNama() {
        return nama;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    public String goJKT() {
        return String.format("GO JKT GO JKT GO");
    }

    public abstract String yel();

    public String show() {
        return String.format("TEAM               : " + getNama()
                + "\nAsal Daerah        : " + getAsalDaerah()
                + "\nGo JKT             : " + goJKT()
                + "\nYel                : " + yel());
    }
}

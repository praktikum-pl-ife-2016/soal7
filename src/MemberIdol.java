
public abstract class MemberIdol {

    private String nama;
    private String asalDaerah;

    public MemberIdol(String nama, String asalDaerah) {
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
                + "\nASAL DAERAH        : " + getAsalDaerah()
                + "\nGO JKT             : " + goJKT()
                + "\nYEL                : " + yel());
    }
}

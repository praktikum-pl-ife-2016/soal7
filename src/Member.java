public abstract class Member {

    private String nama;
    private String daerah;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public Member(String nama, String daerah) {
        this.nama = nama;
        this.daerah = daerah;
    }

    public void goJkt() {
        System.out.println("GO JKT GO JKT GO");
    }

    public abstract void yel();

    public void show() {
        System.out.println("Nama \t: " + getNama());
        System.out.println("Daerah \t: " + getDaerah());
    }
}

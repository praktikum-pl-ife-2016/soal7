package member;

public abstract class Member {

    private String nama, asalDaerah;

    public Member(String n, String a) {
        this.nama = n;
        this.asalDaerah = a;
    }

    public String getNama() {
        return nama;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    public abstract void goJKT();

    public abstract void yel();

    public abstract void show();

}

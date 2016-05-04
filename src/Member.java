public abstract class Member {

    String nama, daerah;

    public Member(String nama, String daerah) {
        this.nama = nama;
        this.daerah = daerah;
    }

    public abstract void yelyel();

    public void goJKT() {
        System.out.println("GO JKT GO JKT");
    }

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

    public void display() {
        System.out.println("Nama   : "+ this.nama);
        System.out.println("Daerah : "+this.daerah);
    }

}

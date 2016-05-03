package memberjkt;

public abstract class MemberJKT {

    protected String nama;
    protected String daerah;
    
    public MemberJKT(String nama, String daerah) {
        this.nama = nama;
        this.daerah = daerah;
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
    
    public void goJKT() {
        System.out.println("GO JKT GO JKT");
        
    }
    
    public abstract void yel();
    
    public void show() {
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Asal daerah : "+ this.daerah);
    }
}

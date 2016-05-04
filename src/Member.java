public abstract class Member {
    String nama, daerah;
    
    public Member(String nama, String daerah){
        this.nama = nama;
        this.daerah = daerah;
    }
    
    public void Jekate(){
        System.out.println("GO JKT!! GO JKT!! GO JKT!!");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }
    
    public abstract void yelyel();
    
    public void show(){
        System.out.println("Nama        : "+ nama);
        System.out.println("Daerah Asal : "+ daerah);
    }
    
}

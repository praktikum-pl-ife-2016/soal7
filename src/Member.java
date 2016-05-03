public abstract class Member {
    private String nama, daerah;
    
    public Member(String nama, String daerah){
        this.nama = nama;
        this.daerah = daerah;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal(){
        return daerah;
    }
    
    public void goJKT(){
        System.out.println("GO JKT GO JKT GO");
    }
    
    public void show(){
        System.out.println("Nama anda   : " + getNama());
        System.out.println("Asal Daerah : " + getAsal());
    }
    public abstract String yel();
}

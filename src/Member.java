package praktikum7;
public abstract class Member {
    String nama, daerahAsal;
    
    public Member(String nama, String daerahAsal){
        this.nama = nama;
        this.daerahAsal = daerahAsal;
    }
    
    public void goJkt(){
        System.out.println("GO JKT - GO JKT - GO JKT");
    }
    
    public abstract void yel();
    
    public void show(){
        System.out.println("Nama : "+ nama);
        System.out.println("Daerah Asal : "+ daerahAsal);
    }
    
}

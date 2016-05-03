
public abstract class Member {
    String nama, asal;

    public Member(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }
    
    public void goJkt(){
        System.out.println("GO JKT GO JKT GO ");
    }
    
    public abstract void yel();
    
    public void show(){
        System.out.println("Nama        : "+ nama);
        System.out.println("Asal Daerah : "+ asal);
    }
}

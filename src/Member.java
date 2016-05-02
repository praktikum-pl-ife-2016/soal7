
public abstract class Member {
    String nama, asalDaerah;

    public Member(String name, String asal) {
        nama = name;
        asalDaerah = asal;
    }
    
    public void goJkt(){
        System.out.println("GO JKT GO JKT GO ");
    }
    
    public abstract void yel();
    
    public void show(){
        System.out.println("Nama        : "+ nama);
        System.out.println("Asal daerah : "+ asalDaerah);
    }
}

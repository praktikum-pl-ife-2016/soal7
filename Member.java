package bab7;

/**
 *
 * @author JERRY
 */

public abstract class Member {
    String nama, daerah;
    
    public Member (String nama, String daerah){
        this.nama = nama;
        this.daerah = daerah;
    }
    
    public void goJKT(){
        System.out.println("GO JKT GO JKT GO");
    }
    
    public abstract void yel();
    
    public void show(){
        System.out.println("Nama : "+nama);
        System.out.println("Asal Daerah : "+daerah);
    }    
}

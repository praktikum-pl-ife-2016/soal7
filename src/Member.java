
package Bab7;

public abstract class Member {
    private String nama, asal;
    
    public abstract String yel();
    
    public Member(String nama, String asal){
        this.nama = nama;
        this.asal = asal;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal(){
        return asal;
    }
    
    public void goJKT(){
        System.out.println("GO JKT GO JKT GO");
    }
    
    public void show(){
        System.out.println("Nama anda   : " + getNama());
        System.out.println("Asal Daerah : " + getAsal());
    }
}

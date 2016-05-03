
package mainmember;

public abstract class member {
    String nama;
    String asal;
    
    public member (String nama,String asal){
        this.nama=nama;
        this.asal=asal;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        
        return asal;
    }
    public void goJkt(){
        System.out.println("GO JKT GO JKT GO");
    }
    public abstract String yel();
        
    public void show(){
        System.out.println("nama         :"+getNama());
        System.out.println("asal daerah  :"+getAsal());
    }
}

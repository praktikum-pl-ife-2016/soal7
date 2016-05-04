
package member;


public abstract class  Member {

    private String nama;
 private String asalDaerah;

 public Member(String nama, String alamat){
 this.nama = nama;
 this.asalDaerah = alamat;
 }
 public void goJKT(){
 System.out.println("GO JKT GO JKT GO");
 }
 public abstract void yel();
 public void show(){
 System.out.println("Nama\t\t: "+nama);
 System.out.println("Asal Daerah\t: "+asalDaerah);
 System.out.println("--------------------------");
 }
}
    
        // TODO code application logic here
    
   


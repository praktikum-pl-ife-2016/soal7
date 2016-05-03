public abstract class JKT {

   private String nama;
    private String asalDaerah;
     
     public JKT(String name, String alamat){
         this.nama = name;
         this.asalDaerah = alamat;
     }
     public void goJKT(){
         System.out.println("GO JKT GO JKT GO");
     }
     public abstract void yel();
     public void show(){
         System.out.println("Nama        : " + this.nama);
         System.out.println("Asal Daerah : " + this.asalDaerah);
     }
 }

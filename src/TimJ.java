public class TimJ  extends JKT {
 
     public TimJ(String name, String alamat) {
         super(name, alamat);
     }
 
     @Override
     public void yel() {
         System.out.println("WASSHOI J!");
     }
    public String toString(){
         return String.format("Tim J");
     }
 }
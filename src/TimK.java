public class TimK extends JKT{
 
     public TimK(String name, String alamat) {
         super(name, alamat);
     }
 
     @Override
     public void yel() {
         System.out.println("WASSHOI K TEAM KEY");
     }
     public String toString(){
         return String.format("Tim K");
     }
 }
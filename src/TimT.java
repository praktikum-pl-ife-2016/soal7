public class TimT extends JKT{
     public TimT(String name, String alamat) {
        super(name, alamat);
     }
 
     @Override
     public void yel() {
        System.out.println("GO TEAM TI GO");
     }
     public String toString(){
         return String.format("Tim T");
     }
 }

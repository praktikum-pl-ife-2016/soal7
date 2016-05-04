
package member;


public class TimJ extends Member {

    public TimJ(String nama, String alamat) {
        super(nama, alamat);
        
    }

    @Override
    public void yel() {
        System.out.println("WASSHOI J!");
 }
 public String toString(){
 return String.format("Tim J");
 }
}
    
    
    


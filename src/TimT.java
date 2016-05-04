
package member;


public class TimT extends Member {

    public TimT(String nama, String alamat) {
        super(nama, alamat);
    }

    @Override
    public void yel() {
        System.out.println("GO TEAM TI GO");
}
    public String toString(){
return String.format("Tim T");
    }
    
}

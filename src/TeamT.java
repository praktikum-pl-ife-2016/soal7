
package memberjkt;

public class TeamT extends MemberJkt {
    public TeamT(String nama, String asal) {
        super(nama, asal);        
    }
    @Override
    public String yel() {
        return String.format("GO TEAM TI GO");
    }
    public String show(){
         return super.show();
    }
    
}


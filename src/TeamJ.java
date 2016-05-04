
package memberjkt;


 public class TeamJ extends MemberJkt {
    public TeamJ(String nama, String asal) {
        super(nama, asal);
    }
    @Override
    public String yel(){
       return String.format("WASSHOI J!");
    }
    public String show(){
         return super.show();
    }
   
}


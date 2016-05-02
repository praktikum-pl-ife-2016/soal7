public class TeamT extends Member{
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

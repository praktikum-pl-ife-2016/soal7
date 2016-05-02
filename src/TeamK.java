public class TeamK extends Member {
    public TeamK(String nama, String asal) {
        super(nama, asal);
    }
    @Override
    public String yel() {
        return String.format("WASSHOI K TEAM KEY");
    }
    public String show(){
         return super.show();
    }
    
}

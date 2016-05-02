public class TeamJ extends Member {
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

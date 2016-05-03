public class TimK extends Member{

    public TimK(String nama, String alamat) {
        super(nama, alamat);
    }

    @Override
    public void yel() {
        System.out.println("WASSHOI K TEAM KEY");
    }
    public String toString(){
        return String.format("Tim K");
    }
}


public class J extends Member {

   public J(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }

    @Override
    public void yel() {
        System.out.println("WASSHOI J");
    }

    @Override
    public void show() {
        System.out.println("Nama\t: " + super.getNama());
        System.out.println("Asal\t: "+ super.getAsal());
    }
}

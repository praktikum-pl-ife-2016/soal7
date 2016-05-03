
public class K extends Member {

    public K(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public void yel() {
        System.out.println("WASHOI K TEAM KEY");
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }

    @Override
    public void show() {
        System.out.println("Nama\t: " + super.getNama());
        System.out.println("Asal\t: " + super.getAsal());
    }

}

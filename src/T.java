
public class T extends Member {

    private String nama, asal;

    public T(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }

    @Override
    public void yel() {
        System.out.println("GO TEAM T GO");
    }

    @Override
    public void show() {
        System.out.println("Nama\t: " + super.getNama());
        System.out.println("Asal\t: " + super.getAsal());
    }
}

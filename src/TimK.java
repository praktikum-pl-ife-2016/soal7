package member;

public class TimK extends Member {

    public TimK(String n, String a) {
        super(n, a);
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }

    @Override
    public void yel() {
        System.out.println("WASSHOI K TEAM KEY");
    }

    @Override
    public void show() {
        System.out.println("Nama : " + super.getNama() + "\nAsal Daerah : " + super.getAsalDaerah());
    }
}

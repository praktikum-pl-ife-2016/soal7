package member;

public class TimT extends Member {

    public TimT(String n, String a) {
        super(n, a);
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }

    @Override
    public void yel() {
        System.out.println("GO TEAM TI GO");
    }

    @Override
    public void show() {
        System.out.println("Nama : " + super.getNama() + "\nAsal Daerah : " + super.getAsalDaerah());
    }
}

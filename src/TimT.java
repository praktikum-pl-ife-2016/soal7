
public class TimT extends Member {
    private String nama, asal;

    public TimT(String Name, String AsalDaerah) {
        super(Name, AsalDaerah);
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void yel() {
        System.out.println("GO TEAM TI GO"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        System.out.println("Name : "+super.getNama()); //To change body of generated methods, choose Tools | Templates.
	System.out.println("AsalDaerah : "+super.getAsal());
    }
}

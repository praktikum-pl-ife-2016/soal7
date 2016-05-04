
public abstract class Member {

    String nama, asal;

    public Member(String n, String a) {
        this.nama = n;
        this.asal = a;
    }

    public void goJKT() {
        System.out.println("\n=========================");
        System.out.println("GO JKT GO JKT GO");
    }

    public abstract void yel();

    public void show() {
        System.out.println("Nama : " + nama);
        System.out.println("Asal Daerah : " + asal);
    }
}

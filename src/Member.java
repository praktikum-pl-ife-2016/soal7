public abstract class Member {
    public String nama, asal;
    public Member(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }
    public abstract void yel();
}

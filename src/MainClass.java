public class MainClass {

    public static void main(String[] args) {
        TIMJ j1 = new TIMJ("Donovan", "Surabaya");
        TIMK k1 = new TIMK("Michael", "Jakarta");
        TIMT t1 = new TIMT("Robert", "Bali");
        Member[] member = new Member[3];

        member[0] = j1;
        member[1] = k1;
        member[2] = t1;

        for (int i = 0; i < member.length; i++) {
            member[i].show();
            member[i].yel();
            member[i].goJkt();
            System.out.println("===================");
        }
    }
}
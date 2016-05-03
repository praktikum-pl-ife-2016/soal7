package member;

public class MainMember {

    public static void main(String[] args) {
        Member[] member = new Member[3];

        TimJ j = new TimJ("Kevin", "Jakarta");
        TimK k = new TimK("Peitra", "Bandung");
        TimT t = new TimT("Alvin", "Kediri");

        member[0] = j;
        member[1] = k;
        member[2] = t;

        for (int i = 0; i < member.length; i++) {
            member[i].goJKT();
            member[i].yel();
            member[i].show();
            System.out.println();
        }
    }
}

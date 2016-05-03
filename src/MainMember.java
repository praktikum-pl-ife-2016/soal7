package githubbab7;

public class MainMember {

    public static void main(String[] args) {
        TimJ j = new TimJ("Thadan", "Medan");
        TimK k = new TimK("Tara", "Jakarta");
        TimT t = new TimT("Dyara", "Bandung");

        Member[] member = new Member[3];
        member[0] = j;
        member[1] = k;
        member[2] = t;

        for (Member currentMember : member) {
            currentMember.show();
            System.out.println(currentMember.yel());
            currentMember.goJKT();
            System.out.println("=====================");
        }
    }
}

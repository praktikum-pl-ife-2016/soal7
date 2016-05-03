
public class MainMember {

    public static void main(String[] args) {
        TimJ timJ = new TimJ("Dearifaldi", "California");
        TimK timK = new TimK("Nada", "Solo");
        TimT timT = new TimT("Sarah Wong", "Singapore");

        Member[] tim = new Member[3];
        tim[0] = timJ;
        tim[1] = timK;
        tim[2] = timT;

        for (Member currentMember : tim) {
            System.out.println(currentMember.show());
            System.out.println(currentMember.goJKT());
            System.out.println(currentMember.yel());
            System.out.println("");
        }
    }

}

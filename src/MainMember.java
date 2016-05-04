public class MainMember {

    public static void main(String[] args) {
        timJ J = new timJ("TIM J", "Indonesia");
        timK K = new timK("TIM K", "Australia");
        timT T = new timT("TIM T", "Amerika");

        System.out.println("===========================================");
        System.out.println("               MEMBER IDOL                 ");
        System.out.println("===========================================");
        MemberIdol[] member = new MemberIdol[3];
        member[0] = J;
        member[1] = K;
        member[2] = T;

        for (MemberIdol currentMember : member) {
            System.out.println(currentMember.show());
            System.out.println(currentMember.goJKT());
            System.out.println(currentMember.yel());
            System.out.println("-------------------------------------------");
        }
    }
}

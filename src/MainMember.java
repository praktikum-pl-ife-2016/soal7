
import java.util.Scanner;

public class MainMember {

    public static void main(String[] args) {
        String batas = ("============================================");
        TimJ J = new TimJ("TIM J", "BLITAR");
        TimK K = new TimK("TIM K", "SAMARINDA");
        TimT T = new TimT("TIM T", "KUTAI KARTANEGARA");

        System.out.println(batas);
        System.out.println("============== IDOL GROUP JKT ==============");
        System.out.println(batas);
        MemberIdol[] m1 = new MemberIdol[3];
        m1[0] = J;
        m1[1] = K;
        m1[2] = T;

        for (MemberIdol currentMember : m1) {
            System.out.println(currentMember.show());
            System.out.println();
            System.out.println(currentMember.goJKT());
            System.out.println(currentMember.yel());
            System.out.println(batas);
        }
    }
}

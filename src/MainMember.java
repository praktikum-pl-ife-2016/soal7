package PRAKTIKUM7;

import java.util.Scanner;

public class MainMember {

    public static void main(String[] args) {
        TimJ J = new TimJ("TIM J", "Jember");
        TimK K = new TimK("TIM K", "Trenggalek");
        TimT T = new TimT("TIM T", "Lumajang");

        System.out.println("............................................");
        System.out.println("============== IDOL GROUP JKT ==============");
        System.out.println("............................................");
        Member[] m1 = new Member[3];
        m1[0] = J;
        m1[1] = K;
        m1[2] = T;

        for (Member currentMember : m1) {
            System.out.println(currentMember.show());
            System.out.println("");
            System.out.println(currentMember.goJKT());
            System.out.println(currentMember.yel());
            System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        }
    }
}

public class MainMember {
    public static void main(String[] args) {
        TimJ j = new TimJ ("TIM J", "Indonesia");
        TimK k = new TimK ("TIM K", "Australia");
        TimT t = new TimT ("TIM T", "Amerika");
        
        System.out.println("===========================================");
        System.out.println(">>>>>>>>>>>>>> MEMBER IDOL <<<<<<<<<<<<<<<<");
        System.out.println("===========================================");
        Member[] member = new Member[3];
        member[0] = j;
        member[1] = k;
        member[2] = t;
        
        for (Member currentMember : member){
            System.out.println(currentMember.show());
            System.out.println(currentMember.goJKT());
            System.out.println(currentMember.yel());
            System.out.println("-------------------------------------------");
        }
    }
}

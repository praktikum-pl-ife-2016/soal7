public class MainMemberIdol {
    public static void main(String[] args) {
        TimJ J = new TimJ ("TIM J", "Jakarta");
        TimK K = new TimK ("TIM K", "Bogor");
        TimT T = new TimT ("TIM T", "Yogyakarta");
        
        System.out.println("=========== GROUP IDOL ============");
        MemberIdol[] mI = new MemberIdol[3];
        mI[0] = J;
        mI[1] = K;
        mI[2] = T;
        
        for (MemberIdol currentMemberIdol : mI){
            System.out.println(currentMemberIdol.show());
            System.out.println();
            System.out.println(currentMemberIdol.goJKT());
            System.out.println(currentMemberIdol.yel());
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("===================================");
        }
    }
    
}
    


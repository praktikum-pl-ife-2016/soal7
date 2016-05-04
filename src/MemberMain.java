public class MemberMain {
    public static void main(String[] args) {
        TimJ TimJe = new TimJ("TIM JE","JAKARTA");
        TimK TimKa = new TimK("TIM KA","KALIMANTAN");
        TimT TimTe = new TimT("TIM TE", "TANGERANG");
        Member []member = new Member[3];
        member[0] = TimJe;
        member[1] = TimKa;
        member[2] = TimTe;
        for(int i=0;i<member.length;i++){
            member[i].goJKT();
            System.out.print(member[i].nama + " asal ");
            System.out.println(member[i].asal);
            member[i].yel();
        }
    }
}

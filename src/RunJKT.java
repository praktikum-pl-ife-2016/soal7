public class RunJKT {
    public static void main(String[] args){
        TimJ J = new TimJ("Baim","Depok");
        TimK K = new TimK("Mahe","Jakarta");
        TimT T = new TimT("Ibrahim","Riau");
        
        Member[] member = new Member[3];
        member[0] = J;
        member[1] = K;
        member[2] = T;
        
         for (Member x : member) {
             System.out.println("=====================");
             x.show();
             System.out.println(x.yel());
             x.goJKT();
             
         }
         System.out.println("=====================");
    }
}

package Bab7;

public class MainJKT {
    public static void main(String[] args){
        TimJ j = new TimJ("Najib","Malang");
        TimK k = new TimK("Rijal","Brebes");
        TimT t = new TimT("Aldi","Medan");
        
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

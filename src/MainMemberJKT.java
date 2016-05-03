package memberjkt;

public class MainMemberJKT {
    public static void main(String[] args) {
        
        TimJ member1 = new TimJ("Messi", "Barca");
        TimK member2 = new TimK("Ronaldo", "Madrid");
        TimT member3 = new TimT("Hazard", "Chelsea");
        
        MemberJKT[] member = new MemberJKT[3];
        
        member[0] = member1;
        member[1] = member2;
        member[2] = member3;
        
        for(int i = 0; i < member.length; i++) {
            System.out.println("");
            member[i].show();
            member[i].yel();
            member[i].goJKT();
            System.out.println("======================");
        }
        
                
         
    }
}

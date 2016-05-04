package praktikum7;
public class Main {
    public static void main(String[] args) {
        
        Member team [] = new Member [3];
        
        team[0] = new TimJ("Luffy","East Blue");
        team[1] = new TimK("Law","North Blue");
        team[2] = new TimT("Brook","West Blue");
        
        System.out.println("------------------------");
        
        for(int i = 0; i < team.length; i++){
            team[i].show();
            team[i].yel();
            System.out.println("------------------------");
            team[i].goJkt();
            System.out.println("------------------------");
        }
    }
    
}

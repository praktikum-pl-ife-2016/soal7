public class Main {
   public static void main(String[] args) {

        TimJ Jteam = new TimJ("Reva","Cilegon");
        TimK Kteam = new TimK("Nadya","Tangerang");
        TimT Tteam = new TimT("Kimi","Pandeglang");

        JKT[] team = new JKT[3];
 
         team[0] = Jteam;
         team[1] = Kteam;
         team[2] = Tteam;
 
         for (int i = 0; i < team.length; i++) {
             System.out.println("");
             team[i].show();
             team[i].yel();
             team[i].goJKT();
 
         }
 
     }
 }
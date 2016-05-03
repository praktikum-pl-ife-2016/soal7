import java.util.Scanner;
public class MainMember {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, daerah;

        Member idol[] = new Member[3];
        idol[0] = new J("Aldian", "Sabang");
        idol[1] = new K("Najri", "Bermuda");
        idol[2] = new T("Mahendan", "Merauke");

        for (int i = 0; i < 3; i++) {
            idol[i].goJKT();
            idol[i].show();
            idol[i].yel();
            
            System.out.println("======================");
        }
    }
}
    


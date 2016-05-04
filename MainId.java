
import java.util.Scanner;
public class MainId {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, daerah;

        Member objek[] = new Member[3];
        objek[0] = new TimJ("Andika", "Brebes");
        objek[1] = new TimK("McMahon", "Brebes");
        objek[2] = new TimT("Jerry", "Brebes");

        for (int i = 0; i < 3; i++) {
            objek[i].show();
            objek[i].goJKT();
            objek[i].yel();
        }
    } 
}

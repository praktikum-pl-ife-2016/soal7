package bab7;
import java.util.Scanner;
/**
 *
 * @author JERRY
 */
public class MainId {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, daerah;

        Member objek[] = new Member[3];
        objek[0] = new TimJ("Jerry", "Blitar");
        objek[1] = new TimK("Andika", "Medan");
        objek[2] = new TimT("Romzy", "Cilacap");

        for (int i = 0; i < 3; i++) {
            objek[i].show();
            objek[i].goJKT();
            objek[i].yel();
        }
    } 
}

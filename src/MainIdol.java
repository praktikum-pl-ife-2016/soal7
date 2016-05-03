import java.util.Scanner;
public class MainIdol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, daerah;

        Member objek[] = new Member[3];
        objek[0] = new TimJ("Fikri", "BojongMangu");
        objek[1] = new TimK("Kelvin", "Bekasi");
        objek[2] = new TimT("Abdan", "Bojonegoro");

        for (int i = 0; i < 3; i++) {
            objek[i].show();
            objek[i].goJKT();
            objek[i].yel();
        }
    }
}
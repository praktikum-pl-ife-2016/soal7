
package jkt;

public class MainClass {

    public static void main(String[] args) {
        JKT[] obj1 = new JKT[3];
        obj1[0] = new TimJ("Peitra", "Bandung");
        obj1[1] = new TimK("Egin", "Jakarta");
        obj1[2] = new TimT("Yudha", "Malang");

        for (int x = 0; x < 3; x++) {
            System.out.println(obj1[x].show());
            obj1[x].goJKT();
            System.out.println(obj1[x].yel());
            System.out.println();
        }
    }

}


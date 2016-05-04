/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class Kelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member[] ha = new Member[3];
        ha[0] = new TeamJ("fikri", "Manado");
        ha[1] = new TeamK("Ajeng", "Jawa");
        ha[2] = new TeamT("Fatan", "Bandung");

        for (int i = 0; i < 3; i++) {
            System.out.println(ha[i].show());
            ha[i].goJKT();
            System.out.println(ha[i].yel());
            System.out.println();
        }
    }

}

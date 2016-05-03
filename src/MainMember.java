/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memberr;

/**
 *
 * @author Rezananda
 */
public class MainMember {

    public static void main(String[] args) {

        J Jteam = new J("Reza", "Bali");
        K Kteam = new K("Budi", "Kalimantan");
        T Tteam = new T("Rendi", "Malang");

        Memberr[] team = new Memberr[3];

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

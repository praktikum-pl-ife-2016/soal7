/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author efriza
 */
public class Main {

    public static void main(String[] args) {
        Member m[] = new Member[3];
        TimJ j = new TimJ("Michael", "Tulungagung");
        TimK k = new TimK("Haruan", "Jombang");
        TimT t = new TimT("Bella", "Batakan");
        m[0] = j;
        m[1] = k;
        m[2] = t;
        for (int i = 0; i < m.length; i++) {
            System.out.println("= - = - = - = - = - = - = - =");
            m[i].show();
            m[i].goJKT();
            m[i].yel();
        }

    }
}

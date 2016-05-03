/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalpraktikum;

/**
 *
 * @author AcerAsp4750
 */
public class MainMember {
    public static void main(String[] args) {
        TimJ j = new TimJ ("TIM J", "Jepang");
        TimK k = new TimK ("TIM K", "Korea");
        TimT t = new TimT ("TIM T", "Thailand");
        
        System.out.println("============== Menggunakan Polimorfisme ==============");
        Member[] member = new Member[3];
        member[0] = j;
        member[1] = k;
        member[2] = t;
        
        for (Member currentMember : member){
            System.out.println(currentMember.show());
            System.out.println("======================================================");
        }
    }
    
}

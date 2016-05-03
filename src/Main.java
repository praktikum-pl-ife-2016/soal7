/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum7;

/**
 *
 * @author alvin
 */
public class Main {
 
    public static void main(String[] args) {
        TimK k = new TimK("huhu","jakarta");
        TimJ j = new TimJ("yuyun","Pati");
        TimT t = new TimT("jeki","pakis");
        Member[] array = new Member[3];
        
        array[0]=j;
        array[1]=k;
        array[2]=t;
        
        for(int i = 0; i<array.length;i++){
        array[i].goJKT();
        array[i].yel();
        array[i].show();
            System.out.println("");
        }
    }
}

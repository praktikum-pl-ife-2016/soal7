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
public class TimK extends Member {

    public TimK(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public void yel() {
        System.out.println("WASHOI K TEAM KEY"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        System.out.println("nama\t: "+super.getNama()+"\nasal\t: "+super.getAsal()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

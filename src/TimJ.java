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
public class TimJ extends Member{
    private String nama, asal;

    public TimJ(String nama, String asal) {
        super(nama, asal);
    }

    @Override
    public void goJKT() {
        System.out.println("GO JKT GO JKT GO"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void yel() {
        System.out.println("WASSHOI J"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        System.out.println("nama\t: "+super.getNama()+"\nasal\t: "+super.getAsal()); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R-PC
 */
public abstract class IdolGroup {
    private String name, asalDaerah;
    public IdolGroup(String name, String asalDaerah) {
        this.name = name;
        this.asalDaerah = asalDaerah;
    }
    //method goJKT
    public void goJKT(){
        System.out.println("GO JKT GO JKT GO");
    }
    //method abstrak yel, setiap tim memiliki yel berbeda
    public abstract void yel();
    
    //method getName
    public String getName() {
        return name;
    }
    //method getAsalDaerah
    public String getAsalDaerah() {
        return asalDaerah;
    }
    //method show
    public void show(){
        System.out.println("Nama        : "+getName()+"\nAsal Daerah : "+getAsalDaerah());
    }
}

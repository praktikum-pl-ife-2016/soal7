/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public abstract class Member {
    public String nama,asalDaerah;
    
    public void goJKT(){
        System.out.println("GO JKT GO JKT GO");
    }
    public String show(){
        return "Nama:"+nama+"\n"+"Asal:"+asalDaerah;
    }
    public abstract String yel();
}

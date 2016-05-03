/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author efriza
 */
public abstract class Member {

    private String nama, asal;

    public Member(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }

    public abstract void yel();

    public void goJKT() {
        System.out.println("GO JKT GO JKT GO");
    }
    public void show(){
        System.out.println("Nama        : "+nama);
        System.out.println("Asal daerah : "+asal);
    }

}

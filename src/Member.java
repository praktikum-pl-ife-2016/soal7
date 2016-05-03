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
public abstract class Member {
    private String nama, asal;

    public Member(String nama, String asal) {
        this.nama = nama;
        this.asal = asal;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }
    
    public abstract void goJKT();
    public abstract void yel();
    public abstract void show();
}

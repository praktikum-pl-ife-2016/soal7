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
public abstract class Memberr {

    protected String nama;
    protected String asalDaerah;

    public Memberr(String nm, String asal) {
        this.nama = nm;
        this.asalDaerah = asal;
    }

    public void setNama(String nm) {
        this.nama = nm;
    }

    public void setAsalDaerah(String as) {
        this.asalDaerah = as;
    }

    public String getNama() {
        return nama;
    }

    public String getAsalDaerah() {
        return asalDaerah;
    }

    public void goJKT() {
        System.out.println("GO JKT GO JKT");
    }

    public abstract void yel();

    public void show() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Asal Daerah : " + this.asalDaerah);

    }
}

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
public abstract class Member {
    private String nama;
    private String daerahAsal;
    
    public Member(String name, String asal){
    this.nama=name;
    this.daerahAsal=asal;
}
    public String getNama(){
        return nama;
    }
    public String getdaerahAsal(){
        return daerahAsal;
    }
    public String goJKT(){
        return String.format("GO JKT GO JKT GO");
    }
    public String show() {
        return String.format("Nama TIM : " + getNama() + "\nDaerah Asal : " + getdaerahAsal()
                +"\nGO JKT: "+goJKT()+"\nYel-yel : "+yel());
    }
   public abstract String yel();
}


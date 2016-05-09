
package jkt;

public abstract class JKT {
    public String nama;
    public String asal;
    
    public void goJKT(){
        System.out.println("GO JKT GO JKT GO");
    }
    public String show(){
        return "Nama:"+nama+"\n"+"Asal:"+asal;
    }
    public abstract String yel();
}

    


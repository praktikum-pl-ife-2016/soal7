public abstract class Member {
    private String nama;
    private String Asal;
    
    public Member(String name, String asal){
    this.nama=name;
    this.Asal=asal;
}
    public String getNama(){
        return nama;
    }
    public String getAsal(){
        return Asal;
    }
    public String goJKT(){
        return String.format("GO JKT GO JKT GO");
    }
    public String show() {
        return String.format("Nama TIM\t: " + getNama() + "\nDaerah Asal\t: " + getAsal()
                +"\nGO JKT\t\t: "+goJKT()+"\nYel-yel\t\t: "+yel());
    }
   public abstract String yel();
}


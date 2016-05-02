public abstract class  Member {
   private String nama ;
   private String asal;
   public Member(String nama, String asal){
       this.nama = nama ;
       this.asal = asal;
   }
    public String getName() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    public String goJKT(){
        return String.format("GO JKT GO JKT GO");
    }
    public String show() {
        return String.format("Nama : " + getName() + "\nAsal : " + getAsal());
    }
   public abstract String yel();
}

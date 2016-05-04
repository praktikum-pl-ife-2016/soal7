public abstract class MemberIdol {
    private String nama;
    private String daerahAsal;
    
    public MemberIdol(String nama, String daerahAsal){
    this.nama=nama;
    this.daerahAsal=daerahAsal;
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
    public abstract String yel();
    public String show() {
        return String.format("Nama TIM : " + getNama() + "\nDaerah Asal : " + getdaerahAsal());
    }
}

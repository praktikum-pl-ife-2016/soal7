
public abstract class Member {
    private String Name, AsalDaerah;

    public Member(String Name, String AsalDaerah) {
        this.Name = Name;
        this.AsalDaerah = AsalDaerah;
    }

    public String getNama() {
        return Name;
    }

    public String getAsal() {
        return AsalDaerah;
    }
    
    public abstract void goJKT();
    public abstract void yel();
    public abstract void show();
}

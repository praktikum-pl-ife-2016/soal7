public class Main {
    public static void main(String[] args) {
        IdolGroup[] idol = new IdolGroup[3];
        idol[0] = new TimJ("Albert","Kalimantan");
        idol[1] = new TimK("Wunsel","Jakarta");
        idol[2] = new TimT("Charles","Surabaya");
        
        for(IdolGroup idolGroup : idol){
            idolGroup.show();
            idolGroup.goJKT();
            idolGroup.yel();
            System.out.println("");
        } 
    }
}

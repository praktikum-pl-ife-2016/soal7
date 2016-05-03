
public class MainMember {
    public static void main(String[] args) {
        
        Member Array[] = new Member[3];
        
        Array[0] = new TimJ("Xenovia","Madrid");
        Array[1] = new TimK("Marsacanita","Manchester");
        Array[2] = new TimT("Sinth\n" +
"        Arrayaa","Milan");
        
        for(int i= 0; i < Array.length;i++){
            Array[i].show();
            System.out.println("+++++++++++++++++++++++++++");
            Array[i].goJkt();
            Array[i].yel();
            System.out.println("###########################");
        }        
    }
}

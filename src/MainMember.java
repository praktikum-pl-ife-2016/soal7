
public class MainMember {
    public static void main(String[] args) {
        
        Member memberArray[] = new Member[3];
        
        memberArray[0] = new TimJ("Melody","Jakarta");
        memberArray[1] = new TimK("Haruka","Jepang");
        memberArray[2] = new TimT("Nabilah","Bekasi");
        
        for(int i= 0; i < memberArray.length;i++){
            memberArray[i].show();
            System.out.println("---------------------------");
            memberArray[i].goJkt();
            memberArray[i].yel();
            System.out.println("===========================");
        }        
    }
}

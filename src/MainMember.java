
public class MainMember {
    public static void main(String[] args) {
        
        Member memberArray[] = new Member[3];
        
        memberArray[0] = new TimJ("Mahardika","Surabaya");
        memberArray[1] = new TimK("Yuristyawan","London");
        memberArray[2] = new TimT("Putra","New York");
        
        for(int i= 0; i < memberArray.length;i++){
            memberArray[i].show();
            memberArray[i].yel();
            memberArray[i].goJkt();
            System.out.println("****************************");
        }        
    }
}

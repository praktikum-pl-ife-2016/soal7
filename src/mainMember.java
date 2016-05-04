public class mainMember {
    public static void main(String[] args) {
        
        Member member [] = new Member [3];
        
        member[0] = new TeamJ("Wunsel","Djakarta");
        member[1] = new TeamK("Albert","Kali(Mantan)");
        member[2] = new TeamT("Lutfi","Djakarta");
        
        for(int i = 0; i < member.length; i++){
            member[i].show();
            member[i].yelyel();
            member[i].Jekate();
            System.out.println("=============================================");
        }
    }
    
}

public class MainMember {
    public static void main(String[] args) {
        TimJ J = new TimJ("Martial","Jakarta");
        TimK K = new TimK("Memphis","Aceh");
        TimT T = new TimT("Rojo","Bandung");
        Member[] tim = new Member[3];
        
        tim[0]= J;
        tim[1]= K;
        tim[2]= T;
        
        for(int i = 0;i<=2;i++ ){
            System.out.println("==================");
            tim[i].display();
            tim[i].yelyel();
            tim[i].goJKT();
        }
        
        

    }
    
}

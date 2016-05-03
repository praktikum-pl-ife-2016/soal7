public class MainIdol {
    public static void main(String[] args) {
        // TODO code application logic here
        Member [] user = new Member [3];
        TimJ timJ = new TimJ("Ridwan","Jogja");
        TimK timK = new TimK("Ramdhan","Jakarta");
        TimT timT = new TimT("Rosyid","Semarang");
        user[0]=timJ;
        user[1]=timK;
        user[2]=timT;
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
            user[i].goJKT();
            user[i].yel();
            user[i].show();
        }
    }
    
}

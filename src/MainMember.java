package memberjkt;

public class MainMember {

    public static void main(String[] args) {
        TeamJ teamJ1 = new TeamJ("Amelia", "Netherlands");
        TeamK teamK1 = new TeamK("Nabila", "America");
        TeamT teamT1 = new TeamT("Cindy", "Belgium");

        System.out.println("=======MAIN IDOL========");
        MemberJkt[] mJ = new MemberJkt[3];
        mJ[0] = teamJ1;
        mJ[1] = teamK1;
        mJ[2] = teamT1;

        for (MemberJkt currentMemberJkt : mJ) {
            System.out.println(currentMemberJkt.show());
            System.out.println(currentMemberJkt.yel());
            System.out.println(currentMemberJkt.goJKT());
            System.out.println("------------- ---------------");
        }
    }
}

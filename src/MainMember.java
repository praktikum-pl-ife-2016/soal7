public class MainMember {

    public static void main(String[] args) {
        TeamJ teamJ1 = new TeamJ("Hardwell", "Netherlands");
        TeamJ teamJ2 = new TeamJ("David Guetta", "Belanda");
        TeamJ teamJ3 = new TeamJ("Tiesto", "Brazil");
        TeamK teamK1 = new TeamK("Calvin Harris", "America");
        TeamK teamK2 = new TeamK("Dzeko", "Italy");
        TeamK teamK3 = new TeamK("Moti", "Roma");
        TeamT teamT1 = new TeamT("Dimttri Vegas", "Belgium");
        TeamT teamT2 = new TeamT("Zedd", "San Francisco");
        TeamT teamT3 = new TeamT("Showtek", "Belgium");
        Member[] member = new Member[9];
        member[0] = teamJ1;
        member[1] = teamJ2;
        member[2] = teamJ3;
        member[3] = teamK1;
        member[4] = teamK2;
        member[5] = teamK3;
        member[6] = teamT1;
        member[7] = teamT2;
        member[8] = teamT3;
        for (Member currentMember : member) {
            System.out.println(currentMember.show());
            System.out.println(currentMember.yel());
            System.out.println(currentMember.goJKT());
            System.out.println(">>>>>>>>>>>>>> <<<<<<<<<<<<<");
        }
    }
}

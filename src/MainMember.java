
package member;


public class MainMember {
    public static void main(String[] args) {

 Member [] display = new Member [3];
 TimJ timJ = new TimJ("FERISTIA","LAMPUNG");
 TimK timK = new TimK("ARDI","BANDUNG");
 TimT timT = new TimT("FESIA","SOLO");
 display[0]=timJ;
 display[1]=timK;
display[2]=timT;
for (int i = 0; i < display.length; i++) {
 System.out.println(display[i]);
display[i].goJKT();
 display[i].yel();
 display[i].show();
 }
 }

}

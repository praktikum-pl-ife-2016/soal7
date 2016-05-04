
public class Main {
 
    public static void main(String[] args) {
        TimK k = new TimK("Sarah","Medan");
        TimJ j = new TimJ("Cimol","Berastagi");
        TimT t = new TimT("Intan","Blimbing");
        Member[] array = new Member[3];
        
        array[0]=j;
        array[1]=k;
        array[2]=t;
        
        for(int i = 0; i<array.length;i++){
        array[i].goJKT();
        array[i].yel();
        array[i].show();
            System.out.println("");
        }
    }
}


public class MainMember {

    public static void main(String[] args) {
        J j = new J("Nabilah", "Jakarta");
        K k = new K("Melody", "Italy");
        T t = new T("Sutiyem", "Bulgaria");
        Member[] poly = new Member[3];

        poly[0] = j;
        poly[1] = k;
        poly[2] = t;

        for (int i = 0; i < poly.length; i++) {
            poly[i].goJKT();
            poly[i].yel();
            poly[i].show();
            System.out.println("");
        }
    }
}

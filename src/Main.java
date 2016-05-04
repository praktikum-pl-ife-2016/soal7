
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lihat = "Ya";
        do {
            System.out.println("=====DATABASE JKT48======");
            J idolJ[] = new J[3];
            K idolK[] = new K[3];
            T idolT[] = new T[3];
            idolJ[0] = new J("Ayana", "Osaka");
            idolJ[1] = new J("Rachel", "Jakarta");
            idolJ[2] = new J("Veranda", "Jakarta");
            idolK[0] = new K("Cindy", "Jakarta");
            idolK[1] = new K("Devi", "Bandung");
            idolK[2] = new K("Hanna", "Palembang");
            idolT[0] = new T("Feni", "Ciamis");
            idolT[1] = new T("Haruka", "Tokyo");
            idolT[2] = new T("Nadhifa", "Padang");
            System.out.println("1. Tim J");
            System.out.println("2. Tim K");
            System.out.println("3. Tim T");
            System.out.print("Masukkan pilihan anda : ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    for (int i = 0; i <= 2; i++) {
                        idolJ[i].goJKT();
                        idolJ[i].show();
                        idolJ[i].yel();
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 2; i++) {
                        idolK[i].goJKT();
                        idolK[i].show();
                        idolK[i].yel();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 2; i++) {
                        idolT[i].goJKT();
                        idolT[i].show();
                        idolT[i].yel();
                    }
                    break;
            }
            System.out.println("Apa anda masih ingin melihat database yang lain? (Ya/Tidak)");
            lihat = in.next();
        } while (lihat.equalsIgnoreCase("Ya"));
        System.out.println("======TERIMA  KASIH======");
    }
}







    
    public class Main {
public static void main(String[] args) {

Member001 anggota[] = new Member001[3];
    
anggota[0] = new GrupJ("Budi","Malang");
anggota[1] = new GrupK("Soni","Jakarta");
anggota[2] = new GrupT("Fandi","Bandung");
         

System.out.println("--------Member Idol--------");   
System.out.println (" ");

for(int i= 0; i < anggota.length;i++){

 

anggota[i].show();
  
System.out.println("---------------------------");
anggota[i].GOJKT();
anggota[i].YEL();
System.out.println("---------------------------");

         }        
     }
 }


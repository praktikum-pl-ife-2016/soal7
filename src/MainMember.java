
package mainmember;

public class MainMember {

    public static void main(String[] args) {
       timJ a=new timJ("ikeh","jepang");
       timk b=new timk("adlos","indonesia");
       timT c =new timT("darnyo","arab");
       
        System.out.println("-------------data uwong-------------");
       member [] data=new member [3];
       data [0]=a;
       data [1]=b;
       data [2]=c;
       
       for (int i = 0; i < data.length; i++) {
           data [i].show();
           data[i].goJkt();
           data [i].yel();
           System.out.println("====================================== ");
           
       }
       
    }
    
}

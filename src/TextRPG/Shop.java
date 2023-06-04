package TextRPG;
import java.util.Scanner;
public class Shop {

    public int potion;
    public int armor;

    public static void menu(){
        System.out.println("상점입니다");
        System.out.println("1.포션 : 체력 50회복");
        System.out.println("2.방어구 : 50데미지를 막아준다");
        System.out.println("3.무기 : 공격력 10을 올려준다");
        System.out.println("0.상점을 나간다");

        Scanner picks = new Scanner(System.in);
        int pick = picks.nextInt();

        if(pick == 1){
            Player.potion++;
        }else if(pick == 2){
            
        }else if(pick == 3){
            
        }else if(pick == 0){
            return;
        }else {
            System.out.println("잘못입력하셨습니다.");
        }

    }

}



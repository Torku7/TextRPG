package TextRPG;
import java.util.Scanner;
public class Shop {

    public int potion;
    public int armor;

    public static void menu() {
        while (true) {

            System.out.println("상점입니다");
            System.out.println("보유 코인은 :" + Player.coin);
            System.out.println("1.포션 : 체력 50회복/코인");
            System.out.println("2.방어구 : 50데미지를 막아준다/코인");
            System.out.println("3.무기 : 공격력 5을 올려준다/코인 ");
            System.out.println("0.상점을 나간다");

            Scanner picks = new Scanner(System.in);
            int pick = picks.nextInt();

            if (pick == 1) {
                Player.potion++;
                Player.coin -= 30;//가격 조정 필요
            } else if (pick == 2) {
                if(Player.armor == 1){
                    System.out.println("이미 방어구를 착용하셨습니다.");
                }else {
                    Player.shild += 50;
                    Player.coin -= 30;//가격 조정 필요
                    Player.armor++;
                }
            } else if (pick == 3) {
                if(Player.weapon == 1){
                    System.out.println("이미 무기를 착용하셨습니다.");
                }else {
                    Player.attack += 5;
                    Player.coin -= 30;//가격 조정 필요
                    Player.weapon++;
                }
            } else if (pick == 0) {
                return;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }

        }
    }
}



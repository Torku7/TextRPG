package TextRPG;
import java.util.Scanner;
public class Shop {

    public int potion;
    public int armor;

    public static void menu() {
        try {
            while (true) {

                System.out.println("상점입니다");
                System.out.println("보유 코인은 :" + Player.coin);
                System.out.println("1.포션 : 체력 50회복/100코인");
                System.out.println("2.방어구 : 50데미지를 막아준다/200코인");
                System.out.println("3.무기 : 공격력 5을 올려준다/300코인 ");
                System.out.println("0.상점을 나간다");

                Scanner picks = new Scanner(System.in);
                int pick = picks.nextInt();

                if (pick == 1) {
                    if(Player.coin<100){
                        System.out.println("코인이 부족합니다.");
                    }else {
                        Player.potion++;
                        Player.coin -= 100;
                    }
                } else if (pick == 2) {
                    if(Player.armor == 1){
                        System.out.println("이미 방어구를 착용하셨습니다.");
                    }else {
                        if(Player.coin<200){
                            System.out.println("코인이 부족합니다.");
                        }else {
                            Player.shild += 50;
                            Player.coin -= 200;
                            Player.armor++;
                        }
                    }
                } else if (pick == 3) {
                    if(Player.weapon == 1){
                        System.out.println("이미 무기를 착용하셨습니다.");
                    }else {
                        if(Player.coin<300){
                            System.out.println("코인이 부족합니다.");
                        }else {
                            Player.attack += 5;
                            Player.coin -= 300;
                            Player.weapon++;
                        }
                    }
                } else if (pick == 0) {
                    return;
                } else {
                    System.out.println("잘못된 입력입니다.");
                }

            }
        } catch (Exception e) {
            System.out.println("잘못된 접근입니다.");
//            솔찍히 프로그램이 여기서 종료되는게 아니라 잘못된 입력 시 그냥 무시되고 다시 입력해 달라거나 이전 화면으로 돌아갔으면 좋겠음.
        }
    }
}



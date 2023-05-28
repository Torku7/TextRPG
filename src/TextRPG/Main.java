package TextRPG;

import java.util.Scanner;
import java.util.Random;

//메인코드입니다
public class Main {
    public static void main(String[] args) {

        System.out.println("어서오세요");
        System.out.println("게임을 실행하시겠습니까?");
        System.out.println("1.실행");
        System.out.println("2.종료");
        while (true) {

            Scanner go = new Scanner(System.in);
            int goend = go.nextInt();

            if (goend == 1) {
                System.out.println("게임을 실행합니다.");
                System.out.println("플레이어 이름을 입력해주세요.");

                Scanner namesc = new Scanner(System.in);
                String name = namesc.nextLine();

                Player player = new Player(105, 100);//캐릭터 정보 생성[class Player] (시작 HP ex:105/105 경험치 ex:0/100)

                System.out.println("게임을 시작합니다");



                while (true) {
                    System.out.println("1.전투");
                    System.out.println("2.휴식");
                    System.out.println("0.종료");

                    Scanner Play = new Scanner(System.in);
                    int GamePlay = Play.nextInt();

                    if (GamePlay == 1) {//캐릭터 정보가 전투클래스로 넘어가야함(HP,경험치)
                       Battle.battle(player);//전투 클래스 호출
                    } else if (GamePlay == 2) {//캐릭터 정보가 전투클래스로 넘어가야함(HP,경험치)
                       player.rest();//플레이어의 휴식 호출
                    } else if (GamePlay == 0) {
                        System.out.println("게임이 종료되었습니다.");
                        break;
                    } else {
                        System.out.println("잘못 입력하였습니다 숫자 1,2 중에 입력 해주세요.");
                    }
                }
            } else if (goend == 2) {
                System.out.println("게임이 종료되었습니다.");
                break;

            } else {
                System.out.println("잘못 입력하였습니다 숫자 1,2 중에 입력 해주세요.");

            }
            break;
        }
    }
}
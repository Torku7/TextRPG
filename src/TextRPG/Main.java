package TextRPG;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ExecutionException;

//메인코드입니다
public class Main {
    public static void main(String[] args) {

        Scanner go = new Scanner(System.in);

        try { // Try 문을 통한 잘못된 입력 받을시 종료.
            System.out.println("TextRPG에 오신 것을 환영합니다.");
            System.out.println("원하시는 항목을 입력해 주세요.");
            System.out.println("1.실행");
            System.out.println("2.종료");
            System.out.print(">> ");
            while (true) {

                int goend = go.nextInt();

                if (goend == 1) {
                    System.out.println("게임을 실행합니다.");
                    System.out.print("플레이어 이름을 입력해주세요 : ");

                    Scanner namesc = new Scanner(System.in);
                    String name = namesc.nextLine();

                    Player player = new Player(105, 100);//캐릭터 정보 생성[class Player] (시작 HP ex:105/105 경험치 ex:0/100)

                    System.out.println(name + " 님 로그인 되었습니다.");
                    System.out.println(" ");
                    System.out.println("게임을 시작합니다");
                    System.out.println(" ");


                    while (true) {
                        System.out.println("1.전투");
                        System.out.println("2.휴식");
                        System.out.println("3.상점");
                        System.out.println("0.종료");

                        Scanner Play = new Scanner(System.in);
                        int GamePlay = Play.nextInt();

                        if (GamePlay == 1) {//캐릭터 정보가 전투클래스로 넘어가야함(HP,경험치)
                            Battle.battle(player);//전투 클래스 호출
                        } else if (GamePlay == 2) {//캐릭터 정보가 전투클래스로 넘어가야함(HP,경험치)
                            player.rest();//플레이어의 휴식 호출
                        } else if (GamePlay == 3) {//상점클래스로 넘어감
                            Shop.menu();
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
        } catch (Exception e) {
            System.out.println("잘못된 접근입니다.");
        }
    }
}
package TextRPG;

import java.util.Random;
import java.util.Scanner;

//기본 플레이어 hp exp 받고 전투시 hp exp 계산식 받아와 오버라이드
//if exp = maxexp 레벨업
//레벨 오를때마다 maxexpl과 maxhp 증가
public class Player {
    public static int hp;
    public static int maxhp;
    public int exp;
    public int maxexp;
    public int level;
    public static int attack;
    public static int coin;
    public static int potion;
    public static int armor;
    public static int weapon;
    public static int shild;

    public Player(int maxhp, int maxexp) {
        this.maxhp = maxhp;
        this.hp = maxhp;
        this.maxexp = maxexp;
        this.exp=0;
        this.level=1;
        this.attack=5;
        this.coin=50;
        this.potion=1;
        this.weapon=0;
        this.armor=0;
    }


    public void updateexp(int exp){

        if(this.exp + exp < maxexp){
            this.exp += exp;
            return;
        }//exp가 maxexp보다 작을때 exp 증가만 하고 반환
        this.exp = this.exp + exp - maxexp; //레벨업 후 남은 경험치 남기기
       levelup();
    }



    public void updatecoin(int coin){
            this.coin += coin;
            return;

    }

    public void levelup(){
        System.out.println("Level Up!!!");
        level++;
        maxhp += 50;
        maxexp += 20;
        hp = maxhp;
        attack += 1;
    }

    public void rest(){
        System.out.println("너무 지친 나머지 쓰러지듯이 잠에 들었다..");
        System.out.println("ZzZzZzZzZz..");
        System.out.println(" ");
        hp = maxhp;
        System.out.println("플레이어의 체력이 회복되었습니다." + hp+"/"+maxhp);
    }

    public static void inventory(){
        while (true) {
            System.out.println("----- 소지품 목록 -----");
            System.out.println("보유 코인 : "+coin);
            System.out.println("무기 : " + weapon);
            System.out.println("방어구 : " + armor);
            System.out.println("1.포션 : " + potion);
            System.out.println("0.소지품을 나간다.");

            Scanner use = new Scanner(System.in);
            int usep = use.nextInt();

            if (usep == 1) {

                if(hp==maxhp){
                    System.out.println("이미 체력이 모두 회복되어 있습니다");
                    System.out.println("사용을 중지합니다");
                }else {
                    System.out.println("포션을 사용합니다 체력이 50 회복됩니다");
                    hp += 50;
                    if (hp>maxhp){
                        hp =maxhp;
                    }
                    potion--;
                }
                System.out.println("HP : " + hp + "/" + maxhp);

            } else if (usep == 0) {
                return;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }

    }

}
//찾아봐라냥
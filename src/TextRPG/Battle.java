package TextRPG;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//랜덤으로 못스터 하나 뽑아서 hp클래서와  exp클래스에 정보 넘기기
//The form will be created soon
//This part is handled by USER : SEUNGJIN(dntmdwls42)
public class Battle {
           public static void battle(Player player){

                   Scanner action = new Scanner(System.in);

                   Monster monster = Monster.getRandomMonster();

                   System.out.println(monster.name + "에게 습격 받았습니다.");
                   System.out.println("공격력 : "+monster.attack );
                   System.out.println("체력 : "+monster.monhp );

               while (true){
                   try {
                           TimeUnit.SECONDS.sleep(3);
                           System.out.println("----------------------");
                           System.out.println("무엇을 할까요.");
                           System.out.println("공격력 : " + Player.attack + " 실드량 : " + Player.shild);
                           System.out.println("1.공격");
                           System.out.println("2.도망친다");
                           System.out.println("3.소치품");
                   }catch(Exception e) {
                       System.out.println(e);
                   }
                           int actions = action.nextInt();

                           if(actions == 1){

                               Random rand = new Random();
                               int critical = rand.nextInt(5);

                               if( critical == 0){
                                   Player.attack += 10;
                                   monster.monhp -= player.attack; //몬스터에게 데미지를 준다.
                                   System.out.println("크리티컬이 터졌습니다.");
                                   System.out.println(player.attack + "의 데미지를 입히고 " + monster.attack + "의 데미지를 받았습니다!");
                                   System.out.println(monster.name +"의 체력은 : " + monster.monhp);
                                   Player.attack -= 10;
                               }else {
                                   monster.monhp -= player.attack; //몬스터에게 데미지를 준다.
                                   System.out.println(player.attack + "의 데미지를 입히고 " + monster.attack + "의 데미지를 받았습니다!");
                                   System.out.println(monster.name +"의 체력은 : " + monster.monhp);

                               }

                                   if(monster.monhp > 0){
                                       if(Player.armor ==1){
                                           if(Player.shild < monster.attack){
                                               monster.attack -= Player.shild;
                                               player.hp -= monster.attack;
                                               Player.shild=0;
                                               Player.armor--;
                                               System.out.println("방어구가 파괴되었습니다.");
                                           }else {
                                               Player.shild -= monster.attack;
                                           }
                                       }else {
                                           player.hp -= monster.attack;

                                           if (player.hp < 0) {
                                               System.out.println("플레이어가 죽었습니다");
                                               break;//죽은거에서 끝나면 안됨
                                           }
                                       }
                                       System.out.println("플레이어의 체력은 : " + player.hp + "실드 : " +Player.shild);
                                   }
                                   else {
                                           System.out.println("몬스터를 처리 하였습니다. 획득 경험치는 : " + monster.exp);
                                          player.updateexp(monster.exp);
                                          player.updatecoin(monster.coin);
                                          break;
                                   }

                           }
                           else if(actions == 2){
                                   System.out.println("도망치셨습니다. 전투 종료!!!");
                                   break;
                           }else if(actions ==3){
                               Player.inventory();
                           }else {
                               System.out.println("잘못입력하셨습니다.");
                           }
                   }

           }

      //필요한것 플레이어의 체력, 공격력 몬스터의 공격력, 체력



}
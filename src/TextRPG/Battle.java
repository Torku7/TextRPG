package TextRPG;
import java.util.Scanner;

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
                           System.out.println("----------------------");
                           System.out.println("무엇을 할까요.");
                           System.out.println("1.공격");
                           System.out.println("2.도망친다");

                           int actions = action.nextInt();

                           if(actions == 1){

                                  monster.monhp -= player.attack; //몬스터에게 데미지를 준다.
                               System.out.println(player.attack + "의 데미지를 입혔습니다!");
                               System.out.println(monster.attack + "의 데미지를 받았습니다!");
                                   System.out.println(monster.name+"의 체력은 : " + monster.monhp);

                                   if(monster.monhp > 0){
                                           player.hp -= monster.attack;
                                           System.out.println("플레이어의 체력은 : " + player.hp);

                                           if (player.hp <0){
                                                   System.out.println("플레이어가 죽었습니다");
                                                   break;//죽은거에서 끝나면 안됨
                                           }
                                   }
                                   else {
                                           System.out.println("몬스터를 처리 하였습니다. 획득 경험치는 : " + monster.exp);
                                          player.updateexp(monster.exp);
                                          break;
                                   }

                           }
                           else {
                                   System.out.println("도망치셨습니다. 전투 종료!!!");
                                   break;
                           }
                   }

           }

      //필요한것 플레이어의 체력, 공격력 몬스터의 공격력, 체력



}
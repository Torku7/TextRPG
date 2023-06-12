package TextRPG;
import java.util.Random;

//할 일 : 전체 Monster에게 Coin 과 체력 공격력 수정하기

/*
 * 몬스터
 * 종류가 있다. 고블린, 오크, 트롤
 * 공격력 10 20 30
 * 경험치가 필요 20 ~ 50 완전 랜덤 아무 상관 없음
 */
public class Monster {
    public int attack;
    public String name;
    public int exp;
    public int monhp;
    public int coin;

    public Monster(String name, int attack, int monhp) {
        this.name = name;
        this.attack = attack;
        this.monhp =monhp;
        this.coin = coin;
    }

    public static Monster getRandomMonster() {
        Random monrand = new Random();
        int monsterrand = monrand.nextInt(30)+1; //시작 위치로부터(1 에서부터 시작) Bound 30값(1이후부터 30번까지의 랜덤 숫자) 즉 1~30중 하나를 출력함.

        System.out.println("[DEV Option] 몬스터 값이 " + monsterrand + "(으)로 지정되었습니다."); // 몬스터가 랜덤으로 잘 출력되는지 확인시켜줌. 불필요시 주석처리바람.

        return switch (monsterrand) {
            case 1 -> new Swiftfury();
            case 2 -> new Shadowstriker();
            case 3 -> new Bloodraven();
            case 4 -> new Icebreaker();
            case 5 -> new Stormwalker();
            case 6 -> new Soulspark();
            case 7 -> new Bladeheart();
            case 8 -> new Sweetcloud();
            case 9 -> new Grimreapers();
            case 10 -> new Icewrath();
            case 11 -> new Whiteflame();
            case 12 -> new Soulstrider();
            case 13 -> new Shadowblade();
            case 14 -> new Bloodspark();
            case 15 -> new Stoneheart();
            case 16 -> new Swiftsoul();
            case 17 -> new Lightblade();
            case 18 -> new Darkstorm();
            case 19 -> new Bloodwatch();
            case 20 -> new Iceblade();
            case 21 -> new Flamespark();
            case 22 -> new Shadowflame();
            case 23 -> new Stoneblade();
            case 24 -> new Grimheart();
            case 25 -> new Whitewalker();
            case 26 -> new Soulblaze();
            case 27 -> new Arkshadow();
            case 28 -> new Flameheart();
            case 29 -> new Swiftstone();
            case 30 -> new Darkblade();
            default -> null;
        };
    }
/*
       public static void main(String[] args) {
            Monster monster = getRandomMonster();
            System.out.println(monster.name + "에게 습격 받았습니다.");
            System.out.println(monster.attack + "의 데미지를 받았습니다.");
            System.out.println(monster.exp + "의 경험치 획득");
           System.out.println("몬스터 클래스");
        }

*/
}

class Swiftfury extends Monster {

    public Swiftfury() {
        super("Swiftfury", 1, 5);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);//다른 몬스터에도 코인 적용 바람 수식 구간은 알아서 변경

    }
}

class Shadowstriker extends Monster {

    public Shadowstriker() {
        super("Shadowstriker", 2, 5);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Bloodraven extends Monster {

    public Bloodraven() {
        super("Bloodraven", 3, 5);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Icebreaker extends Monster {

    public Icebreaker() {
        super("Icebreaker", 4, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Stormwalker extends Monster {

    public Stormwalker() {
        super("Stormwalker", 5, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Soulspark extends Monster {

    public Soulspark() {
        super("Soulspark", 6, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Bladeheart extends Monster {

    public Bladeheart() {
        super("Bladeheart", 7, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Sweetcloud extends Monster {

    public Sweetcloud() {
        super("Sweetcloud", 8, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Grimreapers extends Monster {

    public Grimreapers() {
        super("Grimreapers", 9, 35);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Icewrath extends Monster {

    public Icewrath() {
        super("Icewrath", 10, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Whiteflame extends Monster {

    public Whiteflame() {
        super("Whiteflame", 11, 10);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Soulstrider extends Monster {

    public Soulstrider() {
        super("Soulstrider", 12, 15);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Shadowblade extends Monster {

    public Shadowblade() {
        super("Shadowblade", 13, 15);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Bloodspark extends Monster {

    public Bloodspark() {
        super("Bloodspark", 14, 15);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Stoneheart extends Monster {

    public Stoneheart() {
        super("Stoneheart", 15, 15);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Swiftsoul extends Monster {

    public Swiftsoul() {
        super("Swiftsoul", 16, 15);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Lightblade extends Monster {

    public Lightblade() {
        super("Lightblade", 17, 20);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Darkstorm extends Monster {

    public Darkstorm() {
        super("Darkstorm", 18, 20);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Bloodwatch extends Monster {

    public Bloodwatch() {
        super("Bloodwatch", 19, 55);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Iceblade extends Monster {

    public Iceblade() {
        super("Iceblade", 20, 20);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Flamespark extends Monster {

    public Flamespark() {
        super("Flamespark", 21, 20);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Shadowflame extends Monster {

    public Shadowflame() {
        super("Shadowflame", 22, 25);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Stoneblade extends Monster {

    public Stoneblade() {
        super("Stoneblade", 23, 25);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Grimheart extends Monster {

    public Grimheart() {
        super("Grimheart", 24, 25);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Whitewalker extends Monster {

    public Whitewalker() {
        super("Whitewalker", 25, 25);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Soulblaze extends Monster {

    public Soulblaze() {
        super("Soulblaze", 26, 87);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Arkshadow extends Monster {

    public Arkshadow() {
        super("Arkshadow", 27, 30);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Flameheart extends Monster {

    public Flameheart() {
        super("Flameheart", 28, 30);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Swiftstone extends Monster {

    public Swiftstone() {
        super("Swiftstone", 29, 30);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}

class Darkblade extends Monster {

    public Darkblade() {
        super("Darkblade", 30, 30);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);
    }
}
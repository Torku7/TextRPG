package TextRPG;
import java.util.Random;

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
            int monsterrand = monrand.nextInt(9)+1; //시작 위치로부터(1 에서부터 시작) Bound 9값(1이후부터 9번까지의 랜덤 숫자) 즉 1~10중 하나를 출력함.

            switch (monsterrand) {
                case 1:
                    return new Trynden();
                case 2:
                    return new Shadowstrider();
                case 3:
                    return new Bloodraven();
                case 4:
                    return new Icebind();
                case 5:
                    return new Whiteflame();
                case 6:
                    return new Soulblade();
                case 7:
                    return new Stormbreak();
                case 8:
                    return new Darkheart();
                case 9:
                    return new Grimreapers();
                case 10:
                    return new Bloodwatch();
            }
            return null;
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

class Trynden extends Monster {

    public Trynden() {
        super("Trynden", 10, 30);
        this.exp = (int) (Math.random() * 30 + 20);
        this.coin =  (int) (Math.random() * 30 + 20);//다른 몬스터에도 코인 적용 바람 수식 구간은 알아서 변경
        
    }
}

    class Shadowstrider extends Monster {

        public Shadowstrider() {
            super("Shadowstrider", 20, 40);
            this.exp = (int) (Math.random() * 30 + 20);
        }
    }

    class Bloodraven extends Monster {

        public Bloodraven() {
            super("Bloodraven", 30, 50);
            this.exp = (int) (Math.random() * 30 + 20);
        }
    }

class Icebind extends Monster {

    public Icebind() {
        super("Icebind", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

class Whiteflame extends Monster {

    public Whiteflame() {
        super("Whiteflame", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

class Soulblade extends Monster {

    public Soulblade() {
        super("Soulblade", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

class Stormbreak extends Monster {

    public Stormbreak() {
        super("Stormbreak", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

class Darkheart extends Monster {

    public Darkheart() {
        super("Darkheart", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

class Grimreapers extends Monster {

    public Grimreapers() {
        super("Grimreapers", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

class Bloodwatch extends Monster {

    public Bloodwatch() {
        super("Bloodwatch", 30, 50);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}
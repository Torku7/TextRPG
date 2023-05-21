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

        public Monster(String name, int attack) {
            this.name = name;
            this.attack = attack;
        }

        public static Monster getRandomMonster() {
            Random Monrand = new Random();
            int Monsterrand = Monrand.nextInt(3);

            switch (Monsterrand) {
                case 0:
                    return new Goblin();
                case 1:
                    return new Oak();
                case 2:
                    return new Troll();
            }
            return null;
        }

       public static void main(String[] args) {
            Monster monster = getRandomMonster();
            System.out.println(monster.name + "에게 습격 받았습니다.");
            System.out.println(monster.attack + "의 데미지를 받았습니다.");
            System.out.println(monster.exp + "의 경험치 획득");
        }
    }

class Goblin extends Monster {

    public Goblin() {
        super("Goblin", 10);
        this.exp = (int) (Math.random() * 30 + 20);
    }
}

    class Oak extends Monster {

        public Oak() {
            super("Oak", 25);
            this.exp = (int) (Math.random() * 30 + 20);
        }
    }

    class Troll extends Monster {

        public Troll() {
            super("Troll", 40);
            this.exp = (int) (Math.random() * 30 + 20);
        }
    }



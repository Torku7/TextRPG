package TextRPG;
//기본 플레이어 hp exp 받고 전투시 hp exp 계산식 받아와 오버라이드
//if exp = maxexp 레벨업
//레벨 오를때마다 maxexpl과 maxhp 증가
public class Player {
    public int hp;
    public int maxhp;
    public int exp;
    public int maxexp;
    public int level;
    public int attack;

    public Player(int maxhp, int maxexp) {
        this.maxhp = maxhp;
        this.hp = maxhp;
        this.maxexp = maxexp;
        this.exp=0;
        this.level=1;
        this.attack=5;
    }

    public void updateexp(int exp){

        if(this.exp + exp < maxexp){
            this.exp += exp;
            return;
        }//exp가 maxexp보다 작을때 exp 증가만 하고 반환
        this.exp = this.exp + exp - maxexp; //레벨업 후 남은 경험치 남기기
       levelup();
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
        hp = maxhp;
        System.out.println("플레이어의 체력이 회복되었습니다." + hp+"/"+maxhp);
    }

}

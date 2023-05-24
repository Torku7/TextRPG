package TextRPG;

//랜덤으로 못스터 하나 뽑아서 hp클래서와  exp클래스에 정보 넘기기

//The form will be created soon
//This part is handled by USER : SEUNGJIN(dntmdwls42)
public class Battle {
    public static void main(String[] args) {
        Monster randomMonster = Monster.getRandomMonster(); //몬스터 클래스의 getRandomMonster호출
        System.out.println(randomMonster.name + "에게 습격 받았습니다.");
        System.out.println(randomMonster.attack + "의 데미지를 받았습니다.");
        System.out.println(randomMonster.exp + "의 경험치 획득");
        System.out.println("배틀 클래스");
    }

}
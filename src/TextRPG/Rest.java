package TextRPG;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Rest {

    private int attackValue;
    
   
    public Player() {
        this.attackValue = 0; // Initial attack value
    }
    
    
    public void increaseAttackValue(int amount) {
        attackValue += amount;
        System.out.println("Supplementing attack value");
        System.out.println("Attack value: " + attackValue + "%");
    }
   
    public int getAttackValue() {
        return attackValue;
    }
    
    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }
}


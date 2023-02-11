import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int score = 2;
        int depositAccount = 4_450;
        int bonus;
        if (depositAccount > 1_000) {
            bonus = depositAccount / 100;
        }
        else {
            bonus =0;
        }
        int balance = (score + depositAccount + bonus);
        System.out.println("Спасибо за ваш платеж. Ваш баланс составляет: " + balance + " руб. Ваш бонус: " + bonus + " руб.");
    }
}

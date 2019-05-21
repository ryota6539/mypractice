import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("あなたの出したいものを選んでください");
        System.out.println("0=グー");
        System.out.println("1=パー");
        System.out.println("2;チョキ");
        Scanner sc = new Scanner(System.in);
        int yourHand = sc.nextInt();
        if (yourHand == 0) {
            System.out.println("グー");
        }else if (yourHand ==1){
            System.out.println("パー");
        }else if (yourHand ==2){
            System.out.println("チョキ");
        }

        Random random = new Random();
        int myHand = random.nextInt(3);
        if (myHand == 0) {
            System.out.println("グー");
        }else if (myHand ==1){
            System.out.println("パー");
        }else if (myHand ==2){
            System.out.println("チョキ");
        }

        if (myHand == yourHand){
            System.out.println("あいこです。");
        }else if (myHand == 0&&yourHand ==1){
            System.out.println("あなたの勝ちです。");
        }else if (myHand == 1&&yourHand ==2){
            System.out.println("あなたの勝ちです。");
        }else if (myHand ==2&&yourHand ==0){
            System.out.println("あなたの勝ちです。");
        }else if (myHand ==0&&yourHand ==2){
            System.out.println("あなたの負けです");
        }else if (myHand ==1&&yourHand ==0){
            System.out.println("あなたの負けです");
        }else if (myHand ==2&&yourHand ==1){
            System.out.println("あなたの負けです");
        }
    }
}

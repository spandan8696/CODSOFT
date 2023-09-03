import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int a = 1;
        int b = 100;

        System.out.println("<< NUMBER GUESSING GAME >>");
        System.out.println(">> GAME RULES:");
        System.out.println("1. Total attempts: 10.");
        System.out.println("2. SCORE : (20/nth attempts) Eg: attempt 4 : correct score = 20/4 = 5.");
        System.out.println("3. Guess between 1 to 100.");



        for (int r = 0; r <= 2; r++) {
            System.out.println("PRESS 1 TO PLAY GAME OR PRESS 2 TO END:");
            int op = sc.nextInt();
            int x = rn.nextInt(b - a + 1) + a;
            switch (op) {
                case 1 -> {
                    System.out.println("GUESS A NUMBER IN BETWEEN 1 TO 100");
                    //System.out.println(x); //(for testing purpose)
                    for (int y = 1; y <= 10; y++) {

                        System.out.println("ATTEMPT NO. : " + y);
                        int g = sc.nextInt();
                        int g2 = g - x;

                        if (g == x) {
                            System.out.println("...C O R R E C T...");
                            System.out.println("Your Score is : " + 20 / y);
                            break;

                        } else if (g > x && -5 <= g2 && g2 <= 5) {
                            System.out.println("High but Close");

                        } else if (g < x && -5 <= g2 && g2 <= 5) {
                            System.out.println("Low but Close");

                        } else if (g > x) {
                            System.out.println("High and Far too");

                        } else {
                            System.out.println("Low and Far too");
                        }


                    }
                    System.out.println("The correct Answer is : " + x);
                }
                case 2 -> {
                    System.out.println("<< THE END >>");
                    return;
                }
            }
        }

    }
}

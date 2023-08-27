import java.util.Scanner;

public class StudentGC {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF SUBJECTS");
        int n = sc.nextInt();
        int total=0;

        for (int i = 1; i <= n; i++) {
            System.out.println("ENTER THE MARKS OF SUBJECT-"+i+" :");
            int m = sc.nextInt();
            total = total + m;
        }


            System.out.println("THE TOTAL MARKS OBTAINED BY YOU : " + total);

            double a = ((double) total / n);

            System.out.printf("THE AVERAGE PERCENTAGE IS : %.2f", a);
            System.out.print(" %");
            System.out.println();

            if (a >= 90) {
                System.out.println("GRADE : A+");
            } else if (a >= 85) {
                System.out.println("GRADE : A");
            } else if (a >= 80) {
                System.out.println("GRADE : A-");
            } else if (a >= 75) {
                System.out.println("GRADE : B+");
            } else if (a >= 70) {
                System.out.println("GRADE : B");
            } else if (a >= 65) {
                System.out.println("GRADE : C+");
            } else if (a >= 60) {
                System.out.println("GRADE : C");
            } else if (a >= 55) {
                System.out.println("GRADE : D+");
            } else if (a >= 50) {
                System.out.println("GRADE : D");
            } else if (a >= 40) {
                System.out.println("GRADE : E");
            } else {
                System.out.println("GRADE : F");
            }
    }
}

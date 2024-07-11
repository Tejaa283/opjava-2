 import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        System.out.println("N: " + N);

        int Q = scanner.nextInt();
        System.out.println("Q: " + Q);

        int A = scanner.nextInt();
        System.out.println("A: " + A);

        int B = scanner.nextInt();
        System.out.println("B: " + B);

        int totalCost = 0;
        int lastA = A;
        int lastB = B;

        for (int i = 0; i < Q; i++) {
            int X = scanner.nextInt();
            System.out.println("X: " + X);

            if (Math.abs(X - lastA) < Math.abs(X - lastB)) {
                totalCost += Math.abs(X - lastA);
                lastA = X;
            } else {
                totalCost += Math.abs(X - lastB);
                lastB = X;
            }

            System.out.println("totalCost: " + totalCost);
            System.out.println("lastA: " + lastA);
            System.out.println("lastB: " + lastB);
        }

        System.out.println("totalCost: " + totalCost);

        scanner.close();
    }
}
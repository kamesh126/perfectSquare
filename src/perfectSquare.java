import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int i, p = 0;

        for (i = 1; i <= n; i++) {
            if (n == i * i) {
                p = i;
            }
        }
        if (p * p == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}








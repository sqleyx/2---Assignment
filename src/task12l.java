import java.util.Scanner;

public class task12l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (n <= k) {
            System.out.println(2 * m);
        } else {
            int batches = (2 * n + k - 1) / k;
            System.out.println(batches * m);
        }
    }
}

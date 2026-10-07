import java.util.Scanner;

public class task10j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int price = a * 100 + b;
        int payment = c * 100 + d;

        int change = payment - price;

        System.out.println(change / 100 + " " + change % 100);
    }
}

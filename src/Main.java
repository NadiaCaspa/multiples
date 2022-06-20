import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter positive integer: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 2 != 0 ) {
                System.out.println(i + " is a multiple of 3");
                System.out.println();
            }
        }
    }
}
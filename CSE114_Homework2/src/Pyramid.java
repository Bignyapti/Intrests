//Bignyapti Tripathi 116152152
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int row = 1; row <= numberOfLines; row++) {
            for (int i = 1; i <= numberOfLines - row; i++) {
                System.out.print("    ");
            }

            for (int i = 0; i < row; i++) {
                System.out.printf("%4d", (int) Math.pow(2, i));
            }

            for (int i = row - 2; i >= 0; i--) {
                System.out.printf("%4d", (int) Math.pow(2, i));
            }

            System.out.println();
        }

        input.close();
    }
}

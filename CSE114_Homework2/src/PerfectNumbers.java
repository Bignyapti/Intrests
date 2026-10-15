//Bignyapti Tripathi 116152152
import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        System.out.print("The perfect numbers below " + upperLimit + " are: ");

        for (int number = 1; number <= upperLimit; number++) {
            int sum = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == number) {
                System.out.print(number + " ");
            }
        }

        input.close();
    }
}

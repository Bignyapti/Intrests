//Bignyapti Tripathi 116152152
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = input.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        System.out.print("The Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are: ");

        for (int number = lowerLimit; number <= upperLimit; number++) {
            int sum = 0, temp = number, digits = String.valueOf(number).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }

        input.close();
    }
}

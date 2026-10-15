//Bignyapti Tripath 116152152
import java.util.Scanner;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        int index = 0;

        while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }

        if (index > 0) {
            System.out.println("The common prefix is: " + str1.substring(0, index));
        } else {
            System.out.println(str1 + " and " + str2 + " have no common prefix.");
        }

        input.close();
    }
}

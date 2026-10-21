import java.util.Scanner;

public class IT26102726Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1, sum = 0;
        String numbers = "";

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            sum = sum + num;
            numbers = numbers + num + " ";
            i++;
        }

        double average = sum / 10.0;

        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
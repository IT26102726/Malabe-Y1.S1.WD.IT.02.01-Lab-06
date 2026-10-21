import java.util.Scanner;

public class IT26102726Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, count = 0;
        double sum = 0;

        System.out.println("Enter positive integers (-99 to stop):");

        System.out.print("Enter a number: ");
        num = input.nextInt();

        while (num != -99) {

            if (num >= 0) {
                sum = sum + num * num;
                count++;
            } else {
                System.out.println("Invalid input!");
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        if (count > 0) {
            double rms = Math.sqrt(sum / count);
            System.out.println("RMS = " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
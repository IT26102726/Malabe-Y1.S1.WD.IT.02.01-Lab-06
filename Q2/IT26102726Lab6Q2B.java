import java.util.Scanner;

public class IT26102726Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;

        System.out.println("Enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            
            i++;
        }
		
    }
}
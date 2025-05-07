package partB.ex03;
import java.util.Scanner;
public class DisplayMultiples {
    public static String displayWithMultiples() {
        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int value = input.nextInt();
        System.out.println("All of these numbers are a multiple of " + value + ":");
        int num = 0;
        while (num < 50)
        {
            System.out.print(num +  " ");
            num+=value;
        }
        return response;
    }

    public static void main(String[] args) {
        String displayOutput = displayWithMultiples();
        System.out.print(displayOutput);
    }
}

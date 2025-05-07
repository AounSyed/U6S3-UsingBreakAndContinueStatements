package partB.ex01;
import java.util.Scanner;
public class LoopWithBreak {
    public static String loopWithBreak() {
        String response = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0)
        {
            if (num < 0)
            {
                break;
            }
            else
            {
                sum += num;
            }
            num = input.nextInt();
        }
        System.out.println(sum);


        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithBreak();
        System.out.print(loopOutput);
    }

}

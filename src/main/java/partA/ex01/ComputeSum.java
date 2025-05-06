package partA.ex01;
import java.util.Scanner;
public class ComputeSum {

    public static int computeSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = computeSum();
        System.out.print(sum);
    }
    }


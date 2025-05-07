package partB.ex02;

public class LoopWithContinue {
    public static String loopWithContinue() {
        String response = "";
        for (int i = 1; i < 11; i++)
        {
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithContinue();
        System.out.print(loopOutput);
    }

}

package partA.ex02;

public class CountChar {
    public static String countChar() {
        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;

        int i = 0;
        do
        {
            i++;
            count++;
        }while (str.charAt(i) == 'w');

        str += (" Counting w : " + count);
        return str;
    }

    public static void main(String[] args) {
        String charOutput = countChar();
        System.out.print(charOutput);
    }


    }


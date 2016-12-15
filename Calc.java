import java.util.Scanner;

/**
 * Created by Влад on 15.12.2016.
 */
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str =
                scanner.nextLine();
        System.out.println(str);
        do {

            double res = 0;
            String[] splits = str.split(" ");

            if (splits[0].equals( "-") | splits[0] != "+" | splits[0] != "*" | splits[0] != "/") {
                double a = Double.parseDouble(splits[0]);
                char mark = splits[1].charAt(0);
                double b = Double.parseDouble(splits[2]);
                res = calc(a, b, mark);
            } else {
                char mark = splits[0].charAt(0);
                double b = Double.parseDouble(splits[1]);
                res = calc(res, b, mark);
            }
            System.out.println("Result= " + res);

        }
        //////////////sadacascascaca
        while (str=="exit");

    }

    public static double calc(double a,double b ,char mark) {
        double res=0;
        switch (mark) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Не удалось !");

        }
        return res;
    }
}

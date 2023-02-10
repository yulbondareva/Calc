import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = scanner.nextLine();
        char op;
        String[] dat;
        if (str.contains("+")) {
            dat = str.split("\\+");
            op = '+';
        } else if (str.contains("-")) {
            dat = str.split("-");
            op = '-';
        } else if (str.contains("*")) {
            dat = str.split("\\*");
            op = '*';
        } else if (str.contains("/")) {
            dat = str.split("/");
            op = '/';
        } else {
            throw new Exception("Некорректный знак!");
        }
        if (op == '*' || op == '/') {
            if (dat[1].contains("\"")) throw new Exception("Делить или умножать строку можно только на число!");
        }
        for (int i = 0; i < dat.length; i++) {
            dat[i] = dat[i].replace("\"", "");
        }
        if (op == '+') {
            System.out.println(dat[0] + dat[1]);
        } else if (op == '*') {
            int a = Integer.parseInt(dat[1]);
            String res = "";
            for (int i = 0; i < a; i++) {
                res += dat[0];
                System.out.print(dat[0]);
            }
            printIn(dat[0]);

        } else if (op == '-') {
            int b = dat[0].indexOf(dat[1]);
            if (b == -1) {
                printIn(dat[0]);
            } else {
                String res = dat[0].substring(0, b);
                res = res + dat[0].substring(b + dat[1].length());
                printIn(res);
            }
        } else {
            int c = dat[0].length()/Integer.parseInt(dat[1]);
            String res = dat[0].substring(0, c);
            System.out.println(res);
        }

    }

     static void printIn(String s) {
         System.out.println("");

    }


}




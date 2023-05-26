package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первое число \"a\": ");
            int secondaryArg = promptInt("Введите первое число \"b(i)\": ");
            iCalculable calculator = calculableFactory.create(primaryArg, secondaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второе число \"a\": ");
                    int sec = promptInt("Введите второе число \"b(i)\": ");
                    calculator.multi(arg, sec);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второе число \"a\": ");
                    int sec = promptInt("Введите второе число \"b(i)\": ");
                    calculator.sum(arg, sec);
                    continue;
                }
                if (cmd.equals("=")) {
                    // iCalculable result = calculator.getResult();
                    System.out.printf("Результат %d\n", calculator);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

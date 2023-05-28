package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double primaryArg = promptDouble("Введите первое число \"a\": ");
            double secondaryArg = promptDouble("Введите первое число \"b(i)\": ");
            ComplexNumber firstComplex = new ComplexNumber(primaryArg, secondaryArg);
            iCalculable calculator = calculableFactory.create(firstComplex);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    double arg = promptDouble("Введите второе число \"a\": ");
                    double sec = promptDouble("Введите второе число \"b(i)\": ");
                    calculator.multi(arg, sec);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg = promptDouble("Введите второе число \"a\": ");
                    double sec = promptDouble("Введите второе число \"b(i)\": ");
                    calculator.sum(arg, sec);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg = promptDouble("Введите второе число \"a\": ");
                    double sec = promptDouble("Введите второе число \"b(i)\": ");
                    calculator.divide(arg, sec);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат %d\n", result.toString());
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

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}

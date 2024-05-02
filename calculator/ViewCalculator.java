package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double primaryArg = promptDouble("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, /, +, =) : ");
                if (cmd.equals("*")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.divide(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    System.out.println("Результат:");
                    System.out.println(result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (y/n)?");
            if (cmd.equals("y")) {
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
        System.out.println(message);
        return Double.parseDouble(in.nextLine());
    }
}

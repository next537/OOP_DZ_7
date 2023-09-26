package OOP.Seminar_7;

import java.util.Scanner;

public class ViewCalculator {

    private CalcFactor CalcFactory;

    public ViewCalculator(CalcFactor calculableFactory) {
        this.CalcFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            double real1 = promptDouble("Введите реальную часть первого числа: ");
            double imag1 = promptDouble("Введите мнимую часть первого числа: ");
            ComplexNumber primaryArg = new ComplexNumber(real1, imag1);
            Calc calculator = CalcFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, -, /, =) : ");
                if (cmd.equals("*")) {
                    double real2 = promptDouble("Введите реальную часть второго числа: ");
                    double imag2 = promptDouble("Введите мнимую часть второго числа: ");
                    ComplexNumber arg = new ComplexNumber(real2, imag2);
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double real2 = promptDouble("Введите реальную часть второго числа: ");
                    double imag2 = promptDouble("Введите мнимую часть второго числа: ");
                    ComplexNumber arg = new ComplexNumber(real2, imag2);
                    System.out.println(calculator.sum(arg));
                    ;
                    continue;
                }
                if (cmd.equals("-")) {
                    double real2 = promptDouble("Введите реальную часть второго числа: ");
                    double imag2 = promptDouble("Введите мнимую часть второго числа: ");
                    ComplexNumber arg = new ComplexNumber(real2, imag2);
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double real2 = promptDouble("Введите реальную часть второго числа: ");
                    double imag2 = promptDouble("Введите мнимую часть второго числа: ");
                    ComplexNumber arg = new ComplexNumber(real2, imag2);
                    calculator.divide(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.print("Результат ");
                    System.out.printf(String.valueOf(result));
                    break;
                }
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
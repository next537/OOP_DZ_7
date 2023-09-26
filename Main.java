package OOP.Seminar_7;

public class Main {
    public static void main(String[] args) {
        CalcFactor calculableFactory = new LogCalcFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}

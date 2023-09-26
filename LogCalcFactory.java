package OOP.Seminar_7;

public class LogCalcFactory implements CalcFactor {

    private Loggable logger;

    public LogCalcFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calc create(ComplexNumber primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}

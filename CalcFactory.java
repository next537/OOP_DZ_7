package OOP.Seminar_7;

public class CalcFactory implements CalcFactor {

    public Calc create(ComplexNumber primaryArg) {
        return new Calculator(primaryArg);
    }

}

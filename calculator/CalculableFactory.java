package calculator;

public class CalculableFactory implements iCalculableFactory {
    public iCalculable create(int primaryArg, int secondaryArg) {
        return new Calculator(primaryArg,secondaryArg);
    }
}

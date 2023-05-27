package calculator;
public class CalculableFactory implements iCalculableFactory {
    public iCalculable create(ComplexNumber complex) {
        return new Calculator(complex);
    }
}

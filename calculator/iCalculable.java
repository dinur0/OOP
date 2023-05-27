package calculator;

public interface iCalculable {
    iCalculable sum(double arg, double secArg);
    iCalculable multi(double arg, double secArg);
    iCalculable divide(double arg, double secArg); 
    ComplexNumber getResult();
}

package calculator;


public final class Calculator implements iCalculable {

    private ComplexNumber complex;

    public Calculator(ComplexNumber complex) {
        this.complex = complex;
    }

    public Calculator(double primaryArg, double secondaryArg) {
    }

    @Override
    public iCalculable sum(double arg, double secArg) {
        complex.setFirst(complex.getFirst()+arg);
        complex.setSecond(complex.getSecond()+secArg);
        return this;
    }

    @Override
    public iCalculable multi(double arg, double secArg) {
        complex.setFirst(complex.getFirst() * arg - (complex.getSecond() * secArg * (-1))); //i^2 =-1
        complex.setSecond(complex.getFirst() * secArg + complex.getSecond() * arg);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return complex;
    }
    /*переопределение TOString метода */
    @Override
    public String toString() {
        if (complex.getSecond() == 0) return complex.getFirst() + "";
        if (complex.getFirst() == 0) return complex.getSecond() + "i";
        if (complex.getSecond() <  0) return complex.getFirst() + " - " + (-(complex.getSecond())) + "i";
        return complex.getFirst() + " + " + complex.getSecond() + "i";
    }

    @Override
    public iCalculable divide(double c, double d) {
        complex.setFirst((complex.getFirst()*c+complex.getSecond()*d)/(c*c+d*d));
        complex.setSecond((complex.getSecond()*c+complex.getFirst()*d)/(c*c+d*d));
        return this;
    }
}

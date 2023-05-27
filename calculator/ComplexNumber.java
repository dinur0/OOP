package calculator;
public class ComplexNumber {

    private double first;
    private double second;

    public ComplexNumber(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }
    
    /*переопределение метода ToString */

    @Override
    public String toString() {
        if (second == 0) return first + "";
        if (first == 0) return second + "i";
        if (second <  0) return first + " - " + (-second) + "i";
        return first + " + " + second + "i";
    }
}

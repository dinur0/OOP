package calculator;

public final class Calculator implements iCalculable {

    private int primaryArg;
    private int secondaryArg;

    public Calculator(int primaryArg,int secondaryArg) {
        this.primaryArg = primaryArg;
        this.secondaryArg = secondaryArg;
    }

    @Override
    public iCalculable sum(int arg, int secArg) {
        primaryArg += arg;
        secondaryArg += secArg;
        return this;
    }

    @Override
    public iCalculable multi(int arg, int secArg) {
        primaryArg = primaryArg * arg - (secondaryArg * secArg * (-1)); //i^2 =-1
        secondaryArg = primaryArg * secArg + secondaryArg * arg;
        return this;
    }

    @Override
    public iCalculable getResult() {
        return this;
    }

    @Override
    public String toString() {
        if (secondaryArg == 0) return primaryArg + "";
        if (primaryArg == 0) return secondaryArg + "i";
        if (secondaryArg <  0) return primaryArg + " - " + (-secondaryArg) + "i";
        return primaryArg + " + " + secondaryArg + "i";
    }
}

package calculator;

public class LogCalcFactory implements iCalculableFactory{
    private iLoggable logger;

public LogCalcFactory(iLoggable logger){
    this.logger = logger;
}

    public iCalculable create(int primaryArg, int secondaryArg) {
        return new Decorator(new Calculator(primaryArg, secondaryArg),logger);
    }
}


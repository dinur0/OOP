package calculator;

public class LogCalcFactory implements iCalculableFactory{
    private iLoggable logger;

public LogCalcFactory(iLoggable logger){
    this.logger = logger;
}

    public iCalculable create(ComplexNumber comp) {
        return new Decorator(new Calculator(comp),logger);
    }
}


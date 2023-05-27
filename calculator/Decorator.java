package calculator;

public class Decorator implements iCalculable {
    private iCalculable calculatorThis;
    private iLoggable logger;

    public Decorator(iCalculable calculatorThis,iLoggable logger){
    this.calculatorThis = calculatorThis;
    this.logger = logger;
}

    @Override 
    public iCalculable sum(double arg, double secArg) {
        ComplexNumber compl = calculatorThis.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", compl.getFirst(),compl.getSecond(), arg, secArg));
        iCalculable res = calculatorThis.sum(arg,secArg);
        logger.log(String.format("Вызова метода sum произошел"));
        return res;
    }

    @Override 
    public iCalculable multi(double arg, double secArg) {
        ComplexNumber compl = calculatorThis.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", compl.getFirst(),compl.getSecond(), arg, secArg));
        iCalculable res = calculatorThis.multi(arg,secArg);
        logger.log(String.format("Вызова метода multi произошел"));
        return res;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber res = calculatorThis.getResult();
        logger.log(String.format("Получение результата %d", res));
        return res;
    }
    @Override
    public iCalculable divide(double arg, double secArg) {
        ComplexNumber compl = calculatorThis.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода divide с параметром %d", compl.getFirst(),compl.getSecond(), arg, secArg));
        iCalculable res = calculatorThis.divide(arg,secArg);
        logger.log(String.format("Вызова метода divide произошел"));
        return res;
    }

    
}

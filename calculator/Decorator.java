package calculator;

public class Decorator implements iCalculable {
    private iCalculable calculatorThis;
    private iLoggable logger;

    public Decorator(iCalculable calculatorThis,iLoggable logger){
    this.calculatorThis = calculatorThis;
    this.logger = logger;
}
// комп. числа создать как классы?
    @Override 
    public iCalculable sum(int arg, int secArg) {
        // iCalculable primaryArg += calculatorThis.getResult();
        // logger.log(".............");
        // return this;
    }

    @Override
    public iCalculable multi(int arg, int secArg) {
        // primaryArg = primaryArg * arg - (secondaryArg * secArg * (-1)); //i^2 =-1
        // secondaryArg = primaryArg * secArg + secondaryArg * arg;
        // return this;
    }

        @Override
        // public iCalculable getResult() {
        //     return this;
    }

    
}

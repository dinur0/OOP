package DIP;

public class Car {
    private EnginesService engine;

    public Car(EnginesService engine) {
    this.engine = engine;
    }
    
    public void start() {
        engine.startEngine();
    }
    }
    

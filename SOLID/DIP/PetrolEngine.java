package DIP;

public class PetrolEngine implements EnginesService{

    @Override
    public void startEngine() {
        this.engine.start();   
    }
    
}

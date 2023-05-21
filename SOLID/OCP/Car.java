package OCP;

public class Car extends Vehicle {
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle){
        return super.getMaxSpeed() * 0.8;
    }
    
}

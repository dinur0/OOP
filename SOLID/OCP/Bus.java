package OCP;

public class Bus extends Vehicle {
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle){
        return super.getMaxSpeed() * 0.6;
    }
}

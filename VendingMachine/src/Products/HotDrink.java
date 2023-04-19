package Products;

public class HotDrink extends BottleOfWater {
    private int temperature;
    public HotDrink(String name, double price, int volume, int temperature){
        super(name,price,volume);
        this.temperature = temperature;
    }
/**
 * метод получения температуры
 */
    public int getTemp() {
        return temperature;
    }
/**
 * метод установки температуры
 */
    public void setTemp(int temperature) {
        this.temperature = temperature;
    }
    /**
 * переопределение метода ToString
 */
    @Override
    public String toString(){
        return "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() + ", volume=" + super.getVolume() + "ml"+
        ", temperature=" + temperature + ".C" +
        '}';
    }
}
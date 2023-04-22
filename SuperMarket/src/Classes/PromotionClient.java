package Classes;

public class PromotionClient extends Actor{
    private String promoName;
    private static int promoNumber;

    public PromotionClient(String name,String promoName,int promoNumber){
        super(name);
        this.promoName=promoName;
        this.promoNumber=promoNumber;
    }

    public String getPromoName() {
        return promoName;
    }

    public static int getPromoNumber() {
        return promoNumber;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }
    
}

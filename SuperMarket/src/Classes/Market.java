package Classes;
/**
 * импорт интерфейсов и методов
 */
import java.util.ArrayList;
import java.util.List;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour{
    private List<iActorBehaviour> queue;
/* 
*создание очереди 
*/
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
/* 
*переопределение метода входа клиента в магазин
*/
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
/* 
*переопределение метода добавление клиента в очередь магазина
*/
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
/* 
*переопределение метода выхода клиента из магазина
*/
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
/* 
*метод для получения заказов всех людей и выхода их из очереди
*/
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
/* 
*метод выдачи заказа каждому из очереди
*/
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
/* 
*метод выхода всех посетителей
*/
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }
/* 
*метод создания заказа каждого покупателя из очереди
*/
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
/* 
*метод, объединяющий методы возвращения заказов и выхода из очереди
*/
    @Override
    public void updateReturn() {
        returnOrder();
        releaseFromQueue();
    }

/* 
*метод, проверки наличия и возврата заказа
*/
    @Override
    public void returnOrder(){
        for(iActorBehaviour actor: queue){
        if(actor.isTakeOrder()) {
            actor.setTakeOrder(false);
            System.out.println(actor.getActor().getName()+" клиент вернул заказ ");
        }
        else{
            System.out.println("У"+actor.getActor().getName()+"нечего возвращать");
        }
    }

}
}

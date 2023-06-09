package seminar2.queue;

import seminar2.actor.Actor;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private final List<Actor> customers;
    private final List<Actor> queue;

    public Market() {
        customers = new ArrayList<>();
        queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        update();
        customers.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        customers.removeAll(actors);
    }

    @Override
    public void update() {
        releaseFromQueue();
        for (Actor customer : customers) if (!customer.isMakeOrder()) takeInQueue(customer);
        for (Actor customer : queue) if (customer.isMakeOrder()) giveOrder();
        takeOrder();

    }

    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
    }

    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) actor.setMakeOrder();
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) actor.setTakeOrder();
        }
    }

    @Override
    public void releaseFromQueue() {
        queue.removeIf(Actor::isTakeOrder);
    }

    @Override
    public String toString() {
        String customer_string = "";
        for (Actor customer : customers) {
            customer_string = "%s%s".formatted(customer_string, String.format("%s%n", customer));
        }
        return customer_string;
    }

}


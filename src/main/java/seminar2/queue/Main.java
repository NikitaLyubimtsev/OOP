package seminar2.queue;

import seminar2.actor.Actor;
import seminar2.actor.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Market market = new Market();
        Actor customer1 = new Human("John", 34, "Moscow");
        Actor customer2 = new Human("Anna", 21, "SPB");
        Actor customer3 = new Human("Ivan", 22, "Voronez");

        List<Actor> releaseCustomers = new ArrayList<>();

        market.acceptToMarket(customer1);
        System.out.println(market);
        market.acceptToMarket(customer2);
        System.out.println(market);
        market.acceptToMarket(customer3);
        System.out.println(market);
        market.update();
        System.out.println(market);
        market.update();
        System.out.println(market);
        market.update();

        releaseCustomers.add(customer1);
        market.releaseFromMarket(releaseCustomers);
        System.out.println(market);


    }

}

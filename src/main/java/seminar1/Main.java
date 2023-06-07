package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vending fruitVending = new FruitVending();

        Product apple = new Fruit(1L, "Яблоко" ,65.90, "Антоновка");
        Product banana = new Fruit(2L, "Банан" ,119.90, "Африканский");

        fruitVending.addProduct(apple);
        fruitVending.addProduct(banana);

        System.out.println(fruitVending.getProduct("Яблоко", "Антоновка"));
        System.out.println(fruitVending.getProduct(2L));

        Vending hotDrinksVending = new HotDrinksVending();

        Product espresso = new HotDrinks(3L, "Эсперсcо", 50.00, 89.00, 40, false);
        Product cappuccino = new HotDrinks(4L, "Капучино", 130.00, 75.00, 250, true);
        Product cappuccinoLong = new HotDrinks(5L, "Большой Капучино", 190.00, 75.00, 400, true);
        Product blackTea = new HotDrinks(6L, "Чёрный чай", 50.00, 90.00, 200, false);
        Product greenTea = new HotDrinks(6L, "Зелёный чай", 50.00, 85.00, 200, false);
        hotDrinksVending.addProduct(espresso);
        hotDrinksVending.addProduct(cappuccino);
        hotDrinksVending.addProduct(cappuccinoLong);

        List<Product> hdlist = new ArrayList<>();
        hdlist.add(blackTea);
        hdlist.add(greenTea);
        hotDrinksVending.initProducts(hdlist);
        System.out.println(hotDrinksVending.getProduct("Эсперсcо", 89.00, 40));
        System.out.println(hotDrinksVending.getProduct(4L));

        System.out.println(fruitVending.getProductList());
        System.out.println(hotDrinksVending.getProductList());
    }



}

package seminar1;

import java.util.ArrayList;

public class HotDrinksVending extends Vending {

    public HotDrinksVending() {
        productList = new ArrayList<>();
    }

    @Override
    public Product getProduct(String name, Double temperature, Integer volume) {
        for (Product product : productList) {
            if (name.equals(product.getName()) && temperature.equals(((HotDrinks) product).getTemperature()) && volume.equals(((HotDrinks) product).getVolume())) {
                return product;
            }
        }
        return null;
    }
}

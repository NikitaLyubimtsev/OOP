package seminar1;

import java.util.ArrayList;

public class FruitVending extends Vending {

    FruitVending() {
        productList = new ArrayList<>();
    }

    @Override
    public Product getProduct(String kind) {
        for (Product product : productList) {
            if (kind.equals(((Fruit) product).getKind())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, String kind) {
        for (Product product : productList) {
            if (name.equals(product.getName()) && kind.equals(((Fruit) product).getKind())) {
                return product;
            }
        }
        return null;
    }
}

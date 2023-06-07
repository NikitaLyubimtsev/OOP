package seminar1;

import java.util.List;

public abstract class Vending {

    List<Product> productList;

    void addProduct(Product product) {
        productList.add(product);
    }

    void initProducts(List<Product> addedProductList) {
        productList.addAll(addedProductList);
    }

    List<Product> getProductList() {
        return productList;
    }

    Product getProduct(String name) {
        for (Product product : productList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    Product getProduct(Long id) {
        for (Product product : productList) {
            if (id.equals(product.getId())) {
                return product;
            }
        }
        return null;
    }

    Product getProduct(String param1, String param2) {
        return null;
    }

    Product getProduct(String name, Double param1, Integer param2) {
        return null;
    }

}

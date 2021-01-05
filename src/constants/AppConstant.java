package constants;

import models.Offer;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class AppConstant {
    public static int UNITPRICE_A = 50;
    public static int UNITPRICE_B = 30;
    public static int UNITPRICE_C = 20;
    public static int UNITPRICE_D = 15;
    public static List<Product> getPriceAndOfferData() {
        List<Product> items = new ArrayList<>();
        items.add(new Product("A", UNITPRICE_A, new Offer("A", 3, 130)));
        items.add(new Product("B", UNITPRICE_B, new Offer("B", 2, 45)));
        items.add(new Product("C", UNITPRICE_C));
        items.add(new Product("D", UNITPRICE_D));
        return items;
    }
}


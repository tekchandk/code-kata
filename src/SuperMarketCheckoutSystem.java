import constants.AppConstant;
import models.Product;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.HashMap;
import java.util.Map;

public class SuperMarketCheckoutSystem implements PriceContract {

    public int getTotalPrice(String[] itemNames) {
        Map<String, Integer> itemWithCount = new HashMap<>();
        int totalPrice = 0;

        for (String name : itemNames)
        {
            if (itemWithCount.containsKey(name))
            {
                itemWithCount.put(name, itemWithCount.get(name) + 1);
            }
            else
            {
                itemWithCount.put(name, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : itemWithCount.entrySet())
        {
            for(Product product : AppConstant.getPriceAndOfferData()) {
                if(entry.getKey().equals(product.getName())) {
                    totalPrice = totalPrice + getPriceWithOffer(entry.getValue(), product) + getPriceWithoutOffer(entry.getValue(), product);
                }
            }
        }
        return totalPrice;
    }

    public int getPriceWithOffer(int checkoutQuantityProduct, Product product) {
        if(product.getOffer() == null)
            return 0;
        return (checkoutQuantityProduct / product.getOffer().getQuantity()) * (product.getOffer().getPriceWithOffer());
    }

    public int getPriceWithoutOffer(int checkoutQuantityProduct, Product product) {
        if(product.getOffer() == null)
            return checkoutQuantityProduct * product.getUnitPrice();
        return (checkoutQuantityProduct % product.getOffer().getQuantity()) * (product.getUnitPrice());
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuperMarketCheckoutSystem.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }

}

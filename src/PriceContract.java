import models.Product;

public interface PriceContract {
    int getPriceWithoutOffer(int checkoutQuantityProduct, Product product);
    int getPriceWithOffer(int checkoutQuantityProduct, Product product);
    int getTotalPrice(String[] itemNames);
}

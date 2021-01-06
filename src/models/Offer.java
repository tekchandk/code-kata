package models;

public class Offer {
    private String name;
    private int quantity;
    private int priceWithOffer;
    public Offer(String name, int quantity, int priceWithOffer){
        this.name = name;
        this.quantity = quantity;
        this.priceWithOffer = priceWithOffer;
    }

    public int getQuantity() {
        return quantity;
    }
    public int getPriceWithOffer() {
        return priceWithOffer;
    }
}

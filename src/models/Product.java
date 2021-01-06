package models;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private int unitPrice;
    private Offer offer;


    public Product() {
        this.id = UUID.randomUUID();
        this.name = "A";
        this.unitPrice = 10;
    }

    public Product(String name, int unitPrice, Offer offer) {
        this.unitPrice = unitPrice;
        this.name = name;
        this.offer = offer;
    }

    public Product(String name, int unitPrice) {
        this.unitPrice = unitPrice;
        this.name = name;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public Offer getOffer() {
        return offer;
    }

}

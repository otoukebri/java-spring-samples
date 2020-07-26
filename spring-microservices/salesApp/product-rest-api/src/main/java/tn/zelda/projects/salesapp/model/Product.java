package tn.zelda.projects.salesapp.model;

/**
 * Created by zelda on 31/01/17.
 */
public class Product {

    long id;
    String label;
    float price;

    public Product(String label, float price) {
        this.label = label;
        this.price = price;
    }

    public Product(long id, String label, float price) {
        this.id = id;
        this.label = label;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

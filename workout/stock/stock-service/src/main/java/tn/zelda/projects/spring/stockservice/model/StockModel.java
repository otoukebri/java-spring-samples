package tn.zelda.projects.spring.stockservice.model;

public class StockModel {

    private  long id;

    private String name;

    private Double currentPrice;

    public StockModel() {

    }

    public StockModel(long id, String name, Double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.id = id;
    }

    public StockModel(String name, Double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

package tn.zelda.projects.spring.stockservice.dao.entities;


import java.util.Date;
import java.util.Objects;


public class StockEntity implements  Cloneable{


    private Long id;

    private String name;

    private Double currentPrice;

    private Date lastUpdate;

    public StockEntity() {

    }

    public static StockEntity copy(StockEntity original) {
        if(original==null)
            return null;
        else
            return new StockEntity(original);
    }

    public StockEntity(StockEntity original) {
        this.id = original.getId();
        this.name = original.getName();
        this.currentPrice = original.getCurrentPrice();
        this.lastUpdate = original.getLastUpdate();
    }

    public StockEntity(String name) {
        this.name = name;
    }

    public StockEntity(String name, Double currentPrice, Date lastUpdate) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdate = lastUpdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public StockEntity clone() {
        return new StockEntity(  this.name, this.currentPrice, this.lastUpdate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StockEntity)) return false;
        StockEntity stockEntity = (StockEntity) o;
        return Objects.equals(getName(), stockEntity.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

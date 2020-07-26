package tn.zelda.projects.spring.stockservice.dao.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "STOCK")
public class StockEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CURRENT_PRICE")
    private Double currentPrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE", nullable = false)
    private Date lastUpdate;

    public StockEntity() {

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

package tn.zelda.projects.microservice.ordermicroservice.orders.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orderdetail")
public class OrderDetail implements Serializable {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id", updatable = false, nullable = false)
//	private Long id;


	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name = "product_id")
	private Product product;

	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name = "order_id")
	private Order order;

	@Column(name = "created_on")
	private Date createdOn;

	@Column
	private int stock;

	public OrderDetail() {
//		this.product = new Product();
//		this.order = new Order();
//		this.createdOn = new Date();
	}

	public OrderDetail(Product product, Order order) {
//		this.product = product;
//		this.order = order;
//		this.createdOn = new Date();
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof OrderDetail)) {
			return false;
		}
		OrderDetail other = (OrderDetail) obj;
//		if (id != null) {
//			if (!id.equals(other.id)) {
//				return false;
//			}
//		}
		return true;
	}

}

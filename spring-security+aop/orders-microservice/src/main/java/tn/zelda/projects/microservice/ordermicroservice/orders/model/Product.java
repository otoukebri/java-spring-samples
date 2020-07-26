package tn.zelda.projects.microservice.ordermicroservice.orders.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "products")
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@NotNull
	@Column(name = "code")
	private String code;
	
	@Column(name = "label")
	private String label;
	
	@NotNull
	@Column(name = "price")
	private float price;

	@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "product")
	private Set<OrderDetail> ordersDetails;

	
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "product")
	private Set<Review> reviews;
	
	public Product() {
		this.ordersDetails  = new HashSet<>();
		this.reviews = new HashSet<>();
	}

	public Product(final String label, final String code, final float price) {
		this.label = label;
		this.price = price;
		this.code = code;
		this.ordersDetails = new HashSet<OrderDetail>();
	}

	public Product(final long id, final String label, final float price) {
		this.id = id;
		this.label = label;
		this.price = price;
		this.ordersDetails = new HashSet<OrderDetail>();
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(final float price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	
	public Set<OrderDetail> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(final Set<OrderDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	@Override
	public int hashCode() {
		return 31;
	}

	
	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		final Product other = (Product) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

}
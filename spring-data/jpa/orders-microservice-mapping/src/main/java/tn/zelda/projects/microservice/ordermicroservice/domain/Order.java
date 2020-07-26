package tn.zelda.projects.microservice.ordermicroservice.domain;

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
import javax.persistence.Version;

/**
 * @author zelda
 *
 */
@Entity(name = "orders")
public class Order {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@OneToMany(cascade = { CascadeType.ALL}, orphanRemoval = true, mappedBy = "order", fetch =  FetchType.LAZY)
	private Set<OrderDetail> ordersDetails;

	// @OneToMany(cascade = CascadeType.ALL)
	// private Set<Review> reviews = new HashSet<Review>();
	//
	@Version
	private int version;

	private String code;

	public Order() {
		ordersDetails = new HashSet<>();
		this.code = "CD_" + Math.random() * 49 + 1 ;
	}

	public Order(String code) {
		ordersDetails = new HashSet<>();
		this.code =  code;
	}
	public Long getId() {
		return this.id;
	}

	public int getVersion() {
		return this.version;
	}

	public String getTitle() {
		return code;
	}

	public void setTitle(final String title) {
		this.code = title;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Order)) {
			return false;
		}
		final Order other = (Order) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (code != null && !code.trim().isEmpty())
			result += "title: " + code;
		return result;
	}

	public Set<OrderDetail> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(Set<OrderDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	// public Set<Review> getReviews() {
	// return reviews;
	// }
	//
	// public void setReviews(Set<Review> reviews) {
	// this.reviews = reviews;
	// }
}
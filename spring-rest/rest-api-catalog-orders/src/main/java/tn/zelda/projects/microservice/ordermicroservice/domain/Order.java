package tn.zelda.projects.microservice.ordermicroservice.domain;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zelda
 *
 */

@Entity(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Version
	private int version;

	private String code;

	
	@OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, mappedBy = "order", fetch = FetchType.LAZY)
	private Set<OrderDetail> ordersDetails;

	// @OneToMany(cascade = CascadeType.ALL)
	// private Set<Review> reviews = new HashSet<Review>();
	//

	public Set<OrderDetail> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(Set<OrderDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

//	public Order() {
//		ordersDetails = new HashSet<>();
//		this.code = "CD_" + Math.random() * 49 + 1;
//	}
//
//	public Order(String code) {
//		ordersDetails = new HashSet<>();
//		this.code = code;
//	}


	// public Set<Review> getReviews() {
	// return reviews;
	// }
	//
	// public void setReviews(Set<Review> reviews) {
	// this.reviews = reviews;
	// }
}
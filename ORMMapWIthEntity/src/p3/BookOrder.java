package p3;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;

/**
 * 
 */
@Entity
public class BookOrder {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderNumber;
	private String userName;
	
	@ElementCollection
	 @CollectionTable(name = "order_item_mapping", 
     joinColumns = {@JoinColumn(name="OrderNumber",referencedColumnName = "orderNumber")})
	@MapKeyColumn(name = "BookNumber")
   @Column(name = "Units")
	Map<Book, Integer> orderDetails = new HashMap<>();

	public BookOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookOrder(int orderNumber, String userName, Map<Book, Integer> orderDetails) {
		super();
		this.orderNumber = orderNumber;
		this.userName = userName;
		this.orderDetails = orderDetails;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<Book, Integer> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Map<Book, Integer> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "BookOrder [orderNumber=" + orderNumber + ", userName=" + userName + ", orderDetails=" + orderDetails
				+ "]";
	}

	

	
	
	
	
	
}

package pkgCollections;

import java.util.Date;

public class Order {
	private String orderId;
	private String orderDetails;
	private Date orderDate;
	public Order(String orderId, String orderDetails, Date orderDate)throws OrderNotValidException {
		
		this.orderId = orderId;
		this.orderDetails = orderDetails;
		this.orderDate = orderDate;
		if(orderId.length()<3)
		{
			throw new OrderNotValidException("Order Id should be at least of 3 characters in length");
		}
		if(orderId.charAt(0)!='O')
		{
			throw new OrderNotValidException("orderId should start with ‘O’");
		}
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String toString()
	{
		return orderId+" "+orderDetails+" "+orderDate;
				}

}

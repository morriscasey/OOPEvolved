package oop.interfacesegregation;
import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting
{
	// Stores a list of products based on the customer
	private List<Product> products;
	private Customer customer;
	
	public CustomerTransaction(Customer customer, List<Product> products){
		this.customer = customer;
		this.products = products;
	}
	
	/* 
	 * Interface methods for Reporting
	 */
	@Override
	public String getName(){
		return customer.getName();
	}
	
	@Override
	public Date getDate(){
		return new Date();
	}
	
	@Override
	public String productBreakDown(){
		String reportListing = null;
		for(Product product : products){
			reportListing += product.getProductName();
		}
		return reportListing;
	}
	
	
	/*
	 *  Interface methods for Accounting
	 */
	@Override
	public void prepareInvoice(){
		System.out.println("invoice prepared...");
	}
	

	@Override
	public void chargeCustomer(){
		System.out.println("charged the customer..");
	}
}

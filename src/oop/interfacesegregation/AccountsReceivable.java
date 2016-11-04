package oop.interfacesegregation;

public class AccountsReceivable
{
	private Accounting transactionObject;
	
	public AccountsReceivable(Accounting transaction){
		this.transactionObject = transaction;
	}
	public void postPayment(){
		transactionObject.chargeCustomer();
	}
	
	public void sendInvoice(){
		transactionObject.prepareInvoice();
	}
}

package prethaler_sales;

public class Customer
{
	private int customerID;
	private String firstNameString;
	
	public Customer(int customerID, String firstNameString)
	{
		this.customerID = customerID;
		this.firstNameString = firstNameString;
	}
	
	public int getCustomerID()
	{
		return customerID;
	}
	
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	
	public String getFirstNameString()
	{
		return firstNameString;
	}
	
	public void setFirstNameString(String firstNameString)
	{
		this.firstNameString = firstNameString;
	}
}

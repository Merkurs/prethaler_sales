package prethaler_sales;

public class Customer
{
	private int customerID;
	private String firstNameString;
	private double credit;
	
	public Customer(int customerID, String firstNameString, double credit)
	{
		this.customerID = customerID;
		this.firstNameString = firstNameString;
		this.credit = credit;
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

	public double getCredit()
	{
		return credit;
	}

	public void setCredit(double credit)
	{
		this.credit = credit;
	}
}

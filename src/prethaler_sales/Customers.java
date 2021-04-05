package prethaler_sales;

import java.util.ArrayList;

public class Customers
{
	private ArrayList<Customers> customers;

	public Customers(ArrayList<Customers> customers)
	{
		this.customers = customers;
	}

	public ArrayList<Customers> getCustomers()
	{
		return customers;
	}

	public void setCustomers(ArrayList<Customers> customers)
	{
		this.customers = customers;
	}	
}

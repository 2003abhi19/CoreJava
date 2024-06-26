package com.tns.constructor;

public class Commission {
	private String name;
	private String address;
	private int phone;
	private float sales_amount;
	float commission=0;
	
	public void details()
	{
		System.out.println("Enter the name:");
		System.out.println("enter the address");
		System.out.println("enter the phone number");
		System.out.println("enter the sales_amount");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public double getSales_amount() {
		return sales_amount;
	}

	public void setSales_amount(float sales_amount) {
		this.sales_amount = sales_amount;
	}

	@Override
	public String toString() {
		System.out.println("Details of the customer");
		return "Commission [name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount="
				+ sales_amount + "]";
	}
	
	
	//method for the commission//
	public void commission()
	{
		if(sales_amount>=100000)
		{
			commission=(float) (sales_amount*0.10);
			System.out.println("the commission when >100000 is"+commission);
		}
		else if(sales_amount<100000 && sales_amount>=50000)
		{
			commission=(float) (sales_amount*0.05);
			System.out.println("the commision when sales value is between 50000 and 100000 is "+commission);
		}
		else if(sales_amount<50000 && sales_amount>=30000)
		{
			commission=(float) (sales_amount*0.03);
			System.out.println("the commision when sales value is between 50000 and 30000 is "+commission);
		}
		else if (sales_amount<30000)
		{
			commission=0;
			System.out.println("the commission for the sales value less than 30000 is "+commission);
		}
	}
	
	

}

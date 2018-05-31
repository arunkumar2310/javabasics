package com.worksheet_answers;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public int setQuantity(int quantity) {
		if(quantity<0)
		{
			this.quantity=0;
		}
		else
		{
		this.quantity = quantity;
	    }
		return quantity;
	}
	public int getPricePerItem() {
		return pricePerItem;
	}
	public int setPriceperItem(int pricePerItem) {
		if(pricePerItem<0)
		{
			this.pricePerItem=0;
		}
		else
		{
		this.pricePerItem = pricePerItem;
		}
		return pricePerItem;
	}
	public double getInvoiceAmount(int quantity,int price)
	{
		double amount=quantity*price;
		return amount;
	}
	public static void main(String args[]) {
		Invoice v1=new Invoice();
		v1.setPartDescription("Screwdricer");
		v1.setPartNumber("0011R");
		int quantity=v1.setPriceperItem(100);
		int price=v1.setQuantity(10);
		double total=v1.getInvoiceAmount(quantity, price);
		System.out.println("Part Name:"+v1.getPartDescription()+"\n"+"Part description:"+v1.getPartNumber()+"\n"+"Total="+total);
	}
}

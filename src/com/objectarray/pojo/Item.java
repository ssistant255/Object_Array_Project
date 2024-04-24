//Create an Item class with attributes like name, price, quantity, and supplier.
//Create an array to store Item objects.
//Implement methods to:
//Add items to the inventory.
//Sell items (update quantity).
//Reorder items when quantity falls below a threshold.
//Generate a stock report with item details and total value.
package com.objectarray.pojo;
import java.util.Map;
import java.util.Scanner;
public class Item
{
	private String name;
	private double price;
	private float quantity;
	private String supplier;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getSupplier()
	{
		return supplier;
	}
	public void setSupplier(String supplier) 
	{
		this.supplier = supplier;
	}
	public void  InventoryManagement(String name, double price, float quantity, String supplier)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.supplier = supplier;
	}     
}
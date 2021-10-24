package com.store.Dto;

public class Sale_detailVO {
	private long idsale_details;
	private long idsales;
	private long idproducts;
	private int amount;
	private double vat;
	private double total;
	private double sellprice;
	
	public long getIdsale_details() {
		return idsale_details;
	}
	public void setIdsale_details(long idsale_details) {
		this.idsale_details = idsale_details;
	}
	public long getIdsales() {
		return idsales;
	}
	public void setIdsales(long idsales) {
		this.idsales = idsales;
	}
	public long getIdproducts() {
		return idproducts;
	}
	public void setIdproducts(long idproducts) {
		this.idproducts = idproducts;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getSellprice() {
		return sellprice;
	}
	public void setSellprice(double sellprice) {
		this.sellprice = sellprice;
	}
	
}

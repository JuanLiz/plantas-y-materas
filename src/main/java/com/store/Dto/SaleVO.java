package com.store.Dto;

public class SaleVO {
	
	private long idsales;
	private long idclients;
	private long idusers;
	private double vat;
	private double total;
	private double sellprice;
	
	public long getIdsales() {
		return idsales;
	}
	public void setIdsales(long idsales) {
		this.idsales = idsales;
	}
	public long getIdclients() {
		return idclients;
	}
	public void setIdclients(long idclients) {
		this.idclients = idclients;
	}
	public long getIdusers() {
		return idusers;
	}
	public void setIdusers(long idusers) {
		this.idusers = idusers;
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

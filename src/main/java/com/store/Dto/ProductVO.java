package com.store.Dto;

public class ProductVO {
	
	private long idproducts;
	private long idproviders;
	private String name;
	private double vat;
	private double buyprice;
	private double sellprice;
	
	public long getIdproducts() {
		return idproducts;
	}
	public void setIdproducts(long idproducts) {
		this.idproducts = idproducts;
	}
	public long getIdproviders() {
		return idproviders;
	}
	public void setIdproviders(long idproviders) {
		this.idproviders = idproviders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getBuyprice() {
		return buyprice;
	}
	public void setBuyprice(double buyprice) {
		this.buyprice = buyprice;
	}
	public double getSellprice() {
		return sellprice;
	}
	public void setSellprice(double sellprice) {
		this.sellprice = sellprice;
	}
	
}

package com.store.Dto;

public class ProviderVO {
	
	private long idproviders;
	private String name;
	private String address;
	private String city;
	
	private String phone;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

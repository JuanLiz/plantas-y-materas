package com.store.Dto;

public class ReqStatus {

	private boolean loginf;
	//Operation status for choose alert. 0 null, 1 ok, 2 fail
	private String userf="0"; 
	private String clientf="0";
	private String providerf="0";
	private String productf="0";
	//Operation type for show in alert
	private String usertype; 
	private String clienttype;
	private String providertype;
	private String producttype;
	
	
	public boolean isLoginf() {
		return loginf;
	}
	public void setLoginf(boolean loginf) {
		this.loginf = loginf;
	}
	public String getUserf() {
		return userf;
	}
	public void setUserf(String userf) {
		this.userf = userf;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getClientf() {
		return clientf;
	}
	public void setClientf(String clientf) {
		this.clientf = clientf;
	}
	public String getClienttype() {
		return clienttype;
	}
	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}
	public String getProviderf() {
		return providerf;
	}
	public void setProviderf(String providerf) {
		this.providerf = providerf;
	}
	public String getProvidertype() {
		return providertype;
	}
	public void setProvidertype(String providertype) {
		this.providertype = providertype;
	}
	public String getProductf() {
		return productf;
	}
	public void setProductf(String productf) {
		this.productf = productf;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	
}

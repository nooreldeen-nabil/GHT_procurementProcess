package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VendorInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("companyCode")
	private java.lang.String companyCode;
	@org.kie.api.definition.type.Label("companyName")
	private java.lang.String companyName;
	@org.kie.api.definition.type.Label("address")
	private java.lang.String address;
	@org.kie.api.definition.type.Label("phone")
	private String phone;
	@org.kie.api.definition.type.Label("email")
	private java.lang.String email;

	public VendorInformation() {
	}

	public java.lang.String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(java.lang.String companyCode) {
		this.companyCode = companyCode;
	}

	public java.lang.String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(java.lang.String companyName) {
		this.companyName = companyName;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public VendorInformation(java.lang.String companyCode,
			java.lang.String companyName, java.lang.String address,
			java.lang.String phone, java.lang.String email) {
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

}
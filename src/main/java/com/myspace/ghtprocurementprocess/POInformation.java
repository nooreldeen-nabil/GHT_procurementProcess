package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class POInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("poNumber")
	private String poNumber;
	@org.kie.api.definition.type.Label("poDecription")
	private java.lang.String poDecription;
	@org.kie.api.definition.type.Label("date")
	private java.util.Date date;

	public POInformation() {
	}

	public java.lang.String getPoDecription() {
		return this.poDecription;
	}

	public void setPoDecription(java.lang.String poDecription) {
		this.poDecription = poDecription;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.lang.String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(java.lang.String poNumber) {
		this.poNumber = poNumber;
	}

	public POInformation(java.lang.String poNumber,
			java.lang.String poDecription, java.util.Date date) {
		this.poNumber = poNumber;
		this.poDecription = poDecription;
		this.date = date;
	}

}
package com.myspace.ghtprocurementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InvoiceInformation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("invoceNumber")
	private String invoceNumber;
	@org.kie.api.definition.type.Label("invoiceDate")
	private java.util.Date invoiceDate;
	@org.kie.api.definition.type.Label("discount")
	private Double discount;
	@org.kie.api.definition.type.Label("tax")
	private Double tax;
	@org.kie.api.definition.type.Label("shipingCost")
	private Double shipingCost;
	@org.kie.api.definition.type.Label("deliveryDate")
	private java.util.Date deliveryDate;
	@org.kie.api.definition.type.Label("subTotal")
	private Double subTotal;
	@org.kie.api.definition.type.Label("totalAmount")
	private Double totalAmount;
	@org.kie.api.definition.type.Label("paymentMethod")
	private java.lang.String paymentMethod;
	@org.kie.api.definition.type.Label("bankName")
	private java.lang.String bankName;
	@org.kie.api.definition.type.Label("accountNumber")
	private String accountNumber;

	public InvoiceInformation() {
	}

	public java.util.Date getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(java.util.Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public java.util.Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(java.util.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public java.lang.String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(java.lang.String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public java.lang.String getBankName() {
		return this.bankName;
	}

	public void setBankName(java.lang.String bankName) {
		this.bankName = bankName;
	}

	public java.lang.String getInvoceNumber() {
		return this.invoceNumber;
	}

	public void setInvoceNumber(java.lang.String invoceNumber) {
		this.invoceNumber = invoceNumber;
	}

	public java.lang.Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(java.lang.Double discount) {
		this.discount = discount;
	}

	public java.lang.Double getTax() {
		return this.tax;
	}

	public void setTax(java.lang.Double tax) {
		this.tax = tax;
	}

	public java.lang.Double getShipingCost() {
		return this.shipingCost;
	}

	public void setShipingCost(java.lang.Double shipingCost) {
		this.shipingCost = shipingCost;
	}

	public java.lang.Double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(java.lang.Double subTotal) {
		this.subTotal = subTotal;
	}

	public java.lang.Double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(java.lang.Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public java.lang.String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(java.lang.String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public InvoiceInformation(java.lang.String invoceNumber,
			java.util.Date invoiceDate, java.lang.Double discount,
			java.lang.Double tax, java.lang.Double shipingCost,
			java.util.Date deliveryDate, java.lang.Double subTotal,
			java.lang.Double totalAmount, java.lang.String paymentMethod,
			java.lang.String bankName, java.lang.String accountNumber) {
		this.invoceNumber = invoceNumber;
		this.invoiceDate = invoiceDate;
		this.discount = discount;
		this.tax = tax;
		this.shipingCost = shipingCost;
		this.deliveryDate = deliveryDate;
		this.subTotal = subTotal;
		this.totalAmount = totalAmount;
		this.paymentMethod = paymentMethod;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}

}
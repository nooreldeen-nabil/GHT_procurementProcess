package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AuditApp implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String requesterName;
	private java.lang.Integer status;
	private java.lang.Integer reason;
	private java.util.Date date;

	public AuditApp() {
	}

	public java.lang.String getRequesterName() {
		return this.requesterName;
	}

	public void setRequesterName(java.lang.String requesterName) {
		this.requesterName = requesterName;
	}

	public java.lang.Integer getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.Integer status) {
		this.status = status;
	}

	public java.lang.Integer getReason() {
		return this.reason;
	}

	public void setReason(java.lang.Integer reason) {
		this.reason = reason;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public AuditApp(java.lang.String requesterName, java.lang.Integer status,
			java.lang.Integer reason, java.util.Date date) {
		this.requesterName = requesterName;
		this.status = status;
		this.reason = reason;
		this.date = date;
	}

}
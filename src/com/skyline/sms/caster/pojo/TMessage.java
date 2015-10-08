package com.skyline.sms.caster.pojo;
// Generated 2015-9-30 11:50:52 by Hibernate Tools 4.0.0.Final

/**
 * TMessage generated by hbm2java
 */
public class TMessage implements java.io.Serializable {

	private Integer id;
	private Integer contactId;
	private String contactName;
	private int contactType;
	private String message;
	private String portName;
	private String portNumber;

	public TMessage() {
	}

	public TMessage(int contactType, String message) {
		this.contactType = contactType;
		this.message = message;
	}

	public TMessage(Integer contactId, String contactName, int contactType, String message, String portName,
			String portNumber) {
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactType = contactType;
		this.message = message;
		this.portName = portName;
		this.portNumber = portNumber;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getContactType() {
		return this.contactType;
	}

	public void setContactType(int contactType) {
		this.contactType = contactType;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPortName() {
		return this.portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public String getPortNumber() {
		return this.portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

}

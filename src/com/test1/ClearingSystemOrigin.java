package com.test1;

public class ClearingSystemOrigin {
	private String countryCode;
	private String routingMeta;
	private String origin;
	private String clearingRoutingControl;
	private String premiumPayment;
	private boolean automaticSource;
	private String originIndicator;
	private String manualSource;
	private String manualSourceIndicator;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ClearingSystemOrigin() {

	}

	public ClearingSystemOrigin(String countryCode, String routingMeta, String origin, String clearingRoutingControl,
			String premiumPayment, boolean automaticSource, String originIndicator, String manualSource,
			String manualSourceIndicator, String creationCr, String modifiedCr, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.routingMeta = routingMeta;
		this.origin = origin;
		this.clearingRoutingControl = clearingRoutingControl;
		this.premiumPayment = premiumPayment;
		this.automaticSource = automaticSource;
		this.originIndicator = originIndicator;
		this.manualSource = manualSource;
		this.manualSourceIndicator = manualSourceIndicator;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRoutingMeta() {
		return routingMeta;
	}

	public void setRoutingMeta(String routingMeta) {
		this.routingMeta = routingMeta;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getClearingRoutingControl() {
		return clearingRoutingControl;
	}

	public void setClearingRoutingControl(String clearingRoutingControl) {
		this.clearingRoutingControl = clearingRoutingControl;
	}

	public String getPremiumPayment() {
		return premiumPayment;
	}

	public void setPremiumPayment(String premiumPayment) {
		this.premiumPayment = premiumPayment;
	}

	public boolean isAutomaticSource() {
		return automaticSource;
	}

	public void setAutomaticSource(boolean automaticSource) {
		this.automaticSource = automaticSource;
	}

	public String getOriginIndicator() {
		return originIndicator;
	}

	public void setOriginIndicator(String originIndicator) {
		this.originIndicator = originIndicator;
	}

	public String getManualSource() {
		return manualSource;
	}

	public void setManualSource(String manualSource) {
		this.manualSource = manualSource;
	}

	public String getManualSourceIndicator() {
		return manualSourceIndicator;
	}

	public void setManualSourceIndicator(String manualSourceIndicator) {
		this.manualSourceIndicator = manualSourceIndicator;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

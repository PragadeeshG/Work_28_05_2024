package com.test1;

public class CleaningSystemOriginMeta {
	private String countryCode;
	private String routingMeta;
	private String origin;
	private String template;
	private boolean modelPartitionType;
	private Integer routingSystem;
	private boolean clearingRoutingType;
	private String clearingRoutingSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CleaningSystemOriginMeta() {

	}

	public CleaningSystemOriginMeta(String countryCode, String routingMeta, String origin, String template,
			boolean modelPartitionType, Integer routingSystem, boolean clearingRoutingType,
			String clearingRoutingSystem, String creationDate, String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.routingMeta = routingMeta;
		this.origin = origin;
		this.template = template;
		this.modelPartitionType = modelPartitionType;
		this.routingSystem = routingSystem;
		this.clearingRoutingType = clearingRoutingType;
		this.clearingRoutingSystem = clearingRoutingSystem;
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

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public boolean isModelPartitionType() {
		return modelPartitionType;
	}

	public void setModelPartitionType(boolean modelPartitionType) {
		this.modelPartitionType = modelPartitionType;
	}

	public Integer getRoutingSystem() {
		return routingSystem;
	}

	public void setRoutingSystem(Integer routingSystem) {
		this.routingSystem = routingSystem;
	}

	public boolean isClearingRoutingType() {
		return clearingRoutingType;
	}

	public void setClearingRoutingType(boolean clearingRoutingType) {
		this.clearingRoutingType = clearingRoutingType;
	}

	public String getClearingRoutingSystem() {
		return clearingRoutingSystem;
	}

	public void setClearingRoutingSystem(String clearingRoutingSystem) {
		this.clearingRoutingSystem = clearingRoutingSystem;
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

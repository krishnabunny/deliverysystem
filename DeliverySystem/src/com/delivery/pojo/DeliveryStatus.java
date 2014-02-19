/**
 * 
 */
package com.delivery.pojo;

/**
 * @author Shiva
 * 
 */
public class DeliveryStatus {

	Integer statusId;
	String statusName;
	String statusDescription;

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Override
	public String toString() {
		return "DeliveryStatus [statusId=" + statusId + ", statusName="
				+ statusName + ", statusDescription=" + statusDescription + "]";
	}

}

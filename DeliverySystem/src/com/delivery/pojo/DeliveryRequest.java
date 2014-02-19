/**
 * 
 */
package com.delivery.pojo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;

/**
 * @author Shiva
 * 
 */
public class DeliveryRequest {

	String requestId;
	String requestDescription;
	Date requestDateTime;

	ArrayList<Item> items;
	DeliveryStatus deliveryStatus;
	User user;

	Address fromAddress;
	Address toAddress;

	BigDecimal totalCost;
	BigDecimal totalTaxedCost;
	BigDecimal totalWeight;

	String totalWeightRange;

	Date lastUpdatedDateTime;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

	public Date getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(Address fromAddress) {
		this.fromAddress = fromAddress;
	}

	public Address getToAddress() {
		return toAddress;
	}

	public void setToAddress(Address toAddress) {
		this.toAddress = toAddress;
	}

	public BigDecimal getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public BigDecimal getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getTotalWeightRange() {
		return totalWeightRange;
	}

	public void setTotalWeightRange(String totalWeightRange) {
		this.totalWeightRange = totalWeightRange;
	}

	public Date getLastUpdatedDateTime() {
		return lastUpdatedDateTime;
	}

	public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public BigDecimal getTotalTaxedCost() {
		return totalTaxedCost;
	}

	public void setTotalTaxedCost(BigDecimal totalTaxedCost) {
		this.totalTaxedCost = totalTaxedCost;
	}
}

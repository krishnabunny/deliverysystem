/**
 * 
 */
package com.delivery.pojo;

import java.math.BigDecimal;

/**
 * @author Shiva
 * 
 */
public class Item {

	String itemNo;
	String itemName;
	String itemDescription;
	BigDecimal itemWeight;
	BigDecimal itemCost;
	String itemWeightRange;

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public BigDecimal getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(BigDecimal itemWeight) {
		this.itemWeight = itemWeight;
	}

	public BigDecimal getItemCost() {
		return itemCost;
	}

	public void setItemCost(BigDecimal itemCost) {
		this.itemCost = itemCost;
	}

	@Override
	public String toString() {
		return "Item [itemNo=" + itemNo + ", itemName=" + itemName
				+ ", itemDescription=" + itemDescription + ", itemWeight="
				+ itemWeight + ", itemCost=" + itemCost + "]";
	}

	public String getItemWeightRange() {
		return itemWeightRange;
	}

	public void setItemWeightRange(String itemWeightRange) {
		this.itemWeightRange = itemWeightRange;
	}

}

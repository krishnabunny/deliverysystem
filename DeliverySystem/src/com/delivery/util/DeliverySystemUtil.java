package com.delivery.util;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

import com.delivery.pojo.DeliveryStatus;

public class DeliverySystemUtil {

	// Write all the util methods that we might require for the Delivery System

	public boolean isStatusMovementAllowed(DeliveryStatus fromDeliveryStatus,
			DeliveryStatus toDeliveryStatus) {

		// TODO: Contact the DB or the cache for finding out whether the

		// User getDeliveryStatus() method
		getDeliveryStatus();

		return false;
	}

	public Map<Integer, Set<Integer>> getDeliveryStatus() {

		// TODO: Get the delivery status details from the table :FROM_TO_STATUS
		// or in case you have already cached these details then you must get it
		// from the cache instead of a DB hit

		// Make sure that in case you are implementing a cache on the
		// FROM_TO_STATUS then try to take care of refreshing the cache upon any
		// updates that are happening on the FROM_TO_STATUS table

		// We can implement Observer pattern on the FROM_TO_STATUS table changes
		// to the cache. Here the cache will be the Listner or the observer on
		// the table CRUD operation methods

		return null;
	}

	public static BigDecimal calculateTax(BigDecimal weight,
			Integer fromZipCode, Integer toZipCode) {

		// TODO: According to Government rules try to calculate the tax incurred
		// for the delivery

		// In case if its a local transport - apply local taxation rules
		// In case if its a global transport - apply global taxation rules

		return null;

	}

}

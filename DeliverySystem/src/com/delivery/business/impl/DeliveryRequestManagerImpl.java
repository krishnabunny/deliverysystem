/**
 * 
 */
package com.delivery.business.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.delivery.business.DeliveryRequestManger;
import com.delivery.pojo.DeliveryRequest;
import com.delivery.pojo.DeliveryStatus;
import com.delivery.pojo.Item;
import com.delivery.pojo.User;
import com.delivery.util.DeliverySystemUtil;

/**
 * @author Shiva
 * 
 */
public class DeliveryRequestManagerImpl implements DeliveryRequestManger {

	@Override
	public DeliveryRequest createRequest(DeliveryRequest deliveryRequest) {

		// TODO: create the delivery request by using the object and return the
		// inserted object

		// TODO : Call this method for sure before saving
		// calculateWeightAndCost()

		return null;
	}

	@Override
	public DeliveryRequest getDeliveryRequest(DeliveryRequest deliveryRequest) {

		DeliveryRequest deliveryRequestNew = new DeliveryRequest();
		deliveryRequestNew.setRequestId(deliveryRequest.getRequestId());

		ArrayList<DeliveryRequest> deliveryRequests = getAllDeliveryRequests(
				null, null, null, deliveryRequest, null);

		if (deliveryRequests.size() != 1) {
			deliveryRequestNew = null;
		} else {
			deliveryRequestNew = deliveryRequests.get(0);
		}

		return deliveryRequestNew;
	}

	@Override
	public ArrayList<DeliveryRequest> getMyDeliveryRequests(User user) {
		return getAllDeliveryRequests(user, null, null, null, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.delivery.business.DeliveryRequestManger#getAllDeliveryRequests(com
	 * .delivery.pojo.User, java.sql.Date, java.sql.Date,
	 * com.delivery.pojo.DeliveryRequest, java.util.List)
	 */
	@Override
	public ArrayList<DeliveryRequest> getAllDeliveryRequests(User user,
			Date startDateTime, Date endDateTime,
			DeliveryRequest deliveryRequest,
			List<DeliveryStatus> deliveryStatusList) {
		// TODO: Perform the logic to get only the delivery requests of that
		// particular user if user is passed
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.delivery.business.DeliveryRequestManger#calculateWeightAndCost(com
	 * .delivery.pojo.DeliveryRequest)
	 */
	@Override
	public DeliveryRequest calculateWeightAndCost(
			DeliveryRequest deliveryRequest) {

		BigDecimal totalWeight = new BigDecimal(0);
		BigDecimal totalCost = new BigDecimal(0);
		BigDecimal totalTaxedCost = new BigDecimal(0);

		for (Item item : deliveryRequest.getItems()) {
			totalWeight.add(item.getItemWeight());
			totalCost.add(item.getItemCost());
		}

		totalTaxedCost = DeliverySystemUtil.calculateTax(totalWeight,
				deliveryRequest.getFromAddress().getZIPCODE(), deliveryRequest
						.getToAddress().getZIPCODE());

		deliveryRequest.setTotalCost(totalCost);
		deliveryRequest.setTotalWeight(totalWeight);
		deliveryRequest.setTotalTaxedCost(totalTaxedCost);

		return deliveryRequest;
	}
}

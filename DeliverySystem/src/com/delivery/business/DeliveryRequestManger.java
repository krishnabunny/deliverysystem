package com.delivery.business;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.delivery.pojo.DeliveryRequest;
import com.delivery.pojo.DeliveryStatus;
import com.delivery.pojo.User;

public interface DeliveryRequestManger {

	public DeliveryRequest createRequest(DeliveryRequest deliveryRequest);

	public DeliveryRequest getDeliveryRequest(DeliveryRequest deliveryRequest);

	public ArrayList<DeliveryRequest> getMyDeliveryRequests(User user);

	/**
	 * @param user
	 *            - If user is passed then tries to fetch only that users
	 *            requests
	 * @param startDateTime
	 *            - if startDateTime is passed then tries to fetch the requests
	 *            from that date time
	 * @param endDateTime
	 *            - if endDateTime is passed then tries to fetch the requests
	 *            till that date time
	 * @param deliveryRequest
	 *            - if deliveryRequest is passed then fetches that particular
	 *            delivery request only
	 * @param deliveryStatusList
	 *            - if this list is passed then fetches the requests of that
	 *            status only
	 * @return
	 */
	public ArrayList<DeliveryRequest> getAllDeliveryRequests(User user,
			Date startDateTime, Date endDateTime,
			DeliveryRequest deliveryRequest,
			List<DeliveryStatus> deliveryStatusList);

	/**
	 * This method tries to calculate the weight and cost of the complete
	 * request for all the items and Tries to call the tax based on Government
	 * rules too and adds it to total cost
	 * 
	 * @param deliveryRequest
	 * @return
	 */
	public DeliveryRequest calculateWeightAndCost(
			DeliveryRequest deliveryRequest);
}

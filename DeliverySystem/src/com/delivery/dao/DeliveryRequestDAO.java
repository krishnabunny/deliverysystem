/**
 * 
 */
package com.delivery.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.delivery.pojo.DeliveryRequest;
import com.delivery.pojo.DeliveryStatus;
import com.delivery.pojo.User;

/**
 * @author Shiva
 * 
 */
public interface DeliveryRequestDAO {

	/**
	 * @param deliveryRequest
	 * @return
	 */
	public DeliveryRequest createDeliveryReqyuest(
			DeliveryRequest deliveryRequest);

	/**
	 * @param deliveryRequest
	 * @return
	 */
	public DeliveryRequest getDeliveryRequest(DeliveryRequest deliveryRequest);

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

}

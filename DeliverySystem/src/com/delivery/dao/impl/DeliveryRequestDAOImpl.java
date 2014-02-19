/**
 * 
 */
package com.delivery.dao.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.delivery.dao.DeliveryRequestDAO;
import com.delivery.pojo.DeliveryRequest;
import com.delivery.pojo.DeliveryStatus;
import com.delivery.pojo.User;

/**
 * @author Shiva
 * 
 */
public class DeliveryRequestDAOImpl implements DeliveryRequestDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.delivery.dao.DeliveryRequestDAO#createDeliveryReqyuest(com.delivery
	 * .pojo.DeliveryRequest)
	 */
	@Override
	public DeliveryRequest createDeliveryReqyuest(
			DeliveryRequest deliveryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.delivery.dao.DeliveryRequestDAO#getDeliveryRequest(com.delivery.pojo
	 * .DeliveryRequest)
	 */
	@Override
	public DeliveryRequest getDeliveryRequest(DeliveryRequest deliveryRequest) {
		// TODO Auto-generated method stub
		return null;
	}  

	@Override
	public ArrayList<DeliveryRequest> getAllDeliveryRequests(User user,
			Date startDateTime, Date endDateTime,
			DeliveryRequest deliveryRequest,
			List<DeliveryStatus> deliveryStatusList) {
		// TODO Fetch the Delivery Requests from the DB
		return null;
	}

}

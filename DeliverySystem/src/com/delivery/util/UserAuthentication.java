/**
 * 
 */
package com.delivery.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.delivery.pojo.User;

/**
 * @author Shiva
 * 
 */
public class UserAuthentication {

	/**
	 * Checks whether the User is authentic or not
	 * 
	 * @param con
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean isUserAuthentic(Connection con, User user)
			throws SQLException {
		// Logic to make user authentic

		return false;
	}

}

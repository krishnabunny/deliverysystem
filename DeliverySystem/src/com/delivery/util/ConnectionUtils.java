/**
 * 
 */
package com.delivery.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Shiva
 * 
 */
public class ConnectionUtils {

	/**
	 * This method would return the Connection object
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		return null;
	}

	public static void closeResources(ResultSet rs, Statement stmt,
			Connection con) {
		// Close all the resources by checking null conditions
	}

}

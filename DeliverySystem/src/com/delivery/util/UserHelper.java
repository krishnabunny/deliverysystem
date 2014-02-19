/**
 * 
 */
package com.delivery.util;

import com.delivery.pojo.Permission;
import com.delivery.pojo.User;

/**
 * @author Shiva
 * 
 */
public class UserHelper {

	public boolean isUserAdmin(User user) {
		// TODO: Check whether the user is admin or not, by using the roles
		// inside the user

		user.getRoles();

		return false;
	}

	public boolean isUserAuthorized(User user, Permission permission) {
		// TODO: Do the logic of whether the user is permitted or not - i.e,
		// having that permission or not
		return false;
	}

}

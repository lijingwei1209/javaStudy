/**
 * 
 */
package service;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import model.User;
import utils.CommonUtil;

/**
 * @author figo
 *
 */
public class UserService {
	UserDAO userDao = new UserDAOImpl();

	public boolean login(User user) {
		try {
			return userDao.login(user);
		} catch (Exception e) {
			CommonUtil.printStacktrace(e);
			return false;
		}
	}
}

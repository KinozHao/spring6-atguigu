package c_inoutbean.service;

import c_inoutbean.dao.UserDao;

/**
 * @author kinoz
 * @Date 2022/7/17 - 9:54
 * @apiNote
 */
public class UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("这个输出为SERVICE的add方法");
        userDao.updateAdd();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}

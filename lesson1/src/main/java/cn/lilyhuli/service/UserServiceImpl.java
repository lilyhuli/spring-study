package cn.lilyhuli.service;

import cn.lilyhuli.dao.UserDao;
import cn.lilyhuli.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}

package cn.lilyhuli.service;

import cn.lilyhuli.dao.UserDao;
import cn.lilyhuli.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    //利用set实现
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }



    @Override
    public void getUser() {
        userDao.getUser();
    }
}

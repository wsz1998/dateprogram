package com.service.Impl;

import com.bean.User;
import com.bean.DatabaseConnection;
import com.dao.Impl.UserDaoImpl;
import com.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService{

    private DatabaseConnection dbc;
    public boolean userRigister(User user)throws SQLException{
        boolean flag = false;
        try{
            UserDaoImpl userDao = new UserDaoImpl(dbc.getConnection());
            if(userDao.find(user)==false){
                userDao.userRigister(user);
            }else{
                System.out.println("×¢²áÊ§°Ü");
            }
        }catch (Exception e){
            throw e;
        }
        return flag;
    }
    public boolean userLogin(User user)throws SQLException{
        boolean flag = false;
        try {
            UserDaoImpl userDao = new UserDaoImpl(dbc.getConnection());
            flag = userDao.userLogin(user);
        }catch (Exception e){
            throw e;
        }
        return flag;
    }
    public boolean userUpdate(User user)throws SQLException{
        boolean flag = false;
        UserDaoImpl userDao = new UserDaoImpl(dbc.getConnection());
        try{
            flag = userDao.userUpdate(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}

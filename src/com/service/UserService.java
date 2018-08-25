package com.service;

import com.bean.User;

import java.sql.SQLException;

public interface UserService {
    /**
     * 用户注册
     * @param user
     * @return boolean true: 注册成功    false:注册失败
     * @throws SQLException
     */
    public boolean userRigister(User user)throws SQLException;

    /**
     * 用户登录
     * @param user
     * @return boolean   true  : 登录成功    false: 登录失败
     * @throws SQLException
     */
    public boolean userLogin(User user)throws SQLException;

    /**
     * 用户修改资料
     * @param user
     * @return boolean   true  : 修改成功   false :修改失败
     * @throws SQLException
     */
    public boolean userUpdate(User user)throws SQLException;
}

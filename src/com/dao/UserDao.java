package com.dao;
import com.bean.*;

import java.sql.SQLException;

public interface UserDao {
    /**
     *增加用户
     * @param   user  传入的用户对象
     * @return  boolean :  true 注册成功  false 注册失败
     * @throws SQLException
     */
    public boolean userRigister(User user)throws SQLException;

    /**
     *  登录验证
     * @param user
     * @return boolean  : true 登录成功  false 登录失败
     * @throws SQLException
     */
    public boolean userLogin(User user)throws SQLException;

    /**
     * 更改用户资料
     * @param user
     * @return  boolean  : true 修改成功  false  修改失败
     * @throws SQLException
     */
    public boolean userUpdate(User user)throws SQLException;

    /**
     * 判断是否存在此用户
     * @param user
     * @return boolean   :  true  查有此用户  false 无此用户
     * @throws SQLException
     */
    public boolean find(User user)throws SQLException;

}

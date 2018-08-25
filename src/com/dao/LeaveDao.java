package com.dao;

import com.bean.Leave;

import java.sql.SQLException;

public interface LeaveDao {
    /**
     * 增加请假信息
     * @param leave
     * @return boolean :  true  增加成功  false  增加失败
     * @throws SQLException
     */
    public boolean add(Leave leave) throws SQLException;

    /**
     * 查看所有请假数据库信息
     * @return boolean  :  true  成功   false 失败
     * @throws SQLException
     */
    public boolean findAll() throws SQLException;

    /**
     *  查看指定请假类型信息
     * @param type
     * @return boolean  : true 成功  false 失败
     * @throws SQLException
     */
    public boolean find(int type)throws SQLException;
}

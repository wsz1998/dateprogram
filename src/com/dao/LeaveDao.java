package com.dao;

import com.bean.Leave;

import java.sql.SQLException;
import java.util.List;

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
     * @return List<Leave>  返回所有信息链表
     * @throws SQLException
     */
    public List<Leave> findAll() throws SQLException;

    /**
     *  查看指定请假类型信息
     * @param type
     * @return List<Leave>  返回指定信息链表
     * @throws SQLException
     */
    public List<Leave> find(int type)throws SQLException;
    public int getAllCount()throws SQLException;
    public int getTypeCount(int type)throws SQLException;
}

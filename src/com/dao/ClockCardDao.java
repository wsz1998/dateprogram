package com.dao;

import com.bean.ClockCard;

import java.sql.SQLException;

public interface ClockCardDao {
    /**
     * 打卡信息存入数据库
     * @param clockCard
     * @return boolean  :  true  存入成功  false  存入失败
     * @throws SQLException
     */
    public boolean addCard(ClockCard clockCard) throws SQLException;

    /**
     * 查询自己打卡情况
     * @return boolean  :  true   查询成功  false  查询失败
     * @throws SQLException
     */
    public boolean findMyCard() throws SQLException;

    /**
     * 查询所有人打卡情况（admin 专属）
     * @return boolean  :  true   查询成功  false  查询失败
     * @throws SQLException
     */
    public boolean findAllCard() throws SQLException;
}

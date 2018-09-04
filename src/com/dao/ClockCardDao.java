package com.dao;

import com.bean.ClockCard;

import java.sql.SQLException;
import java.util.List;

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
    public List<ClockCard> findMyCard() throws SQLException;

    /**
     * 查询所有人打卡情况（admin 专属）
     * @return boolean  :  true   查询成功  false  查询失败
     * @throws SQLException
     */
    public List<ClockCard> findAllCard() throws SQLException;

    /**
     * 获取打卡信息数
     * @return int   :  返回信息数
     * @throws SQLException
     */
    public int getAllCount() throws SQLException;
}

package com.service;

import com.bean.ClockCard;
import com.dao.ClockCardDao;

import java.sql.SQLException;

public interface ClockCardService {
    /**
     * 员工打卡功能
     * @param clockCard
     * @return boolean  :  true  打卡成功  false  打卡失败
     * @throws SQLException
     */
    public boolean giveCard(ClockCard clockCard) throws SQLException;
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

    /**
     * 判断是否迟到，矿工
     * @param clockCard
     * @return int  :  0 正常出勤 1 迟到  2 旷工
     * @throws SQLException
     */
    public int kaoQin(ClockCard clockCard)throws SQLException;
}

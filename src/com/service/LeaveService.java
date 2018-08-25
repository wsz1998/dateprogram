package com.service;

import com.bean.Leave;
import com.bean.User;

import java.sql.SQLException;

public interface LeaveService {
    /**
     * 申请请假，出差单
     * @param leave
     * @return boolean  :  true  申请成功  false  申请失败
     * @throws SQLException
     */
    public boolean giveLeave(Leave leave) throws SQLException;

    /**
     * 查看出差情况
     * @return boolean  :  true  查看成功  false  查看失败
     * @throws SQLException
     */
    public boolean findBusinessLeave() throws SQLException;

    /**
     * 查看请假情况
     * @return boolean  :  true  查看成功  false  查看失败
     * @throws SQLException
     */
    public boolean findReasonLeave() throws SQLException;

    /**
     * 查看当前申请进度
     * @param user
     * @return boolean  :  true  查看成功  false 查看失败
     * @throws SQLException
     */
    public boolean findMyLeave(User user) throws SQLException;
}

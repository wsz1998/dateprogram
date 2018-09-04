package com.service;

import com.bean.Leave;
import com.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface LeaveService {
    /**
     * ������٣����
     * @param leave
     * @return boolean  :  true  ����ɹ�  false  ����ʧ��
     * @throws SQLException
     */
    public boolean giveLeave(Leave leave) throws SQLException;

    /**
     * �鿴�������
     * @return void
     * @throws SQLException
     */
    public List<Leave> findBusinessLeave() throws SQLException;

    /**
     * �鿴������
     * @return void
     * @throws SQLException
     */
    public List<Leave> findReasonLeave() throws SQLException;

    /**
     * �鿴��ǰ�������
     * @param user
     * @return void
     * @throws SQLException
     */
    public List<Leave> findMyLeave(User user) throws SQLException;
}

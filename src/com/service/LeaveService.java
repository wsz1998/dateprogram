package com.service;

import com.bean.Leave;
import com.bean.User;

import java.sql.SQLException;

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
     * @return boolean  :  true  �鿴�ɹ�  false  �鿴ʧ��
     * @throws SQLException
     */
    public boolean findBusinessLeave() throws SQLException;

    /**
     * �鿴������
     * @return boolean  :  true  �鿴�ɹ�  false  �鿴ʧ��
     * @throws SQLException
     */
    public boolean findReasonLeave() throws SQLException;

    /**
     * �鿴��ǰ�������
     * @param user
     * @return boolean  :  true  �鿴�ɹ�  false �鿴ʧ��
     * @throws SQLException
     */
    public boolean findMyLeave(User user) throws SQLException;
}

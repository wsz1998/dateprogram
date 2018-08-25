package com.service;

import com.bean.User;

import java.sql.SQLException;

public interface UserService {
    /**
     * �û�ע��
     * @param user
     * @return boolean true: ע��ɹ�    false:ע��ʧ��
     * @throws SQLException
     */
    public boolean userRigister(User user)throws SQLException;

    /**
     * �û���¼
     * @param user
     * @return boolean   true  : ��¼�ɹ�    false: ��¼ʧ��
     * @throws SQLException
     */
    public boolean userLogin(User user)throws SQLException;

    /**
     * �û��޸�����
     * @param user
     * @return boolean   true  : �޸ĳɹ�   false :�޸�ʧ��
     * @throws SQLException
     */
    public boolean userUpdate(User user)throws SQLException;
}

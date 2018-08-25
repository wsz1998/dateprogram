package com.dao;

import com.bean.Leave;

import java.sql.SQLException;

public interface LeaveDao {
    /**
     * ���������Ϣ
     * @param leave
     * @return boolean :  true  ���ӳɹ�  false  ����ʧ��
     * @throws SQLException
     */
    public boolean add(Leave leave) throws SQLException;

    /**
     * �鿴����������ݿ���Ϣ
     * @return boolean  :  true  �ɹ�   false ʧ��
     * @throws SQLException
     */
    public boolean findAll() throws SQLException;

    /**
     *  �鿴ָ�����������Ϣ
     * @param type
     * @return boolean  : true �ɹ�  false ʧ��
     * @throws SQLException
     */
    public boolean find(int type)throws SQLException;
}

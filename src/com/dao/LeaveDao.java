package com.dao;

import com.bean.Leave;

import java.sql.SQLException;
import java.util.List;

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
     * @return List<Leave>  ����������Ϣ����
     * @throws SQLException
     */
    public List<Leave> findAll() throws SQLException;

    /**
     *  �鿴ָ�����������Ϣ
     * @param type
     * @return List<Leave>  ����ָ����Ϣ����
     * @throws SQLException
     */
    public List<Leave> find(int type)throws SQLException;
    public int getAllCount()throws SQLException;
    public int getTypeCount(int type)throws SQLException;
}

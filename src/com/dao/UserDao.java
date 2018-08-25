package com.dao;
import com.bean.*;

import java.sql.SQLException;

public interface UserDao {
    /**
     *�����û�
     * @param   user  ������û�����
     * @return  boolean :  true ע��ɹ�  false ע��ʧ��
     * @throws SQLException
     */
    public boolean userRigister(User user)throws SQLException;

    /**
     *  ��¼��֤
     * @param user
     * @return boolean  : true ��¼�ɹ�  false ��¼ʧ��
     * @throws SQLException
     */
    public boolean userLogin(User user)throws SQLException;

    /**
     * �����û�����
     * @param user
     * @return  boolean  : true �޸ĳɹ�  false  �޸�ʧ��
     * @throws SQLException
     */
    public boolean userUpdate(User user)throws SQLException;

    /**
     * �ж��Ƿ���ڴ��û�
     * @param user
     * @return boolean   :  true  ���д��û�  false �޴��û�
     * @throws SQLException
     */
    public boolean find(User user)throws SQLException;

}

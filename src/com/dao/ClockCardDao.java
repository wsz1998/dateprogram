package com.dao;

import com.bean.ClockCard;

import java.sql.SQLException;

public interface ClockCardDao {
    /**
     * ����Ϣ�������ݿ�
     * @param clockCard
     * @return boolean  :  true  ����ɹ�  false  ����ʧ��
     * @throws SQLException
     */
    public boolean addCard(ClockCard clockCard) throws SQLException;

    /**
     * ��ѯ�Լ������
     * @return boolean  :  true   ��ѯ�ɹ�  false  ��ѯʧ��
     * @throws SQLException
     */
    public boolean findMyCard() throws SQLException;

    /**
     * ��ѯ�����˴������admin ר����
     * @return boolean  :  true   ��ѯ�ɹ�  false  ��ѯʧ��
     * @throws SQLException
     */
    public boolean findAllCard() throws SQLException;
}

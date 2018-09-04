package com.dao;

import com.bean.ClockCard;

import java.sql.SQLException;
import java.util.List;

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
    public List<ClockCard> findMyCard() throws SQLException;

    /**
     * ��ѯ�����˴������admin ר����
     * @return boolean  :  true   ��ѯ�ɹ�  false  ��ѯʧ��
     * @throws SQLException
     */
    public List<ClockCard> findAllCard() throws SQLException;

    /**
     * ��ȡ����Ϣ��
     * @return int   :  ������Ϣ��
     * @throws SQLException
     */
    public int getAllCount() throws SQLException;
}

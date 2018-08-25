package com.service;

import com.bean.ClockCard;
import com.dao.ClockCardDao;

import java.sql.SQLException;

public interface ClockCardService {
    /**
     * Ա���򿨹���
     * @param clockCard
     * @return boolean  :  true  �򿨳ɹ�  false  ��ʧ��
     * @throws SQLException
     */
    public boolean giveCard(ClockCard clockCard) throws SQLException;
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

    /**
     * �ж��Ƿ�ٵ�����
     * @param clockCard
     * @return int  :  0 �������� 1 �ٵ�  2 ����
     * @throws SQLException
     */
    public int kaoQin(ClockCard clockCard)throws SQLException;
}

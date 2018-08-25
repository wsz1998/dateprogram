package com.service.Impl;

import com.bean.ClockCard;
import com.bean.DatabaseConnection;
import com.dao.Impl.ClockCardDaoImpl;
import com.service.ClockCardService;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.SQLException;

public class ClockCardServiceImpl implements ClockCardService{
    DatabaseConnection databaseConnection = new DatabaseConnection();
    ClockCardDaoImpl cldi = new ClockCardDaoImpl(databaseConnection.getConnection());
    @Override
    public boolean giveCard(ClockCard clockCard) throws SQLException {
        boolean flag = false;
        try{
            clockCard.setStatus(this.kaoQin(clockCard));
            cldi.addCard(clockCard);
        }catch (Exception e){

        }
        return flag;
    }

    @Override
    public boolean findMyCard() throws SQLException {
        return false;
    }

    @Override
    public boolean findAllCard() throws SQLException {
        return false;
    }

    @Override
    public int kaoQin(ClockCard clockCard) throws SQLException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date worktime = null;
        Date workout = null;
        Date starttime = null;
        Date endtime = null;
        try{
            worktime  = df.parse("07:00:00");
            workout   = df.parse("18:00:00");
            starttime = df.parse(clockCard.getStart());
            endtime   = df.parse(clockCard.getEnd());

            Calendar date1 = Calendar.getInstance();
            date1.setTime(worktime);

            Calendar date2 = Calendar.getInstance();
            date2.setTime(workout);

            Calendar date3 = Calendar.getInstance();
            date3.setTime(starttime);

            Calendar date4 = Calendar.getInstance();
            date4.setTime(endtime);

            if(date3.after(date1)&&date3.before(date2)){
                return 1;
            }
            if ((date3.before(date1)&&date4.before(date1))||(date3.after(date2)&&date4.after(date2))){
                return 2;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }
}

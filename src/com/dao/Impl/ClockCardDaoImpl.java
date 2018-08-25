package com.dao.Impl;

import com.bean.ClockCard;
import com.dao.ClockCardDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClockCardDaoImpl implements ClockCardDao {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    public ClockCardDaoImpl(Connection con){
        this.con = con;
    }
    @Override
    public boolean addCard(ClockCard clockCard) throws SQLException {
        boolean flag = false;
        try{
            clockCard.setId(ps.executeUpdate());
            sql = "INSERT INTO am_clock_card (id,user_id,date,start_time,end_time,status) value (?,?,?,?,?,?)";
            ps.setInt(1,clockCard.getId());
            ps.setInt(2,clockCard.getUser_id());
            ps.setString(3,clockCard.getDate());
            ps.setString(4,clockCard.getStart());
            ps.setString(5,clockCard.getEnd());
            ps.setInt(6,clockCard.getStatus());
            ps = con.prepareStatement(sql);

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ps.close();
            con.close();
            flag = true;
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
}

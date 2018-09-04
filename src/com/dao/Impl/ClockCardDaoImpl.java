package com.dao.Impl;

import com.bean.ClockCard;
import com.dao.ClockCardDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public List<ClockCard> findMyCard() throws SQLException {
        List<ClockCard> clockCards = new ArrayList<>();

        return clockCards;
    }

    @Override
    public List<ClockCard> findAllCard() throws SQLException {
        List<ClockCard> clockCards = new ArrayList<>();
        ClockCard clockCard = new ClockCard();
        sql = "SELECT * FROM am_clock_card";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                clockCard.setId(rs.getInt("id"));
                clockCard.setUser_id(rs.getInt("user_id"));
                clockCard.setDate(rs.getString("date"));
                clockCard.setStart(rs.getString("start"));
                clockCard.setEnd(rs.getString("end"));
                clockCard.setStatus(rs.getInt("status"));
                clockCards.add(clockCard);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return clockCards;
    }

    @Override
    public int getAllCount() throws SQLException {
        int count = 0;
        sql = "SELECT COUNT(*) FROM am_clock_card WHERE type";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                count = rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }


}

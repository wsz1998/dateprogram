package com.dao.Impl;

import com.bean.Leave;
import com.dao.LeaveDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveDaoImpl implements LeaveDao {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    public LeaveDaoImpl(Connection con){
        this.con = con;
    }
    @Override
    public boolean add(Leave leave)throws SQLException{
        boolean flag = false;
        try{
            leave.setId(ps.executeUpdate());
            sql = "INSERT INTO am_leave (id,user_id,date,start,end,site,type,reason,isExigency,status) valus(?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,leave.getId());
            ps.setInt(2,leave.getUser_id());
            ps.setString(3,leave.getDate());
            ps.setString(4,leave.getStart());
            ps.setString(5,leave.getEnd());
            ps.setString(6, leave.getSite());
            ps.setInt(7,leave.getType());
            ps.setString(8,leave.getReason());
            ps.setInt(9,leave.getIsExigency());
            ps.setInt(10,leave.getStatus());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ps.close();
            con.close();
            flag = true;
        }
        return flag;
    }

    @Override
    public List<Leave> findAll() throws SQLException {
        List<Leave> list = new ArrayList<>();
        sql = "SELECT * FROM am_leave";
        ps = con.prepareStatement(sql);
        rs = this.ps.executeQuery();
        while (rs.next()){
            Leave leave = new Leave();
            leave.setId(rs.getInt("id"));
            leave.setUser_id(rs.getInt("user_id"));
            leave.setDate(rs.getString("date"));
            leave.setStart(rs.getString("start"));
            leave.setEnd(rs.getString("end"));
            leave.setSite(rs.getString("site"));
            leave.setType(rs.getInt("type"));
            leave.setReason(rs.getString("reason"));
            leave.setIsExigency(rs.getInt("isExigency"));
            leave.setAuditor_id(rs.getInt("auditor_id"));
            leave.setRejection(rs.getString("rejection"));
            leave.setStatus(rs.getInt("status"));
            list.add(leave);
        }
        return list;
    }

    @Override
    public List<Leave> find(int type) throws SQLException {
        List<Leave> list = new ArrayList<>();
        sql = "SELECT * FROM am_leave where type "+type;
        ps = con.prepareStatement(sql);
        rs = this.ps.executeQuery();
        while (rs.next()){
            Leave leave = new Leave();
            leave.setId(rs.getInt("id"));
            leave.setUser_id(rs.getInt("user_id"));
            leave.setDate(rs.getString("date"));
            leave.setStart(rs.getString("start"));
            leave.setEnd(rs.getString("end"));
            leave.setSite(rs.getString("site"));
            leave.setType(rs.getInt("type"));
            leave.setReason(rs.getString("reason"));
            leave.setIsExigency(rs.getInt("isExigency"));
            leave.setAuditor_id(rs.getInt("auditor_id"));
            leave.setRejection(rs.getString("rejection"));
            leave.setStatus(rs.getInt("status"));
            list.add(leave);
        }
        return list;
    }

    @Override
    public int getAllCount() throws SQLException {
        int count = 0;
        sql = "SELECT COUNT(*) FROM am_leave";
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

    @Override
    public int getTypeCount(int type) throws SQLException {
        int count = 0;
        sql = "SELECT COUNT(*) FROM am_leave WHERE type"+type;
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

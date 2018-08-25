package com.dao.Impl;

import com.bean.Leave;
import com.dao.LeaveDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public boolean findAll() throws SQLException {
        return false;
    }

    @Override
    public boolean find(int type) throws SQLException {
        return false;
    }
}

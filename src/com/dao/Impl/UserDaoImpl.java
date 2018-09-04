package com.dao.Impl;

import com.bean.User;
import com.dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    public UserDaoImpl(Connection conn){
        this.con = conn;
    }
    public boolean userRigister(User user)throws SQLException{
        boolean flag = false;
        try {
            sql = "INSERT INTO am_user values(?,?,?,?,?,?,?,?)";
            this.ps = this.con.prepareStatement(sql);
            rs = this.ps.executeQuery();
            ps.setString(1,user.getName());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getSex());
            ps.setInt(4,user.getMarry());
            ps.setString(5,user.getPhone());
            ps.setString(6,user.getEmail());
            ps.setString(7,user.getDepartment());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(this.ps!=null){
                this.ps.close();
            }
        }
        return flag;
    }
    public boolean userLogin(User user)throws SQLException{
      boolean flag = false;
      try {
          //判断登录时是否是用户名登录
            if(user.getName()!=null){
                sql = "SELECT * FROM am_user WHERE am_user_name=? AND am_user_password=?";
                this.ps = this.con.prepareStatement(sql);
                this.ps.setString(1,user.getName());
                this.ps.setString(2,user.getPassword());
                rs = this.ps.executeQuery();
                flag = rs.next();
            }

      }catch (Exception e){
           throw e;
      }finally {
          if(this.ps!=null){
              try {
                  this.ps.close();   //关闭操作
              }catch (Exception e){
                  throw e;
              }
          }
      }
        return flag;
    }
    public boolean userUpdate(User user)throws SQLException{

        boolean flag = false;
        try {
            sql = "UPDATE user set am_user_sex=?,am_user_marriage=?,am_user_phone=?,am_user_mail=?,am_user_department=? where am_user_id=?";
            ps.executeUpdate(sql);
            ps.setString(4,user.getSex());
            ps.setInt(5,user.getMarry());
            ps.setString(6,user.getPhone());
            ps.setString(7,user.getEmail());
            ps.setString(8,user.getDepartment());
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean find(User user)throws SQLException{
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        try{

            sql = "SELECT * FROM am_user WHERE am_user_email='"+user.getEmail()+"'";
            ps = this.con.prepareStatement(sql);
            rs = this.ps.executeQuery();
            flag1 = rs.next();

            sql = "SELECT * FROM am_user WHERE am_user_name='"+user.getName()+"'";
            ps = this.con.prepareStatement(sql);
            rs = this.ps.executeQuery();
            flag2 = rs.next();

            sql = "SELECT * FROM am_user WHERE am_user_phone='"+user.getName()+"'";
            ps = this.con.prepareStatement(sql);
            rs = this.ps.executeQuery();
            flag2 = rs.next();

        }catch (Exception e){
            e.printStackTrace();
        }
        return (flag1||flag2||flag3);
    }

}

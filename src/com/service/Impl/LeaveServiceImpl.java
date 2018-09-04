package com.service.Impl;

import com.bean.DatabaseConnection;
import com.bean.Leave;
import com.bean.PageBean;
import com.bean.User;
import com.dao.Impl.LeaveDaoImpl;
import com.service.LeaveService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveServiceImpl implements LeaveService {
    DatabaseConnection databaseConnection = new DatabaseConnection();
    LeaveDaoImpl leaveDao = new LeaveDaoImpl(databaseConnection.getConnection());
    @Override
    public boolean giveLeave(Leave leave) throws SQLException {
        boolean flag = false;
        if(leaveDao.add(leave)){flag = true;}
        return flag;
    }

    @Override
    public List<Leave> findBusinessLeave() throws SQLException {
        List<Leave> leaveList = new ArrayList<>();
        leaveDao.find(3);
        return leaveList;
    }

    @Override
    public List<Leave> findReasonLeave() throws SQLException {
        List<Leave> leaveList = new ArrayList<>();
        leaveDao.find(3);
        return leaveList;
    }

    @Override
    public List<Leave> findMyLeave(User user) throws SQLException {
        List<Leave> leaveList = new ArrayList<>();
        leaveDao.find(3);
        return leaveList;
    }
}

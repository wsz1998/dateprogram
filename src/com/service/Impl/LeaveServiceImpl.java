package com.service.Impl;

import com.bean.DatabaseConnection;
import com.bean.Leave;
import com.bean.User;
import com.dao.Impl.LeaveDaoImpl;
import com.service.LeaveService;

import java.sql.SQLException;

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
    public boolean findBusinessLeave() throws SQLException {
        return false;
    }

    @Override
    public boolean findReasonLeave() throws SQLException {
        return false;
    }

    @Override
    public boolean findMyLeave(User user) throws SQLException {
        return false;
    }
}

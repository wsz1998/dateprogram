package com.controller;

import com.bean.Leave;
import com.service.Impl.LeaveServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LeaveServlet")
public class LeaveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer integer = new Integer(request.getParameter("1"));
        int type = 0;
        String reason;
        Leave leave = new Leave();
        leave.setUser_id(integer.parseInt(request.getParameter("user_id")));
        leave.setDate(request.getParameter("date"));
        leave.setStart(request.getParameter("start"));
        leave.setEnd(request.getParameter("end"));
        leave.setType(integer.parseInt(request.getParameter("Type")));
        leave.setReason(request.getParameter("reason"));
        leave.setIsExigency(integer.parseInt(request.getParameter("isExigency")));

        LeaveServiceImpl lsi = new LeaveServiceImpl();
        try {
            lsi.giveLeave(leave);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}

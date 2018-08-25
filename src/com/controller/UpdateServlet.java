package com.controller;

import com.bean.User;
import com.service.Impl.UserServiceImpl;
import com.utils.checkNull;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        UserServiceImpl usi = new UserServiceImpl();
        checkNull checkNull = new checkNull();
        /*
        user.setSex(request.getParameter(""));
        user.setMarry(request.getParameter(""));
        user.setEmail(request.getParameter(""));
        user.setDepartment(request.getParameter(""));
        user.setPhone(request.getParameter(""));

        */
        if (checkNull.updateNull(user)) {
            try {
                usi.userUpdate(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

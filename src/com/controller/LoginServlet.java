package com.controller;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.bean.*;
import com.bean.DatabaseConnection;
import com.dao.Impl.UserDaoImpl;
import com.utils.checkNull;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "login.jsp";
        String userName = request.getParameter("userid");
        String password = request.getParameter("userpass");
        checkNull checkNull = new checkNull();
        User user = new User();
        user.setName(userName);
        user.setPassword(password);
        List<String> info = new ArrayList<String>();
        //判断是否填写有空
        if (!checkNull.loginNull(user)) {
            info.add("用户名/密码不能为空");
        }
            if(info.size()!=0) {
                try {
                    if (new UserDaoImpl(new DatabaseConnection().getConnection()).userLogin(user)) {
                        info.add("登录成功");
                    } else info.add("登录失败");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                request.setAttribute("user",user);
                request.setAttribute("info", info);
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doPost(request,response);
    }
}

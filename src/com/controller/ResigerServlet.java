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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ResigerServlet")
public class ResigerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User() ;
        UserServiceImpl usi = new UserServiceImpl();
        checkNull checkNull = new checkNull();
       /*
        user.setName(request.getParameter(""));
        user.setSex(request.getParameter(""));
        user.setMarry(request.getParameter(""));
        user.setEmail(request.getParameter(""));
        user.setDepartment(request.getParameter(""));
        user.setPhone(request.getParameter(""));
        user.setPassword(request.getParameter(""));
        */
        List<String> info = new ArrayList<String>();
        /*判断是否填写有空
        if(user.getName()==null||user.getName().equals("")){
            info.add("姓名不能为空");
        }
        if(user.getSex()==null||user.getSex().equals("")){
            info.add("性别不能为空");
        }
        if(user.getDepartment()==null||user.getDepartment().equals("")){
            info.add("部门不能为空");
        }
        if(user.getEmail()==null||user.getEmail().equals("")){
            info.add("邮箱不能为空");
        }
        if(user.getPassword()==null||user.getPassword().equals("")){
            info.add("密码不能为空");
        }
        if(user.getPhone()==null||user.getPhone().equals("")){
            info.add("电话不能为空");
        }
        if(user.getMarry()!=0||user.getMarry()!=1){
            info.add("婚姻状况不能为空");
        }
        */
        if(checkNull.resigerNull(user)){
            info.add("用户名/密码不能为空");
        }
        /*
        此处差一个验证码注册！！！
         */
        if(info.size()==0){
            //若无错误，注册成功，写入数据库
            try{
                usi.userRigister(user);
            }catch (Exception e){
                System.out.println("注册失败");
                e.printStackTrace();
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}

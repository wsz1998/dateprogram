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
        /*�ж��Ƿ���д�п�
        if(user.getName()==null||user.getName().equals("")){
            info.add("��������Ϊ��");
        }
        if(user.getSex()==null||user.getSex().equals("")){
            info.add("�Ա���Ϊ��");
        }
        if(user.getDepartment()==null||user.getDepartment().equals("")){
            info.add("���Ų���Ϊ��");
        }
        if(user.getEmail()==null||user.getEmail().equals("")){
            info.add("���䲻��Ϊ��");
        }
        if(user.getPassword()==null||user.getPassword().equals("")){
            info.add("���벻��Ϊ��");
        }
        if(user.getPhone()==null||user.getPhone().equals("")){
            info.add("�绰����Ϊ��");
        }
        if(user.getMarry()!=0||user.getMarry()!=1){
            info.add("����״������Ϊ��");
        }
        */
        if(checkNull.resigerNull(user)){
            info.add("�û���/���벻��Ϊ��");
        }
        /*
        �˴���һ����֤��ע�ᣡ����
         */
        if(info.size()==0){
            //���޴���ע��ɹ���д�����ݿ�
            try{
                usi.userRigister(user);
            }catch (Exception e){
                System.out.println("ע��ʧ��");
                e.printStackTrace();
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}

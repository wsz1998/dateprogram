package com.controller;

import com.bean.ClockCard;
import com.service.ClockCardService;
import com.service.Impl.ClockCardServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClockCardServlet")
public class ClockCardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClockCardServiceImpl clockCardServiceimpl = new ClockCardServiceImpl();
        String cou = request.getParameter("count");
        int count = Integer.valueOf("cou");


        ClockCard clockCard = new ClockCard();
        clockCard.setDate(request.getParameter("date"));
        clockCard.setStart(request.getParameter("start"));
        clockCard.setEnd(request.getParameter("end"));
        //强转为整型
        String user_id = request.getParameter("user_id");
        clockCard.setUser_id(Integer.valueOf("user_id"));
        try {
            clockCard.setStatus(clockCardServiceimpl.kaoQin(clockCard));
            clockCardServiceimpl.giveCard(clockCard);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

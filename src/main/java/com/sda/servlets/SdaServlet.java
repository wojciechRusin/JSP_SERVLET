package com.sda.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SdaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{
        String userName = req.getParameter("userName");

        //TODO what if parameter doesn't exist
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Siemanko mordeczko!<b>\n" + userName + "</b></h1>");

    }


}

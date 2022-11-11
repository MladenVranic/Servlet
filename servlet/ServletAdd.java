package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletAdd", value = "/ServletAdd")
public class ServletAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response type
        response.setContentType("text/html");
        //get writer
        PrintWriter write = response.getWriter();
        //get inputfield values
        String name = request.getParameter("name");
        String country = request.getParameter("country");
        String company = request.getParameter("company");

        //add participant
        Servlet.c.addParticipant(name,country,company);

        write.println(
                "<html>" +
                        "<head><title>Add</title></head>" +
                        "<body>" +
                        "<h1>Participant added: </h1> <br>" +
                        name + " " + country + " " + company
                         +
                        "</body>" +
                        "</html>"

        );

    }
}

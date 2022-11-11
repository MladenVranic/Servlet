package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

@WebServlet(name = "ServletAll", value = "/ServletAll")
public class ServletAll extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response type
        response.setContentType("text/html");
        //get writer
        PrintWriter write = response.getWriter();
        HashSet<Participant> pl = Servlet.c.getParticipants();
        String part = "";

        for(Participant p: pl){
            part = p.getName().toString() + " " + p.getComany().toString() + " " + p.getCountry().toString();
        }



        write.println("<HTML>" +
                "<HEAD><TITLE>title</TITLE></HEAD>" +
                "<BODY><HR>" +
                "<h1>All Participants of the Conference: </h1>" +
                 part +
                "</form>" +
                "</BODY>" +
                "</HTML>"
        );

    }
}

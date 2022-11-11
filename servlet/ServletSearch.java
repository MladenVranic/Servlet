package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSearch", value = "/ServletSearch")
public class ServletSearch extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response type
        response.setContentType("text/html");
        //get printwriter, to write response html
        PrintWriter write = response.getWriter();
        //get value from input field of index file
        String find = request.getParameter("search");
        //create new participant
        Participant p = Servlet.c.searchParticipant(find);
        String res;
        //check if participant exists
        if(p != null){
            res = "name: " + p.getName() + " "+
                    "company: " + p.getComany() +" "+
                    "country: " + p.getCountry();

        }else {
            res = "Participant not found!";
        }

        write.println(
                "<HTML>" +
                        "<HEAD><TITLE>title</TITLE></HEAD>" +
                        "<BODY><HR>" +
                        "<h1>Paritipant: </h1>" +
                        "<h3>" + res +"</h3>"+
                        "</BODY>" +
                        "</HTML>"
        );
    }
}

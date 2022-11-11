package com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    //create static Conference object
    public static Conference c = new Conference("test");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set response type
        response.setContentType("text/html");
        //get writer
        PrintWriter write = response.getWriter();
        String choice = request.getParameter("choice");

        switch(choice){
            case "a":
                write.println(
                        "<HTML>" +
                                "<HEAD><TITLE>title</TITLE></HEAD>" +
                                "<BODY><HR>" +
                                "<h1>Name of participant to find: </h1>" +
                                "<form action='ServletSearch' method=POST>" +
                                "<input type=text size=20 name=search>" +
                                "<input type=submit>" +
                                "</form>" +
                                "</BODY>" +
                                "</HTML>"
                );
            case "b":
                write.println(
                        "<HTML>" +
                                "<HEAD><TITLE>title</TITLE></HEAD>" +
                                "<BODY><HR>" +
                                "<h1>Name of participant to find: </h1>" +
                                "<form action='ServletAdd' method=POST>" +
                                "<input type=text size=20 name=name>" +
                                "<input type=text size=20 name=country>" +
                                "<input type=text size=20 name=company>" +
                                "<input type=submit>" +
                                "</form>" +
                                "</BODY>" +
                                "</HTML>"
                );
            case "c":
                write.println(
                        "<HTML>" +
                                "<HEAD><TITLE>title</TITLE></HEAD>" +
                                "<BODY><HR>" +
                                "<h1>All Participants of the Conference: </h1>" +
                                "<form action='ServletAll' method=POST>" +
                                "<input type=submit>" +
                                "</form>" +
                                "</BODY>" +
                                "</HTML>"
                );

        }
    }
}

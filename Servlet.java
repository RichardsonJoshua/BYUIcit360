package com.jbt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns = {"/servlet"})
public class Servlet extends HttpServlet {

	//Servlet recieves request and checks exceptions
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter output = response.getWriter()) {
            int number;
            int thisNumber = 87;
            String name = request.getParameter("name");
            number = Integer.parseInt(request.getParameter("number"));
            
            //request prompts the program to display
            String Movie = request.getParameter("Movie");
            output.println("Do you play hockey? /n Sidney Crosby wears number " + thisNumber + ".");
            output.println();
            if (number < thisNumber) {
                output.println("If you wear number " + number + ", then the difference between your number and Crosby's is" + (thisNumber - number));
                output.println();
            }else {
                output.println("If you wear number " + number + ", then the difference between your number and Crosby's is" + (number - thisNumber));
                output.println();
            }
            output.println("but Crosby is better than number " + number);
        }
    }

    
    //This here will interpret and react to the request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    //This handles the HTTP method.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    //Then the program will return a message
    @Override
    public String getServletInfo() {
        return "Sidney Crosby, Alex Ovechkin, John Tavares, Jamie Benn.";
    }

}

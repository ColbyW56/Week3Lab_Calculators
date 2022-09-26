/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author colby
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String age = request.getParameter("ageBox");
        
        request.setAttribute("ageBox", age);
        
        if (age == null || age.equals("")) {
            request.setAttribute("ageVal", "You must give your current age.");
        } else {
            try {
                int yourAge = Integer.parseInt(age);
                int nextAge = yourAge + 1;
                request.setAttribute("ageVal", "Your age on your next birthday will be " + nextAge);
            } catch (NumberFormatException err) {
                request.setAttribute("ageVal", "You must give your current age.");
            }

        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
    
    
}
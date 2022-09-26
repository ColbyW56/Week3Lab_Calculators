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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstBox = request.getParameter("first");
        String secondBox = request.getParameter("second");
        String operation = request.getParameter("button");
        String answer = "";
        
        request.setAttribute("first", firstBox);
        request.setAttribute("second", secondBox);
        
        if (firstBox == null || firstBox.equals("") || secondBox == null || secondBox.equals("")) {
            answer = "invalid";
        } else {
            try {
                switch(operation) {
                    case "+":
                        answer = "" + (Integer.parseInt(firstBox) + Integer.parseInt(secondBox));
                        break;
                    case "-":
                        answer = "" + (Integer.parseInt(firstBox) - Integer.parseInt(secondBox));
                        break;
                    case "*":
                        answer = "" + (Integer.parseInt(firstBox) * Integer.parseInt(secondBox));
                        break;
                    case "%":
                        answer = "" + (Integer.parseInt(firstBox) % Integer.parseInt(secondBox));
                        break;
                }
            } catch (NumberFormatException err) {
                answer = "invalid";
            }
        }
        
        request.setAttribute("result", answer);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

}

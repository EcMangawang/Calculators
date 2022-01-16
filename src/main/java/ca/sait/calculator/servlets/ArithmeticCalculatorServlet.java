package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emmari
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("message", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        String calculation = request.getParameter("calculate");
        
        if (firstNumber != null && secondNumber != null) {
            
            try {
                
                int firstNum = Integer.parseInt(firstNumber);
                int secondNum = Integer.parseInt(secondNumber);
                int result;
                
                switch (calculation) {
                    case "add":
                        result = firstNum + secondNum;
                        break;
                    case "subtract":
                        result = firstNum - secondNum;
                        break;
                    case "multiply":
                        result = firstNum * secondNum;
                        break;
                    case "divide":
                        result = firstNum / secondNum;
                        break;
                    default:
                        throw new Exception();
                }
                request.setAttribute("message", result);
            } catch (Exception ex) {
                request.setAttribute("message", "Invalid");
            }
            
            request.setAttribute("first", firstNumber);
            request.setAttribute("second", secondNumber);

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
}
}

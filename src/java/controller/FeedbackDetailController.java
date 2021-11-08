/*			
 * Copyright(C) 2005, Morses Club of London Scottish Bank.			
 * T.NET:			
 *  Transport and Information Network			
 *			
 * Record of change:			
 * DATE            Version             AUTHOR           DESCRIPTION			
 * 2021-10-27      1.0                 LongNVSE04068    Feedback Detail Controller		
 */
package controller;

import dao.impl.FeedbackDAOImpl;
import entity.Feedback;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**				
 * The class contains method find select feedback detail in database				
 * feedback table all data will be normalized 	
 * The method wil returns Feedback Object to	show in <br>FeedbackDetail</br>			
 *				
 * @author longnv				
 */			
public class FeedbackDetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FeedbackDetailController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FeedbackDetailController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        try {
            Feedback feedback = new Feedback();
            FeedbackDAOImpl feedbackDAO = new FeedbackDAOImpl();
            //get feedback by id in database
            feedback = feedbackDAO.findById(Integer.parseInt(request.getParameter("id")));
            //set feedback object to attribute
            request.setAttribute("data", feedback);
            //forward
            request.getRequestDispatcher("feedbackdetail.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

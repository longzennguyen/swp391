/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-28    1.0        DucNT           First Version<br>
 */
package controller;

import dao.impl.SliderDAOImpl;
import entity.Slider;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * processRequest:<br>
 * - Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods <br>
 * doGet <br>
 * - Get number of page for pagination <code>Slider</code>  <br>
 * - Get list of <code>Slider</code> in database then display <br>
 * doPost  <br>
 * - Handles the HTTP <code>POST</code> method  <br>
 *
 * @author DucNT
 */
public class SliderController extends HttpServlet {

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
            out.println("<title>Servlet SliderController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SliderController at " + request.getContextPath() + "</h1>");
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
            int pageSize = 4;
            // get page current
            int page;
            try {
                page = Integer.parseInt(request.getParameter("page"));
            } catch (NumberFormatException ex) {
                page = 1;
            }
            if (page <= 0) {
                page = 1;
            }
            SliderDAOImpl sliderDAO = new SliderDAOImpl();
            ArrayList<Slider> sliderList = sliderDAO.getAllSliders(pageSize, page);
            if (!sliderList.isEmpty()) {
                // get number page
                int numberPage = sliderDAO.getNumberOfPages(pageSize);
                request.setAttribute("numberPage", numberPage);
                request.setAttribute("page", page);
            }
            request.setAttribute("sliderList", sliderList);
        } catch (Exception ex) {
            Logger.getLogger(SliderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("sliderlist.jsp").forward(request, response);  
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

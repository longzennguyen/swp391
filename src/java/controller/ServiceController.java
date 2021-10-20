/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-10    1.0        DucNT           First Version<br>
 */
package controller;

import dao.impl.ServiceDAOImpl;
import entity.Service;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Process:<br>
 * - Get all service<br>
 * Get:<br>
 * Get all service paging to display
 * Get all service by search word to display
 * 
 * @author DucNT
 */
public class ServiceController extends HttpServlet {

    /**
     * Get all <code>Service</code> from database then display to jsp page
     * Get pagination
     * 
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
        try {
            ServiceDAOImpl dao = new ServiceDAOImpl();
            ArrayList<Service> serviceList;
            serviceList = dao.getAllServices();
            request.setAttribute("serviceList", serviceList);
            request.getRequestDispatcher("servicelist.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServiceController.class.getName()).log(Level.SEVERE, null, ex);
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
            int pageSize = 3;
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
            
            ServiceDAOImpl serviceDAO = new ServiceDAOImpl();
            ArrayList<Service> serviceList;
            serviceList = serviceDAO.getServicesPaging(pageSize, page);
            if (!serviceList.isEmpty()) {
                // get number page
                int numberPage = serviceDAO.getNumberOfPages(pageSize);
                request.setAttribute("numberPage", numberPage);
                request.setAttribute("page", page);
            }
            request.setAttribute("serviceList", serviceList);
            request.getRequestDispatcher("servicelist.jsp").forward(request, response);

        } catch (Exception ex) {
            Logger.getLogger(ServiceController.class.getName()).log(Level.SEVERE, null, ex);
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

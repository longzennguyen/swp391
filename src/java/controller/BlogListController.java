/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-10    1.0        LongNV          First Version<br>
 */
package controller;

import dao.impl.BlogDAOImpl;
import entity.Blogs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**				
 * The class contains method find select blog list in database				
 * Post table all data will be normalized 	
 * The method wil return Post Object to	show in <br>BlogList</br>			
 *				
 * @author longnv				
 */

public class BlogListController extends HttpServlet {

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
        try {
            response.setContentType("text/html;charset=UTF-8");
            //set page size
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
            
            BlogDAOImpl blogDAO = new BlogDAOImpl();
            ArrayList<Blogs> blogList;
            ///get list blogs
            blogList = blogDAO.getBlogsPaging(pageSize, page);
            if (!blogList.isEmpty()) {
                // get number page
                int numberPage = blogDAO.getNumberOfPages(pageSize);
                //set attribute
                request.setAttribute("numberPage", numberPage);
                request.setAttribute("page", page);
            }
            request.setAttribute("blogList", blogList);
            //forward
            request.getRequestDispatcher("/BlogList.jsp").forward(request, response);
            
        } catch (Exception ex) {
            Logger.getLogger(BlogListController.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);
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

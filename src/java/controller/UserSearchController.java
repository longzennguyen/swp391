/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package controller;

import dao.impl.UserDAOImpl;
import entity.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * processRequest:<br>
 * - Get search "word" from user input <br>
 * - Find list of <code>User</code> by search word <br>
 * - Get paginated of searched list of <code>User</code> <br>
 * doGet <br>
 * - Get <code>User</code> profile from database <br>
 * doPost  <br>
 * Handles the HTTP <code>POST</code> method.<br>
 * @author DucNT
 */
public class UserSearchController extends HttpServlet {

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
        String word = request.getParameter("word");
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
        UserDAOImpl dao = new UserDAOImpl();
        ArrayList<User> userListSearch;        
        try {
            userListSearch = dao.getAllUserPagingbyWord(word, pageSize, page);
            if (!userListSearch.isEmpty()) {
                int numberPage = dao.getNumberOfPagesSearch(pageSize, word);
                request.setAttribute("numberPage", numberPage);
                request.setAttribute("word", word);
            }            
            request.setAttribute("page", page);
            request.setAttribute("userList", userListSearch);
            request.getRequestDispatcher("usersearch.jsp").forward(request, response);
            
        } catch (Exception ex) {
            Logger.getLogger(UserSearchController.class.getName()).log(Level.SEVERE, null, ex);
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

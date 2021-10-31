/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.impl.UserDAOImpl;
import entity.User;
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
 *
 * @author ROG STRIX
 */
public class CustomerListController extends HttpServlet {

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
        int pageSize = 5;
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
        UserDAOImpl userDAO = new UserDAOImpl();
        String search = request.getParameter("word");
        
        ArrayList<User> customerList = null;
        if (search.isEmpty()) {
            try {
                // get all User from database for list
                customerList = userDAO.getAllCustomerPaging(pageSize, page);
                if (!customerList.isEmpty()) {
                    // get number page
                    int numberPage = userDAO.getNumberOfPageCustomer(pageSize);
                    request.setAttribute("numberPage", numberPage);
                    request.setAttribute("page", page);
                    request.setAttribute("word", search);
                }
            } catch (Exception ex) {
                Logger.getLogger(CustomerListController.class.getName()).log(Level.SEVERE, null, ex);
            }            
        } 
        else {
            try {
                customerList = userDAO.getAllCustomerPagingbyWord(pageSize, page, search);
                if (!customerList.isEmpty()) {
                    int numberPage = userDAO.getNumberOfPageCustomerSearch(pageSize, search);
                    request.setAttribute("numberPage", numberPage);
                }
                request.setAttribute("page", page);
                request.setAttribute("word", search);
                
            } catch (Exception ex) {
                Logger.getLogger(CustomerListController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("customerlist.jsp").forward(request, response);

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

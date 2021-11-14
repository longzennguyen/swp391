/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.manager;

import dao.IServiceDAO;
import dao.impl.ServiceDAOImpl;
import entity.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ServicelistController extends HttpServlet {

    private static final int PAGE_SIZE = 5;

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
        IServiceDAO serviceDao = new ServiceDAOImpl();
        int index = getPageIndex(request);
        System.out.println(index);
        String keyword = request.getParameter("keyword");
        String sort = request.getParameter("sort");
        sort = (sort == null) ? "" : sort;
                    System.out.println(sort);
        keyword = (keyword == null ? "" : keyword);
        try {
            List<entity.Service> data = serviceDao.getAllServicePagingbyWord(keyword,sort, PAGE_SIZE, index);
            int totalDat = serviceDao.getNumberOfPagesSearch(PAGE_SIZE, keyword);
            request.setAttribute("totalPage", totalDat);
            request.setAttribute("data", data);
            request.setAttribute("index", index);
        } catch (Exception ex) {
            Logger.getLogger(ServicelistController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("keyword", keyword);
        request.setAttribute("sort", sort);
        request.getRequestDispatcher("ServiceList.jsp").forward(request, response);
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

    private Integer getPageIndex(HttpServletRequest request) {
        int index = 1;
        try {
            index = Integer.parseInt(request.getParameter("index"));
        } catch (Exception e) {

        }
        return index;
    }

}

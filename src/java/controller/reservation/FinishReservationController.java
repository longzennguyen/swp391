/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.reservation;

import dao.IBankDAO;
import dao.IUserDAO;
import dao.impl.BankAccountDAOImpl;
import dao.impl.UserDAOImpl;
import entity.dto.*;
import entity.*;
import entity.dto.ReservationDto;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author huan.buivan
 */
public class FinishReservationController extends HttpServlet {

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
        List<ReservationDto> dat = (List<ReservationDto>) request.getSession().getAttribute("reservation");
        if (dat == null || dat.isEmpty()) {
            response.sendRedirect("../reservation");
            return;
        }
        double total = 0;
        for (ReservationDto x : dat) {
            total += (x.getServicePrice() * x.getQuantity());
        }
        IBankDAO bankDao = new BankAccountDAOImpl();
        List<BankAccountDto> bankList = bankDao.getAll();
        request.setAttribute("bank", bankList);

        IUserDAO userDao = new UserDAOImpl();
        try {
            List<User> userDoctor = userDao.getUserByRole(1);
            request.setAttribute("userDoctor", userDoctor);
            List<User> userNurse = userDao.getUserByRole(5);
            request.setAttribute("userNurse", userNurse);
        } catch (Exception ex) {
            Logger.getLogger(FinishReservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("total", total);
        request.getRequestDispatcher("finish.jsp").forward(request, response);
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

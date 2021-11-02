/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import entity.User;
import utils.NumberExtraction;
import entity.dto.ReservationDto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author duy.hoangdinh
 */
public class ReservationContactController extends HttpServlet {

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
                User loggedin = (User) request.getSession().getAttribute("user");
                //usr chuaw login
                if(loggedin == null){
                    response.sendRedirect("../login");
                    return;
                }
        List<ReservationDto> dat = (List<ReservationDto>) request.getSession().getAttribute("reservation");
        //khong co du lieu
        if (dat == null || dat.isEmpty()) {
            response.sendRedirect("../reservation");
            return;
        }
        //lay ID tu jsp
        for (ReservationDto x : dat) {
            if (request.getParameter("QUANTITY-" + x.getId()) == null) {
                continue;
            }
            int newQuantity = NumberExtraction.paramToInteger(request, "QUANTITY-" + x.getId());
            x.setQuantity(newQuantity);
        }

        System.out.println(loggedin.getName());
        request.setAttribute("logginedUser", loggedin);
        request.setAttribute("data", dat);
        request.getRequestDispatcher("/reservation/contact.jsp").forward(request, response);
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

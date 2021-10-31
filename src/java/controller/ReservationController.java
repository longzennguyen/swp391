/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.IReservationDAO;
import dao.impl.ReservationDaoImpl;
import entity.dto.ReservationDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * file build.xml đau mo ra giup cai
 *
 * @author huan.buivan
 */
public class ReservationController extends HttpServlet {

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
        String keyword = request.getParameter("keyword");
        List<ReservationDto> result = new ArrayList<>();
        List<ReservationDto> dat = (List<ReservationDto>) request.getSession().getAttribute("reservation");
        IReservationDAO dao = new ReservationDaoImpl();
        List<ReservationDto> list = dao.getByID(1);
        if (dat == null || dat.isEmpty()) {
            request.getSession().setAttribute("reservation", list);
            dat = list;
        }
        if (keyword == null) {
            result.addAll(dat);

        } else {
            for (ReservationDto x : dat) {
                if ((x.getId() + "").contains(keyword)) {
                    result.add(x);
                } else {
                    if (x.getServiceTitle().contains(keyword)) {
                        result.add(x);
                    }
                }
            }
        }
        request.setAttribute("keyword", keyword);
        request.setAttribute("data", result);
        request.getRequestDispatcher("/reservation/detail.jsp").forward(request, response);
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

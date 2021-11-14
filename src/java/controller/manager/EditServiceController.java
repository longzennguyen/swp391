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
import java.util.Map;
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
public class EditServiceController extends HttpServlet {

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
            out.println("<title>Servlet EditServiceController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditServiceController at " + request.getContextPath() + "</h1>");
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
        Integer id = getIntVal(request, "id");
        if (id == null) {
            response.sendRedirect("../service");
            return;
        }

        IServiceDAO serviceDao = new ServiceDAOImpl();
        try {
            entity.Service data = serviceDao.getServiceDetail(id);
            request.setAttribute("data", data);
        } catch (Exception ex) {
            Logger.getLogger(EditServiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("../ServiceDetail.jsp").forward(request, response);
    }

    private Integer getIntVal(HttpServletRequest request, String param) {
        try {
            return Integer.parseInt(request.getParameter("id"));
        } catch (Exception e) {
            return null;
        }
    }

    private Double getDoubleVal(HttpServletRequest request, String param) {
        try {
            return Double.parseDouble(request.getParameter("id"));
        } catch (Exception e) {
            return null;
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
        Map<String, String[]> param = request.getParameterMap();
        for (String key : param.keySet()) {
            System.out.println(key + " = " + param.get(key)[0]);
        }

        IServiceDAO serviceDao = new ServiceDAOImpl();
        Integer id = getIntVal(request, "id");
        Integer cate = getIntVal(request, "category");
        Double price = getDoubleVal(request, "price");
        String title = request.getParameter("title");
        Integer featured = getIntVal(request, "featured");
        Integer status = getIntVal(request, "status");
        Service service = new Service();
        service.setService_id(id);
        service.setCategory_id(cate);
        service.setPrice(price);
        service.setTitle(title);
        service.setFeatured(featured);
        service.setStatus(status);
        serviceDao.update(service);
        response.sendRedirect("../service");
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

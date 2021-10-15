/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT            First Version<br>
 */
package dao.impl;

import dao.DBContext;
import dao.IServiceDAO;
import entity.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class implements from class interface IServiceDAO <br>
 * This class contains method to query select data from the table Service join
 * with table Role and Status.<br>
 * There are get all Service, get Service detail, get all service by word search
 *
 * @author DucNT
 */
public class ServiceDAOImpl extends DBContext implements IServiceDAO {

    /**
     * Get all Services in the database
     *
     *
     * @return a list <code>Service</code> object
     * @throws Exception
     */
    @Override
    public ArrayList<Service> getAllServices() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from [Service]";
        ArrayList<Service> services = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("service_id");
                String title = rs.getString("title");
                String img = getImagePath() + "Service/" + rs.getString("image");
                int category_id = rs.getInt("category_id");
                double price = rs.getInt("original_price");
                String description = rs.getString("summary");
                Service service = new Service(id, img, title, description, price, category_id);
                services.add(service);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return services;
    }

    /**
     * Get top 4 Services in the database
     *
     *
     * @return a list <code>Service</code> object
     * @throws Exception
     */
    @Override
    public ArrayList<Service> getTopServices() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select top 4 * from [Service] ORDER BY view_number";
        ArrayList<Service> services = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("service_id");
                String title = rs.getString("title");
                String img = getImagePath() + "Service/" + rs.getString("image");
                int category_id = rs.getInt("category_id");
                double price = rs.getInt("original_price");
                String description = rs.getString("summary");
                Service service = new Service(id, img, title, description, price, category_id);
                services.add(service);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return services;
    }

    @Override
    public ArrayList<Service> getServicesPaging(int pageSize, int pageIndex) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY service_id) as Number,* "
                + "FROM [Service])as dbNumber where Number between ? and ?";
        ArrayList<Service> services = new ArrayList<>();

        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, from);
            ps.setInt(2, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("service_id");
                String title = rs.getString("title");
                String img = getImagePath() + "Service/" + rs.getString("image");
                int category_id = rs.getInt("category_id");
                double price = rs.getInt("original_price");
                String description = rs.getString("summary");
                Service service = new Service(id, img, title, description, price, category_id);
                services.add(service);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return services;
    }

    @Override
    public int getNumberOfPages(int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(service_id) as number FROM [Service]";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

    @Override
    public ArrayList<Service> getAllServicePagingbyWord(String word, int pageSize, int pageIndex) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM \n"
                + "(SELECT ROW_NUMBER()\n"
                + "OVER(ORDER BY service_id) as Number,\n"
                + "* FROM [Service] where \n"
                + "title like ?)as dbNumber \n"
                + "where\n"
                + "Number between ? and ?";
        ArrayList<Service> services = new ArrayList<>();

        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + word + "%");
            ps.setInt(2, from);
            ps.setInt(3, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("service_id");
                String title = rs.getString("title");
                String img = getImagePath() + "Service/" + rs.getString("image");
                int category_id = rs.getInt("category_id");
                double price = rs.getInt("original_price");
                String description = rs.getString("summary");
                Service service = new Service(id, img, title, description, price, category_id);
                services.add(service);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return services;
    }
//    public static void main(String[] args) {
//        ServiceDAOImpl dao = new ServiceDAOImpl();
//        try {
//            ArrayList<Service> services = dao.getAllServicePagingbyWord("o", 5, 1);
//            for (Service service : services) {
//                System.out.println(service.getTitle());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ServiceDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    @Override
    public int getNumberOfPagesSearch(int pageSize, String word) throws Exception {

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(service_id) as number FROM [Service]\n"
                + "where title like ?";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + word + "%");
            rs = statement.executeQuery();

            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

}

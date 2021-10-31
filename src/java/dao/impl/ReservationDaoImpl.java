/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import dao.IReservationDAO;
import entity.dto.ReservationDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ReservationDaoImpl extends DBContext implements IReservationDAO {

    @Override
    public List<ReservationDto> getByID(int id) {
        List<ReservationDto> result = new ArrayList<>();
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "SELECT s.service_id, s.title, s.sale_price, rd.quantity FROM ReservationInformation ri\n"
                    + "LEFT JOIN reservation_data rd\n"
                    + "ON rd.reservation_id = ri.reservation_id\n"
                    + "LEFT JOIN Service s\n"
                    + "ON s.service_id = rd.service_id\n"
                    + "where rd.reservation_id = ?";
            System.out.println(sql);
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ReservationDto dto = new ReservationDto();
                dto.id = rs.getInt("service_id");
                dto.serviceTitle = rs.getString("title");
                dto.servicePrice = rs.getInt("sale_price");
                dto.quantity = rs.getInt("quantity");
                System.out.println(dto.getServiceTitle());
                result.add(dto);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(result.size());
        return result;
    }

    @Override
    public int deleteByServiceId(int id, int serviceId) {
        try {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "DELETE FROM [dbo].[ReservationInformation]"
                    + " WHERE data_id ? AND  service_id ? ";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setInt(2, serviceId);
            return stm.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insert(List<ReservationDto> dto) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            String sql = "INSERT INTO [dbo].[ReservationInformation](reservation_id,created_at,updated_at,status_id,nurse_id,doctor_id)"
                    + " VALUES(?,?,?,?,?,?,?)";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            int index = 0;
            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            stm.setInt(++index, count() + 1);
            stm.setDate(++index, date);
            stm.setDate(++index, date);
            stm.setInt(++index, 1);
            stm.setInt(++index, 1);
            stm.setInt(++index, 1);
            stm.executeUpdate();
            insertReservationData(dto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int insertReservationData(List<ReservationDto> dto) {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            String sql = "INSERT INTO [dbo].[reservation_data](reservation_id,service_id,quantity,) VALUES(?,?,?)";
            con = getConnection();
            stm = con.prepareStatement(sql);
            for (ReservationDto x : dto) {
                stm.setInt(1, x.getId());
                stm.setInt(2, x.getServiceId());
                stm.setInt(3, x.getQuantity());
                stm.addBatch();
            }
            return stm.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
                stm.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    private int count() {
        String sql = "SELECT count(*) as total FROM ReservationInformation";
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
                stm.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
}

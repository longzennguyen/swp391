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
            String sql = "SELECT s.service_id,s.title,s.sale_price,temp.service_quantity  FROM (\n"
                    + "SELECT * FROM reservation_data rd\n"
                    + "join  ReservationInformation ri\n"
                    + "on rd.id = ri.data_id \n"
                    + "where user_id = ?) as temp\n"
                    + "join \n"
                    + "Service s\n"
                    + "on s.service_id = temp.service_id\n"
                    + "";
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
                dto.quantity = rs.getInt("service_quantity");
                result.add(dto);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}

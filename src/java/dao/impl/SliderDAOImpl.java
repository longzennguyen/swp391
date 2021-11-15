/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import dao.ISliderDAO;
import entity.Service;
import entity.Slider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public class SliderDAOImpl extends DBContext implements ISliderDAO {

    @Override
    public ArrayList<Slider> getAllSliders(int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY slider_id) as Number,* \n"
                + "FROM [Slider])as dbNumber where Number between ? and ?";
        ArrayList<Slider> sliders = new ArrayList<>();

        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, from);
            ps.setInt(2, to);
            rs = ps.executeQuery();
            while (rs.next()) {
                Slider slider = new Slider();
                slider.setSlider_id(rs.getInt("slider_id"));
                slider.setDetail(getImagePath() + rs.getString("detail"));
                sliders.add(slider);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return sliders;
    }
    public static void main(String[] args) throws Exception {
        SliderDAOImpl dao = new SliderDAOImpl();
        Slider slider = dao.getSliderByID(1);
        
    }

    @Override
    public int getNumberOfPages(int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(slider_id) as number FROM [Slider]";
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
    public Slider getSliderByID(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from Slider where slider_id = ?";
        Slider slider = null;

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int slider_id = rs.getInt("slider_id");
                String detail = getImagePath() + rs.getString("detail");
                slider = new Slider(slider_id, detail);
            }
            rs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return slider;
    }

}

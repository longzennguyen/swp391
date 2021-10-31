/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import dao.IFeedbackDAO;
import entity.Feedback;
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
 * @author ROG STRIX
 */
public class FeedbackDAOImpl extends DBContext implements IFeedbackDAO {

    @Override
    public List<Feedback> getAllFeedback() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from feedback order by feedback_id desc";
        List<Feedback> listFeedbacks = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Feedback feedback = new Feedback();
                feedback.setContent(rs.getString("content"));
                feedback.setCreated(rs.getString("created_at"));
                feedback.setCreated_by(rs.getInt("created_by") + "");
                feedback.setFeedback_id(rs.getInt("feedback_id"));
                feedback.setReservation_id(rs.getInt("reservation_id"));
                feedback.setStarno(rs.getInt("star_no"));
                feedback.setUpdated(rs.getString("updated_at"));
                listFeedbacks.add(feedback);
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return listFeedbacks;
    }

    public static void main(String[] args) {
        try {
            FeedbackDAOImpl dao = new FeedbackDAOImpl();
            List<Feedback> listFeedbacks = dao.getAllFeedback();
            for (Feedback listFeedback : listFeedbacks) {
                System.out.println(listFeedback.getContent());
            }
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Feedback findById(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from (Feedback\n"
                + "join Creator on Feedback.created_by = Creator.created_by\n"
                + "join [Users] on Creator.Users_id = [Users].users_id)\n"
                + "where feedback_id = " + id;
        Feedback feedback = new Feedback();
        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                feedback.setContent(rs.getString("content"));
                feedback.setCreated(rs.getString("created_at"));
                feedback.setCreated_by(rs.getString("first_name") + rs.getString("last_name"));
                feedback.setFeedback_id(rs.getInt("feedback_id"));
                feedback.setReservation_id(rs.getInt("reservation_id"));
                feedback.setStarno(rs.getInt("star_no"));
                feedback.setUpdated(rs.getString("updated_at"));
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        return feedback;
    }

    @Override
    public int getNumberOfPages(int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(feedback_id) as number FROM [Feedback]";
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
    public ArrayList<Feedback> getAllFeedbackPaging(int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY feedback_id) as Number,* \n"
                + "FROM [Feedback])as dbNumber where Number between ? and ?";

        ArrayList<Feedback> listFeedbacks = new ArrayList<>();
        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;

            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, from);
            statement.setInt(2, to);
            rs = statement.executeQuery();

            while (rs.next()) {
                Feedback feedback = new Feedback();
                feedback.setContent(rs.getString("content"));
                feedback.setCreated(rs.getString("created_at"));
                feedback.setCreated_by(rs.getInt("created_by") + "");
                feedback.setFeedback_id(rs.getInt("feedback_id"));
                feedback.setReservation_id(rs.getInt("reservation_id"));
                feedback.setStarno(rs.getInt("star_no"));
                feedback.setUpdated(rs.getString("updated_at"));
                listFeedbacks.add(feedback);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return listFeedbacks;
    }

}

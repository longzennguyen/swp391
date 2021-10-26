/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext_Postgresql;
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
 * @author longzennguyen
 */
public class FeedbackDAOImpl extends DBContext_Postgresql implements IFeedbackDAO {

    private PreparedStatement st = null;
    private ResultSet rs = null;
    private Connection con = null;

    @Override
    public List<Feedback> getAllFeedback() {
        String sql = "select * from feedback order by feedback_id desc";
        List<Feedback> listFeedbacks = new ArrayList<>();
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
            rs = st.executeQuery();
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
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listFeedbacks;
    }

    @Override
    public Feedback findById(int id) {
        String sql = "select * from feedback where feedback_id = " + id;
        Feedback feedback = new Feedback();
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            if (!rs.next()) {
                return null;
            }
            rs = st.executeQuery();
            while (rs.next()) {
                feedback.setContent(rs.getString("content"));
                feedback.setCreated(rs.getString("created_at"));
                feedback.setCreated_by(rs.getInt("created_by") + "");
                feedback.setFeedback_id(rs.getInt("feedback_id"));
                feedback.setReservation_id(rs.getInt("reservation_id"));
                feedback.setStarno(rs.getInt("star_no"));
                feedback.setUpdated(rs.getString("updated_at"));
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return feedback;
    }

    @Override
    public int getNumberOfPages(int pageSize) {
     Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        DBContext_Postgresql db = new DBContext_Postgresql();
        String sql = "SELECT COUNT(users_id) as number FROM [Users] ";
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
        } catch (Exception ex) {
            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
         try {
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        return -1;
    }

    @Override
    public ArrayList<Feedback> getAllUserPaging(int pageSize, int pageIndex) {
//    Connection conn = null;
//        PreparedStatement statement = null;
//        ResultSet rs = null;
//
//        String sql = "with feedbackList as\n"
//                + "(select tb1.users_id,tb1.first_name,tb1.last_name,tb1.email,tb1.phone,tb1.address,\n"
//                + "tb1.gender, tb1.dob,tb1.role_id,tb2.role_name,tb1.status_id,tb3.status_name\n"
//                + "from ([Users] as tb1\n"
//                + "INNER JOIN [Role] as tb2 on tb1.role_id = tb2.role_id \n"
//                + "INNER JOIN StatusData as tb3 on tb1.status_id = tb3.status_id) \n"
//                + ")\n"
//                + "SELECT * FROM (\n"
//                + "SELECT ROW_NUMBER()\n"
//                + "OVER(ORDER BY users_id) as Number,* \n"
//                + "FROM UserbyRole )as dbNumber \n"
//                + "where Number between ? and ?";
//
//        ArrayList<Feedback> feedbacks = new ArrayList<>();
//        try {
//            int from = pageSize * (pageIndex - 1) + 1;
//            int to = pageSize * pageIndex;
//
//            conn = getConnection();
//            statement = conn.prepareStatement(sql);
//            statement.setInt(1, from);
//            statement.setInt(2, to);
//            rs = statement.executeQuery();
//            while (rs.next()) {
//                int id = rs.getInt("users_id");
//                String userName = rs.getString("first_name") + " " + rs.getString("last_name");
//                String phone = rs.getString("phone");
//                String gender;
//                if (rs.getString("gender").equals("1")) {
//                    gender = "Male";
//                } else {
//                    gender = "Female";
//                }
//                String email = rs.getString("email");
//                String address = rs.getString("address");
//                String role = rs.getString("role_name");
//                String status = rs.getString("status_name");
//                Feedback feedback = new Feedback();
//                
//                feedbacks.add(feedback);
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//        try {
//            conn.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(FeedbackDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }    
//    }
//            return feedbacks;
return null;
    }

}

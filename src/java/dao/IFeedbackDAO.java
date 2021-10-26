/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Feedback;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author longzennguyen
 */
public interface IFeedbackDAO {
    /**
     * get all feedback in database
     * @return List <code> Feedback </code> object
     */
    public List<Feedback> getAllFeedback();
    /**
     * find feedback by id
     * @param id
     * @return <code>feedback</code>
     */
    public Feedback findById(int id);
    /**
     * get number of page
     * @param pageSize
     * @return 
     */
    public int getNumberOfPages(int pageSize);
    /**
     * get list feedback in page index
     * @param pageSize
     * @param pageIndex
     * @return 
     */
    public ArrayList<Feedback> getAllUserPaging(int pageSize,int pageIndex);
}

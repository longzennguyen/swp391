/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-26    1.0        longzennguyen    First Version<br>
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
     *
     * @return List <code> Feedback </code> object
     * @throws java.lang.Exception
     */
    public List<Feedback> getAllFeedback() throws Exception;

    /**
     * find feedback by id
     *
     * @param id
     * @return <code>feedback</code>
     * @throws java.lang.Exception
     */
    public Feedback findById(int id) throws Exception;

    /**
     * get number of page
     *
     * @param pageSize
     * @return
     * @throws java.lang.Exception
     */
    public int getNumberOfPages(int pageSize) throws Exception;

    /**
     * get list feedback in page index
     *
     * @param pageSize
     * @param pageIndex
     * @return
     * @throws java.lang.Exception
     */
    public ArrayList<Feedback> getAllFeedbackPaging(int pageSize, int pageIndex) throws Exception;
}

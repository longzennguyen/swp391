/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-26    1.0        LongNV           First Version<br>
 */
package dao;

import entity.Blogs;
import java.util.ArrayList;
import java.util.List;

/**
 * Blog's interface
 *
 * @author LongNV
 */
public interface IBlogDAO {

    /**
     * Get all Blog in the database paging
     *
     * @return a list <code>Blogs</code> object
     * @throws java.lang.Exception
     */
    public List<Blogs> getListBlog() throws Exception;
    /**
     * get Blog by id
     * @param id
     * @return 
     * @throws java.lang.Exception 
     */
    public Blogs getBlogByID(int id) throws Exception;
    
    /**
     * Get top 4 Services in the database
     *
     *
     * @return a list <code>Service</code> object
     * @throws Exception
     */
    public ArrayList<Blogs> getTopBlogs() throws Exception;
    /**
     * Get all Services in the database paging
     *
     *
     * @param pageSize
     * @param pageIndex
     * @return a list <code>Service</code> object
     * @throws Exception
     */
    public ArrayList<Blogs> getBlogsPaging(int pageSize, int pageIndex) throws Exception;
    /**
     * Get number of pages in pagination
     *
     *
     * @param pageSize
     * @return
     * @throws java.lang.Exception
     */
    public int getNumberOfPages(int pageSize) throws Exception;
}
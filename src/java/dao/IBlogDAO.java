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
     */
    public List<Blogs> getListBlog();
    /**
     * get Blog by id
     * @param id
     * @return 
     */
    public Blogs getBlogByID(int id);
}
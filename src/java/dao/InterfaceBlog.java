/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Blogs;
import java.util.List;

/**
 * Blog's interface
 *
 * @author longzennguyen
 */
public interface InterfaceBlog {

    /**
     * Get all Blog in the database paging
     *
     * @return a list <code>Blogs</code> object
     */
    public List<Blogs> getListBlog();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DBContext;
import dao.IBlogDAO;
import entity.Blogs;
import java.util.List;

/**
 *
 * @author ROG STRIX
 */
public class BlogDAOImpl extends DBContext implements IBlogDAO{

    @Override
    public List<Blogs> getListBlog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Blogs getBlogByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

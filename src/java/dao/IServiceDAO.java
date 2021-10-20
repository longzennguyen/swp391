/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-05    1.0        DucNT           First Version<br>
 */
package dao;

import entity.Service;
import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public interface IServiceDAO {
    /**
    * Get all Services in the database
    *
    * 
    * @return a list <code>Service</code> object
    * @throws Exception
    */
    public ArrayList<Service> getAllServices() throws Exception;
    /**
    * Get top 4 Services in the database
    *
    * 
    * @return a list <code>Service</code> object
    * @throws Exception
    */
    public ArrayList<Service> getTopServices() throws Exception;
    /**
    * Get all Services in the database paging
    *
    * 
     * @param pageSize
     * @param pageIndex
    * @return a list <code>Service</code> object
    * @throws Exception
    */
    public ArrayList<Service> getServicesPaging(int pageSize, int pageIndex) throws Exception;
    
    /**
    * Get number of pages in pagination  
    *
    * 
    * @param pageSize
    * @return 
    * @throws java.lang.Exception
    */    
    public int getNumberOfPages(int pageSize) throws Exception;
    
    /**
     * Get all Service in the database by word search and paging
     *
     * @param word
     * @param pageSize it is an int number.
     * @param pageIndex it is an int number.
     * @return a list <code>User</code> object
     * @throws Exception
     */
    public ArrayList<Service> getAllServicePagingbyWord(String word, int pageSize, int pageIndex) throws Exception;
    /**
    * Get number of pages in pagination  
    *
    * 
    * @param pageSize
     * @param word
    * @return 
    * @throws java.lang.Exception
    */    
    public int getNumberOfPagesSearch(int pageSize, String word) throws Exception;
    /**
    * Get Service detail by ID in the database
    *
    * 
    * @param id
    * @return a <code>User</code>
    * @throws Exception
    */    
    public Service getServiceDetail(int id) throws Exception;
}

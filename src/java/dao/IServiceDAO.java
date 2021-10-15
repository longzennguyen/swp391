/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
}

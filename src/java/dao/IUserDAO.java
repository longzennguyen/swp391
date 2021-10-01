/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package dao;

import java.util.ArrayList;
import entity.User;

/**
 *
 * This class contains methods to help us manipulate User objects in the
 * database.
 * @author DucNT
 */
public interface IUserDAO {
    /**
    * Get all Users in the database
    *
    * 
    * @return a list <code>User</code> object
    * @throws Exception
    */
    public ArrayList<User> getAllUsers() throws Exception;
    /**
    * Get User detail by ID in the database
    *
    * 
    * @param id
    * @return a <code>User</code>
    * @throws Exception
    */    
    public User getUserDetailImg(int id) throws Exception;
    /**
    * Get User list by name, email, phone in the database
    *
    * 
    * @param word
    * @return a <code>User</code>
    * @throws Exception
    */    
    public ArrayList<User> getUserListByString(String word) throws Exception;
    
    /**
    * Edit User Role and Status 
    *
    * 
    * @param id
    * @param role_id
    * @param status_id
    */    
    public void editUserByID(int id, int role_id, int status_id);
    
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
     * Get all User in the database and paging
     *
     * @param pageSize it is an int number.
     * @param pageIndex it is an int number.
     * @return a list <code>User</code> object
     * @throws Exception
     */
    public ArrayList<User> getAllUserPaging(int pageSize, int pageIndex) throws Exception;
}

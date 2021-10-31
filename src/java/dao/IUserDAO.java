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
import java.util.List;

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
    
    /**
     * Add new User to database
     *
     * @param user_id
     * @param first_name
     * @param last_name
     * @param phone
     * @param email
     * @param address
     * @param dob
     * @param role_id
     * @param status_id
     * @param gender
     * @throws Exception
     */
    public void addNewUser(int user_id, String first_name, String last_name, String phone, String email, String address, String dob,int role_id, int status_id, int gender) throws Exception;
    
    
    /**
     * Get all User in the database by word search and paging
     *
     * @param word
     * @param pageSize it is an int number.
     * @param pageIndex it is an int number.
     * @return a list <code>User</code> object
     * @throws Exception
     */
    public ArrayList<User> getAllUserPagingbyWord(String word, int pageSize, int pageIndex) throws Exception;
    
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
     * Get user by email & password
     * @param uid
     * @param pwd
     * @return 
     * @throws java.lang.Exception 
     */
    public User getUserByEmailAndPwd(String uid,String pwd) throws Exception;
    
    /**
     * check email registed
     * @param email
     * @return 
     * @throws java.lang.Exception 
     */
    public boolean checkUserExisted(String email) throws Exception;
    /**
     * register new account
     * @param user_id
     * @param first_name
     * @param last_name
     * @param phone
     * @param email
     * @param address
     * @param dob
     * @param role_id
     * @param status_id
     * @param gender
     * @param password
     * @throws Exception 
     */
     public void registerAccount(int user_id, String first_name, String last_name, String phone, String email, String address, String dob,int role_id, int status_id, int gender,String password) throws Exception;
     /**
      * update password
      * @param email
      * @param password 
     * @throws java.lang.Exception 
      */
     public void updatePassword(String email,String password) throws Exception;
     public User getByEmail(String email) throws Exception;
     
     
    /**
     * Get all Customer in the database and paging
     *
     * @param pageSize it is an int number.
     * @param pageIndex it is an int number.
     * @return a list <code>User</code> object
     * @throws Exception
     */
    public ArrayList<User> getAllCustomerPaging(int pageSize, int pageIndex) throws Exception;
    
    /**
    * Get number of pages in pagination  
    *
    * 
    * @param pageSize
    * @return 
    * @throws java.lang.Exception
    */    
    public int getNumberOfPageCustomer(int pageSize) throws Exception;
    /**
    * Get Customer detail by ID in the database
    *
    * 
    * @param id
    * @return a <code>User</code>
    * @throws Exception
    */    
    public User getCustomerByID(int id) throws Exception;
    
    /**
    * Get number of pages in pagination when user search  
    *
    * 
    * @param pageSize
    * @return 
    * @throws java.lang.Exception
    */    
    public int getNumberOfPageCustomerSearch(int pageSize, String word) throws Exception;
    
     /**
     * Get all Customer in the database and paging by the word entered
     *
     * @param pageSize it is an int number.
     * @param pageIndex it is an int number.
     * @param word
     * @return a list <code>User</code> object
     * @throws Exception
     */
    public ArrayList<User> getAllCustomerPagingbyWord(int pageSize, int pageIndex, String word) throws Exception;
        public List<User> getUserByRole(int role) throws Exception;
}

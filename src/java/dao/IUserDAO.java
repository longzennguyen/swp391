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
    public User getUserDetail(int id) throws Exception;
}

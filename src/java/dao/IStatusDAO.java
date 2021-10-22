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

import entity.Role;
import java.util.ArrayList;

/**
 *
 * This class contains methods to help us manipulate Status objects in the
 * database.
 * @author DucNT
 */
public interface IStatusDAO {
    /**
    * Get all Users in the database
    *
    * 
    * @return a list <code>User</code> object
    * @throws Exception
    */
    public ArrayList<Role> getAllRoles() throws Exception;
}

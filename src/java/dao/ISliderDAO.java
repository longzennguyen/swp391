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

import entity.Slider;
import java.util.ArrayList;

/**
 * This class contains methods to help us manipulate <code>Slider</code> objects in the
 * database.
 *
 * @author DucNT
 */
public interface ISliderDAO {
    /**
    * Get all <code>Slider</code> in the database
    *
    * 
    * @param pageSize
    * @param pageIndex
    * @return a list <code>User</code> object
    * @throws Exception
    */
    public ArrayList<Slider> getAllSliders(int pageSize, int pageIndex) throws Exception;
    
    /**
     * Get number of pages in pagination <code>Slider</code>
     *
     *
     * @param pageSize
     * @return
     * @throws java.lang.Exception
     */
    public int getNumberOfPages(int pageSize) throws Exception;
    
    /**
     * Get the detail of <code>Slider</code>
     *
     *
     * @param id
     * @return
     * @throws java.lang.Exception
     */
    public Slider getSliderByID(int id) throws Exception;
}

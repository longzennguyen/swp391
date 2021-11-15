/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Slider;
import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
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

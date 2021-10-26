/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author longzennguyen
 */
public class Role {

    /**
     * Role's id
     */
    private int role_id;
    /**
     * Role's name
     */
    private String role_name;

    /**
     * Constructor
     */
    public Role() {
    }
    
    /**
     * Constructor
     *
     * @param role_id
     * @param role_name
     */
    public Role(int role_id, String role_name) {
        this.role_id = role_id;
        this.role_name = role_name;
    }

    /**
     * Get value role id attribute of Login class. <br>
     *
     * @return id it is an int
     */
    public int getRole_id() {
        return role_id;
    }

    /**
     * Set value role to id attribute of Login class
     *
     * @param role_id
     */
    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     * Get value role name attribute of Login class. <br>
     *
     * @return id it is an int
     */
    public String getRole_name() {
        return role_name;
    }

    /**
     * Set value role name attribute of Login class
     *
     * @param role_name
     */
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

}

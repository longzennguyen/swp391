/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package entity;

/**
 *
 * This class represents the Users table in database
 *
 * @author DucNT
 */
public class User {
    /**
     * User's id
    */
    private int user_id;
    /**
     * User's name
    */
    private String name;
    /**
     * User's gender
    */
    private String gender;
    /**
     * User's email
    */
    private String email;
    /**
     * User's phone number
    */
    private String phone;
    /**
     * User's address
    */
    private String address;
    /**
     * User's role
    */
    private String role;
    /**
     * User's status
    */
    private String status;
    /**
     * User's date of birth
    */
    private String dob;
    /**
     * User's avatar
    */
    private String img;
    /**
     * Constructor
    */
    public User() {
    }
    /**
     * Constructor
     *
     * @param user_id
     * @param name it is a <code>java.lang.String</code>
     * @param gender
     * @param email
     * @param phone
     * @param address
     * @param role
     * @param status
     */
    public User(int user_id, String name, String gender, String email, String phone, String address, String role, String status) {
        this.user_id = user_id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.status = status;
    }
    /**
     * Constructor
     *
     * @param user_id
     * @param name it is a <code>java.lang.String</code>
     * @param gender
     * @param email
     * @param phone
     * @param address
     * @param role
     * @param status
     * @param dob
     */    
    public User(int user_id, String name, String gender, String email, String phone, String address, String role, String status, String dob) {
        this.user_id = user_id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.status = status;
        this.dob = dob;
    }
    /**
     * Constructor
     *
     * @param user_id
     * @param name it is a <code>java.lang.String</code>
     * @param gender
     * @param email
     * @param phone
     * @param address
     * @param role
     * @param status
     * @param dob
     * @param img
     */ 
    public User(int user_id, String name, String gender, String email, String phone, String address, String role, String status, String dob, String img) {
        this.user_id = user_id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.status = status;
        this.dob = dob;
        this.img = img;
    }

    /**
     * Get value user id attribute of User class. <br>
     *
     * @return id it is an int
     */
    public int getUser_id() {
        return user_id;
    }
    /**
     * Set value to id attribute of User class
     *
     * @param user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    /**
     * Get value user name attribute of User class. <br>
     *
     * @return name it is a String
     */
    public String getName() {
        return name;
    }
    /**
     * Set value to name attribute of User class
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get value user gender attribute of User class. <br>
     *
     * @return gender it is a String
     */
    public String getGender() {
        return gender;
    }
    /**
     * Set value to gender attribute of User class
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Get value user gender attribute of User class. <br>
     *
     * @return gender it is a String
     */
    public String getEmail() {
        return email;
    }
    /**
     * Set value to email attribute of User class
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Get value user phone attribute of User class. <br>
     *
     * @return gender it is a String
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Set value to phone attribute of User class
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * Get value user address attribute of User class. <br>
     *
     * @return address it is a String
     */
    public String getAddress() {
        return address;
    }
    /**
     * Set value to address attribute of User class
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Get value user role attribute of User class. <br>
     *
     * @return role it is a String
     */
    public String getRole() {
        return role;
    }
    /**
     * Set value to role attribute of User class
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * Get value user status attribute of User class. <br>
     *
     * @return status it is a String
     */
    public String getStatus() {
        return status;
    }
    /**
     * Set value to status attribute of User class
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * Get value user dob attribute of User class. <br>
     *
     * @return dob it is a String
     */
    public String getDob() {
        return dob;
    }
    /**
     * Set value to dob attribute of User class
     *
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    /**
     * Get value user image attribute of User class. <br>
     *
     * @return image it is a String
     */
    public String getImg() {
        return img;
    }
    /**
     * Set value to image attribute of User class
     *
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

               
    
    
    
}

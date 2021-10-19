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
 * @author ROG STRIX
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

    //role id
    private int role_id;

    /**
     * Constructor
     */
    public User() {
    }

    /**
     * Constructor
     *
     * @param user_id
     * @param name
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
     * @param name
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
     * @param name
     * @param gender
     * @param email
     * @param phone
     * @param address
     * @param role
     * @param status
     * @param dob
     * @param image
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
     * Get value role id attribute of Login,Profile class. <br>
     *
     * @return id it is an int
     */
    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    /**
     * Get value role id attribute of Login,Profile class. <br>
     *
     * @return id it is an int
     */
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * Get value role id attribute of Login,Profile class. <br>
     *
     * @return id it is an int
     */
    public String getName() {
        return name;
    }

    /**
     * Set value name attribute of Login,Profile  class
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get value gender attribute of Login,Profile class. <br>
     *
     * @return gender is string
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set value gender attribute of Login,Profile class
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Get value email attribute of Login,Profile class. <br>
     *
     * @return email is a string
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set value email attribute of Login,Profile class
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get value phone attribute of Login,Profile class. <br>
     *
     * @return phone is string
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set value phone attribute of Login,Profile class
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get value address attribute of Login,Profile class. <br>
     *
     * @return address is a string
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set value address attribute of Login,Profile class
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get value role attribute of Login,Profile class. <br>
     *
     * @return role is string
     */
    public String getRole() {
        return role;
    }

    /**
     * Set value role attribute of Login,Profile class
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Get value status attribute of Login,Profile class. <br>
     *
     * @return status is stirng
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set value status attribute of Login,Profile class
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get value dob attribute of Login,Profile class. <br>
     *
     * @return dob is date convert to string
     */
    public String getDob() {
        return dob;
    }

    /**
     * Set value dob attribute of Login,Profile class
     *
     * @param dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Get value img attribute of Login,Profile class. <br>
     *
     * @return img is a string
     */
    public String getImg() {
        return img;
    }

    /**
     * Set value img attribute of Login,Profile class
     *
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

}

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
    /**
     * Constructor
    */
    public User() {
    }
    
    
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

    

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

               
    
    
    
}

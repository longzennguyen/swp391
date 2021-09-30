/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ROG STRIX
 */
public class User {
    private int uid;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private int role_id;
    private boolean status;

    public User() {
    }

    public User(int uid, String name, String gender, String email, String phone, String address, int role_id, boolean status) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role_id = role_id;
        this.status = status;
    }

    

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}

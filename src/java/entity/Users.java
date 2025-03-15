/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Users {
    private int user_id;
    private String full_name;
    private String email;
    private String password_hash;
    private String phone;
    private String address;
    private int role_id;
    private Date created_at;

    public Users() {
    }

    public Users(int user_id, String full_name, String email, String password_hash, String phone, String address, int role_id, Date created_at) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.email = email;
        this.password_hash = password_hash;
        this.phone = phone;
        this.address = address;
        this.role_id = role_id;
        this.created_at = created_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
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

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Users{" + "user_id=" + user_id + ", full_name=" + full_name + ", email=" + email + ", password_hash=" + password_hash + ", phone=" + phone + ", address=" + address + ", role_id=" + role_id + ", created_at=" + created_at + '}';
    }
    
    
    
}

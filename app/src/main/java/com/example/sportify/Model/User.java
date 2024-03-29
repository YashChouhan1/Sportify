package com.example.sportify.Model;

public class User {

    private int u_id;
    private String u_name;
    private String u_email;
    private String u_password;
    private String u_phoneNo;

    public User(int u_id, String u_name, String u_email, String u_password, String u_phoneNo) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_email = u_email;
        this.u_password = u_password;
        this.u_phoneNo = u_phoneNo;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_phoneNo() {
        return u_phoneNo;
    }

    public void setU_phoneNo(String u_phoneNo) {
        this.u_phoneNo = u_phoneNo;
    }
}

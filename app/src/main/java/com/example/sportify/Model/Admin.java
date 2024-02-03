package com.example.sportify.Model;

public class Admin {

    private int ad_id;
    private String ad_name;
    private String ad_email;
    private String ad_password;
    private String ad_phoneNo;

    public Admin(int ad_id, String ad_name, String ad_email, String ad_password, String ad_phoneNo) {
        this.ad_id = ad_id;
        this.ad_name = ad_name;
        this.ad_email = ad_email;
        this.ad_password = ad_password;
        this.ad_phoneNo = ad_phoneNo;
    }

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public String getAd_email() {
        return ad_email;
    }

    public void setAd_email(String ad_email) {
        this.ad_email = ad_email;
    }

    public String getAd_password() {
        return ad_password;
    }

    public void setAd_password(String ad_password) {
        this.ad_password = ad_password;
    }

    public String getAd_phoneNo() {
        return ad_phoneNo;
    }

    public void setAd_phoneNo(String ad_phoneNo) {
        this.ad_phoneNo = ad_phoneNo;
    }
}

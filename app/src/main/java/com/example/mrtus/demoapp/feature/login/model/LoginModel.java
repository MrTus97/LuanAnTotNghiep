package com.example.mrtus.demoapp.feature.login.model;

import com.example.mrtus.demoapp.common.model.Customer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel {

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("customer")
    @Expose
    private Customer customer;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}



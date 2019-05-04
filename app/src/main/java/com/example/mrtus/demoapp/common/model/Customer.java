package com.example.mrtus.demoapp.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("star")
    @Expose
    private String star;
    @SerializedName("is_block")
    @Expose
    private String isBlock;
    @SerializedName("is_delete")
    @Expose
    private String isDelete;
    @SerializedName("count_reserve")
    @Expose
    private String countReserve;
    @SerializedName("count_cancel")
    @Expose
    private String countCancel;
    @SerializedName("verify")
    @Expose
    private String verify;
    @SerializedName("remember_token")
    @Expose
    private String rememberToken;
    @SerializedName("description")
    @Expose
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getIsBlock() {
        return isBlock;
    }

    public void setIsBlock(String isBlock) {
        this.isBlock = isBlock;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getCountReserve() {
        return countReserve;
    }

    public void setCountReserve(String countReserve) {
        this.countReserve = countReserve;
    }

    public String getCountCancel() {
        return countCancel;
    }

    public void setCountCancel(String countCancel) {
        this.countCancel = countCancel;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

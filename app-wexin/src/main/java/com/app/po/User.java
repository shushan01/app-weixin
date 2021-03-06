package com.app.po;

import com.app.base.BaseObject;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Describle:
 * @Author: yangsongqing
 * @Date: 2017/11/28 11:44
 */
@Table(name = "t_user")
public class User extends BaseObject {
    private static final long serialVersionUID = 166202443522768309L;
    @Column(name = "userAddress")
    private String userAddress;
    @Column(name = "chainId")
    private String chainId;
    @Column(name = "name")
    private String name;
    @Column(name = "departmentId")
    private String departmentId;
    @Column(name = "account")
    private String account;
    @Column(name = "ownerAddr")
    private String ownerAddr;
    @Column(name = "userId")
    private int userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getOwnerAddr() {
        return ownerAddr;
    }

    public void setOwnerAddr(String ownerAddr) {
        this.ownerAddr = ownerAddr;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

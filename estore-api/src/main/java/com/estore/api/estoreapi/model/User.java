package com.estore.api.estoreapi.model;

import java.util.logging.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a user entity
 * 
 * @author Brian Lin
 */
public class User {
    private static final Logger LOG = Logger.getLogger(Product.class.getName());

    static final String STRING_FORMAT = "User [id=%d, username=%s]";

    @JsonProperty("id") private int id;
    @JsonProperty("username") private String userName;

    public User(@JsonProperty("id") int id, @JsonProperty("username") String userName) {
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return String.format(STRING_FORMAT, id, userName);
    }
}
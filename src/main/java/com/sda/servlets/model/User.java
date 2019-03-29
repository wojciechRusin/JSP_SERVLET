package com.sda.servlets.model;

import java.time.Instant;
import java.util.Objects;

public class User {

    private static int ID_COUNTER = 0;

    private String login;
    private String password;
    private Instant joinDate;
    private int id;

    public User(String login, String password, Instant joinDate) {
        this.login = login;
        this.password = password;
        this.joinDate = joinDate;
        this.id = ID_COUNTER;
        ID_COUNTER++;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Instant getJoinDate() {
        return joinDate;
    }

    public int getId() {
        return id;
    }

    public User() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this == null || getClass() != obj.getClass()) return false;
        User user = (User)obj;
        return id == user.id &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(joinDate, user.joinDate);

    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, joinDate, id);
    }

    public String createSecretToken(){
        return Integer.toString(this.hashCode());
    }
}

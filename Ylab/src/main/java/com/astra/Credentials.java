package com.astra;

public class Credentials {
    private String login;
    private String password;
    private User user;

    public Credentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser(){
        return user;
    }
    public boolean verifyPassword(String password){
        return password.equals(this.password);
    }


}

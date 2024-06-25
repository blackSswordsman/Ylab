package com.astra;



public  class User {
    private String fullName;
    private Credentials credentials;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public User(String fullName, Credentials credentials) {
        this.fullName = fullName;
        this.credentials = credentials;
    }

}

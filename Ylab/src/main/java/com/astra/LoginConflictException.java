package com.astra;

public class LoginConflictException extends Exception{
    public LoginConflictException(String login) {
        super("The login "+ login + " you tried to input already exists, please enter a new one");
    }
}

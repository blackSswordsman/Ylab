package com.astra;

public class CurrentUserHolder {
    private static ThreadLocal<User> currentUser;

    public static User getCurrentUser(){
        return currentUser.get();
    }
    public static void setCurrentUser(User user){
        currentUser.set(user);
    }

}

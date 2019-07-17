package com.example.security.SignUp;

public class ModelUser {

    String UserID;
    String Username;
    String Email;
    String Password;
    String DateActivity;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDateActivity() {
        return DateActivity;
    }

    public void setDateActivity(String dateActivity) {
        DateActivity = dateActivity;
    }

    @Override
    public String toString() {
        return "ModelUser{" +
                "UserID='" + UserID + '\'' +
                ", Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", DateActivity='" + DateActivity + '\'' +
                '}';
    }

}

package com.example.mvplogin;

public class LoginPresenter {

    private LoginInterface mLoginInterface;

    public LoginPresenter(LoginInterface mLoginInterface) {
        this.mLoginInterface = mLoginInterface;
    }

    public void login(User user) {
        if (user.isValidEmail() && user.isValidPassword()) {
            mLoginInterface.loginSucces();
        } else {
            mLoginInterface.loginError();
        }
    }

}

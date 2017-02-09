package com.terry0022.mvpexample.interfaces;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:39.
 */
public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();

}

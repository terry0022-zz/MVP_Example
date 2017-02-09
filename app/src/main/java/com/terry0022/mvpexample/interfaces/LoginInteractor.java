package com.terry0022.mvpexample.interfaces;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:46.
 */
public interface LoginInteractor {

    interface OnLoginFinishedListener {

        void onUsernameError();

        void onPasswordError();

        void onSuccess();

    }

    void login(final String username, final String password, final OnLoginFinishedListener listener);

}

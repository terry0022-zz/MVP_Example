package com.terry0022.mvpexample.interfaces;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:40.
 */
public interface LoginPresenter {

    void validateCredentials(final String username, final String password);

    void onDestroy();

}

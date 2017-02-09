package com.terry0022.mvpexample.presenters;

import com.terry0022.mvpexample.interactors.LoginInteractorImpl;
import com.terry0022.mvpexample.interfaces.LoginInteractor;
import com.terry0022.mvpexample.interfaces.LoginPresenter;
import com.terry0022.mvpexample.interfaces.LoginView;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:41.
 */
public class LoginPresenterImpl implements LoginPresenter,LoginInteractor.OnLoginFinishedListener {

    private LoginView view;
    private final LoginInteractor interactor;

    public LoginPresenterImpl(final LoginView view) {
        this.view = view;
        this.interactor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(final String username, final String password) {
        if (view != null) {
            view.showProgress();
        }

        interactor.login(username, password, this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void onUsernameError() {
        if (view != null) {
            view.setUsernameError();
            view.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (view != null) {
            view.setPasswordError();
            view.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (view != null) {
            view.navigateToHome();
        }
    }
}

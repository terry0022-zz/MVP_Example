package com.terry0022.mvpexample.interactors;

import android.os.Handler;
import android.text.TextUtils;

import com.terry0022.mvpexample.interfaces.LoginInteractor;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:46.
 */
public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {

                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    return;
                }

                listener.onSuccess();

            }
        }, 2000);

    }

}

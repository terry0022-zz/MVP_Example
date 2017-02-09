package com.terry0022.mvpexample.interfaces;

import java.util.List;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:54.
 */
public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(final List<String> items);

    void showMessage(final String message);

}

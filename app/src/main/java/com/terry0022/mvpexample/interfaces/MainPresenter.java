package com.terry0022.mvpexample.interfaces;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:54.
 */
public interface MainPresenter {

    void onResume();

    void onItemClicked(final int position);

    void onDestroy();

}

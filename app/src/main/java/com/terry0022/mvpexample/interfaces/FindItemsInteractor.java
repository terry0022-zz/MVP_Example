package com.terry0022.mvpexample.interfaces;

import java.util.List;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:59.
 */
public interface FindItemsInteractor {

    interface OnFinishedListener {

        void onFinished(final List<String> items);

    }

    void findItems(final OnFinishedListener listener);

}

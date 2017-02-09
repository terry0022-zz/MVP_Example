package com.terry0022.mvpexample.interactors;

import android.os.Handler;

import com.terry0022.mvpexample.interfaces.FindItemsInteractor;

import java.util.Arrays;
import java.util.List;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:58.
 */
public class FindItemsInteractorImpl implements FindItemsInteractor{

    @Override
    public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);

    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10"
        );
    }
}

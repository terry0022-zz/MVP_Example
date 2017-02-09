package com.terry0022.mvpexample.presenters;

import com.terry0022.mvpexample.interfaces.FindItemsInteractor;
import com.terry0022.mvpexample.interfaces.MainPresenter;
import com.terry0022.mvpexample.interfaces.MainView;

import java.util.List;

/**
 * MVP Example
 * Created by terry0022 on 08/02/17 - 22:54.
 */
public class MainPresenterImpl implements MainPresenter, FindItemsInteractor.OnFinishedListener {

    private MainView view;
    private final FindItemsInteractor interactor;

    public MainPresenterImpl(final MainView view, final FindItemsInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void onResume() {
        if (view != null) {
            view.showProgress();
        }

        interactor.findItems(this);
    }

    @Override
    public void onItemClicked(final int position) {
        if (view != null) {
            view.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void onFinished(final List<String> items) {
        if (view != null) {
            view.setItems(items);
            view.hideProgress();
        }
    }

    public MainView getMainView() {
        return view;
    }

}

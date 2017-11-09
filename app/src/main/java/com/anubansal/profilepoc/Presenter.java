package com.anubansal.profilepoc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.anubansal.profilepoc.ViewModel.UIModel;

/**
 * Created by anubansal on 09/11/17.
 */

public class Presenter implements IPresenterContract {

    private DataFetcher dataFetcher;
    private UIModel uiModel;
    private UIBuilder uiBuilder;
    private Context context;
    private ViewGroup parentView;
    private View childView;

    /**
     * Task 1 : Initialises DataFetcher and gets the data in a specific format i.e., UIModel (analogous to Kairos Widget)
     * Task 2 : Passes the UIModel to UIBuilder and gets back a view i.e., rootView
     * Task 3 : The rootView is added to the parentView passed
     */
    public Presenter(Context context, ViewGroup parentView) {
        this.context = context;
        this.parentView = parentView;
        dataFetcher = new DataFetcher(context, this);
        uiModel = dataFetcher.getUIModel();
//        List<View> views = dataFetcher.getViews();
        uiBuilder = new UIBuilder();
        childView = uiBuilder.getView(context, uiModel);
        parentView.addView(childView);
    }

    @Override
    public void onDataUpdate(UIModel uiModel) {
        View rootView = uiBuilder.getView(context, uiModel);
        parentView.removeAllViews();
        parentView.addView(rootView);
    }
}

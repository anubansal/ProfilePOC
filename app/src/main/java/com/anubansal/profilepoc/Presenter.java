package com.anubansal.profilepoc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.anubansal.profilepoc.ViewModel.UIModel;

import java.util.List;

/**
 * Created by anubansal on 09/11/17.
 */

public class Presenter {

    private DataFetcher dataFetcher;
    private UIModel uiModel;
    private UIBuilder uiBuilder;
    private Context context;

    /**
     * Task 1 : Initialises DataFetcher and gets the data in a specific format i.e., UIModel (analogous to Kairos Widget)
     * Task 2 : Passes the UIModel to UIBuilder and gets back a view i.e., rootView
     * Task 3 : The rootView is added to the parentView passed
     */
    public Presenter(Context context, ViewGroup parentView) {
        this.context = context;
        dataFetcher = new DataFetcher(context);
        uiModel = dataFetcher.getUIModel();
//        List<View> views = dataFetcher.getViews();
        uiBuilder = new UIBuilder();
        View rootView = uiBuilder.getView(context, uiModel);
        parentView.addView(rootView);
    }
}

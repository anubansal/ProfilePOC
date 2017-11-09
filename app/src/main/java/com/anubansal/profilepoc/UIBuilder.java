package com.anubansal.profilepoc;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.anubansal.profilepoc.LocalFragment.TestFragment;
import com.anubansal.profilepoc.UI.Widget;
import com.anubansal.profilepoc.ViewModel.Template;
import com.anubansal.profilepoc.ViewModel.UIModel;

/**
 * Created by anubansal on 09/11/17.
 */

public class UIBuilder {

    private ScrollView scrollView;
    private LinearLayout baseView;

    public View getView(Context context, UIModel uiModel) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        scrollView = (ScrollView) layoutInflater.inflate(R.layout.uibuilder_base, null);
        baseView = scrollView.findViewById(R.id.base);

        for (Template template : uiModel.getTemplates()) {
//            TODO : a factory that can return specific views
            Log.d("UIBuilderTest", " template type : " + template.getType());
            if (template.getType().equalsIgnoreCase("Timeline")) {
                FragmentManager fragMan = ((Activity)context).getFragmentManager();
                FragmentTransaction fragTransaction = fragMan.beginTransaction();
                Fragment testFragment = new TestFragment();
                fragTransaction.add(baseView.getId(), testFragment);
                fragTransaction.commit();
            } else {
                Widget widget = new Widget(context, template);
                View view = widget.getView();
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                view.setLayoutParams(params);
                baseView.addView(view);
            }
        }



//        TextView tv = new TextView(context);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        tv.setText("TextView added");
//        tv.setTextSize((float) 20);
//        tv.setPadding(20, 50, 20, 50);
//        tv.setLayoutParams(params);
//        baseView.addView(tv);
//
//        TextView tv1 = new TextView(context);
//        tv1.setText("TextView1 added");
//        tv1.setTextSize((float) 20);
//        tv1.setPadding(20, 50, 20, 50);
//        tv1.setLayoutParams(params);
//        baseView.addView(tv1);
//
//        TextView tv2 = new TextView(context);
//        tv2.setText("TextView2 added");
//        tv2.setTextSize((float) 20);
//        tv2.setPadding(20, 50, 20, 50);
//        tv2.setLayoutParams(params);
//        baseView.addView(tv2);
        return scrollView;
    }
}

package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.view.View;
import android.widget.TextView;

import com.facebook.common.internal.Sets;

import java.util.Map;
import java.util.Set;

public class LabelWidgetConfigurator implements IWidgetConfigurator {
    @Override
    public Set<String> validChildTypes() {
        return null;
    }

    @Override
    public Set<String> requiredChildTypes() {
        return null;
    }

    @Override
    public Set<String> requiredViewConfigs() {
        return Sets.newHashSet("text");
    }

    @Override
    public int resId() {
        return -1;
    }

    @Override
    public void setConfiguration(Map<String, Object> viewConfig, View view) {
        TextView textView = (TextView) view;
        textView.setText((String)viewConfig.get("text"));
        if(viewConfig.containsKey("textSize")) {
            double size = (double)viewConfig.get("textSize");
            textView.setTextSize((float)size);
        }
    }

    @Override
    public void onClick(Map<String, Object> viewConfig, View view) {

    }

}

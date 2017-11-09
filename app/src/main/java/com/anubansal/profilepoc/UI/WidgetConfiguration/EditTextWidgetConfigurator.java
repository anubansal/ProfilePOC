package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.view.View;
import android.widget.EditText;

import com.facebook.common.internal.Sets;

import java.util.Map;
import java.util.Set;

public class EditTextWidgetConfigurator implements IWidgetConfigurator {
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
        return Sets.newHashSet("hintText");
    }

    @Override
    public int resId() {
        return -1;
    }

    @Override
    public void setConfiguration(Map<String, Object> viewConfig, View view) {
        EditText editText = (EditText) view;
        editText.setHint((String)viewConfig.get("hintText"));
    }

    @Override
    public void onClick(Map<String, Object> viewConfig, View view) {

    }


}

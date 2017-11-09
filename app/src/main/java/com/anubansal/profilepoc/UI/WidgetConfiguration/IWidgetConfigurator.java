package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.view.View;

import java.util.Map;
import java.util.Set;


public interface IWidgetConfigurator {
    Set<String> validChildTypes();
    Set<String> requiredChildTypes();
    Set<String> requiredViewConfigs();
    int resId(); //Return -1 if it is already a part of container.
    void setConfiguration(Map<String, Object> viewConfig, View view);
    void onClick(Map<String, Object> viewConfig, View view);
}

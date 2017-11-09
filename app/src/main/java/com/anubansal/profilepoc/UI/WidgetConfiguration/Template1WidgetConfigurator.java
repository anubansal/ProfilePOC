package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.view.View;

import com.anubansal.profilepoc.R;
import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants;
import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants.SUB_TEMPLATES.TAGS;
import com.facebook.common.internal.Sets;

import java.util.Map;
import java.util.Set;

/**
 * Created by arpitratan on 01/03/17.
 */

public class Template1WidgetConfigurator implements IWidgetConfigurator {

    @Override
    public Set<String> validChildTypes() {
        return Sets.newHashSet(KairosConstants.SUB_TEMPLATES.TAGS.IMAGE_VIEW, TAGS.TITLE, TAGS.SUB_TITLE, TAGS.BUTTON);
    }

    @Override
    public Set<String> requiredChildTypes() {
        return Sets.newHashSet(TAGS.IMAGE_VIEW, TAGS.TITLE, TAGS.SUB_TITLE, TAGS.BUTTON);
    }

    @Override
    public Set<String> requiredViewConfigs() {
        return Sets.newHashSet("textStyle", "padding");
    }

    @Override
    public int resId() {
        return R.layout.kairos_type1_template;
    }

    @Override
    public void setConfiguration(Map<String, Object> viewConfig, View view) {
    }

    @Override
    public void onClick(Map<String, Object> viewConfig, View view) {

    }

}

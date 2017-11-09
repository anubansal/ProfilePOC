package com.anubansal.profilepoc.UI.WidgetConfiguration;

import android.view.View;

import com.anubansal.profilepoc.R;
import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants;
import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants.SUB_TEMPLATES.TAGS;
import com.anubansal.profilepoc.ViewModel.Template;
import com.facebook.common.internal.Sets;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Created by suhasmannar on 02/08/17.
 */

public class TemplateYesNoQuestionWidgetConfigurator implements IWidgetConfigurator {
    @Override
    public Set<String> validChildTypes() {
        return Sets.newHashSet(KairosConstants.SUB_TEMPLATES.TAGS.TITLE, TAGS.NO_BUTTON,TAGS.YES_BUTTON);
    }

    @Override
    public Set<String> requiredChildTypes() {
        return Sets.newHashSet(TAGS.TITLE);
    }

    @Override
    public Set<String> requiredViewConfigs() {
        return Sets.newHashSet("textStyle", "padding");
    }

    @Override
    public int resId() {
        return R.layout.kairos_yes_no_question_template;
    }

    @Override
    public void setConfiguration(Map<String, Object> viewConfig, View view) {
        ArrayList<Template> templateArrayList = ((ArrayList)viewConfig.get("subTemplates"));
        for (Template template: templateArrayList) {
            if(template.getTag().equals(TAGS.NO_BUTTON)) {
                (view.findViewWithTag(TAGS.NO_BUTTON)).setVisibility(View.VISIBLE);
            } else if(template.getTag().equals(TAGS.YES_BUTTON)) {
                (view.findViewWithTag(TAGS.YES_BUTTON)).setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onClick(Map<String, Object> viewConfig, View view) {

    }

}

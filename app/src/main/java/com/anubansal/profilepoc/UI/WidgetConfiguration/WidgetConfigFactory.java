package com.anubansal.profilepoc.UI.WidgetConfiguration;

import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants;

/**
 * Created by anubansal on 10/11/17.
 */

public class WidgetConfigFactory {

    public IWidgetConfigurator createConfiguration(String type) {

        if (type.equals(KairosConstants.TEMPLATE.TEMPLATE1)) {
            return new Template1WidgetConfigurator();
        }
        else if(type.equals(KairosConstants.SUB_TEMPLATES.TYPES.LABEL)) {
            return new LabelWidgetConfigurator();
        }
        else if(type.equals(KairosConstants.SUB_TEMPLATES.TYPES.IMAGE)) {
            return new ImageWidgetConfigurator();
        }
        else if(type.equals(KairosConstants.SUB_TEMPLATES.TYPES.BUTTON)) {
            return new ButtonWidgetConfigurator();
        }
        else if(type.equals(KairosConstants.SUB_TEMPLATES.TYPES.EDIT_TEXT)) {
            return new EditTextWidgetConfigurator();
        } else if(type.equalsIgnoreCase(KairosConstants.TEMPLATE.TEMPLATE_YES_NO_QUESTIONS)) {
            return new TemplateYesNoQuestionWidgetConfigurator();
        }

        return null;

    }
}

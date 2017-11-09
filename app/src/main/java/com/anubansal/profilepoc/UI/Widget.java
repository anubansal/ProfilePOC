package com.anubansal.profilepoc.UI;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.anubansal.profilepoc.UI.WidgetConfiguration.IWidgetConfigurator;
import com.anubansal.profilepoc.UI.WidgetConfiguration.WidgetConfigFactory;
import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants;
import com.anubansal.profilepoc.ViewModel.Template;

import java.util.List;
import java.util.Map;

/**
 * Created by anubansal on 09/11/17.
 * One Widget is analogous to One Template.
 */

public class Widget implements IWidget {

    private static final String TAG = Widget.class.getSimpleName();

    private LayoutInflater layoutInflater;
    private Context context;
    private Template mTemplate;
    private View baseView;
    private View mainView;
    private WidgetConfigFactory configFactory;

    public Widget(Context context, Template template) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.mTemplate = template;
        configFactory = new WidgetConfigFactory();
    }

    @Override
    public View getView() {

        final IWidgetConfigurator config = configFactory.createConfiguration(mTemplate.getType());
        baseView = layoutInflater.inflate(config.resId(), null);

        final Map<String, Object> viewConfigWithAdditionalData = addMetadata(mTemplate.getViewConfig(), mTemplate.getSubTemplates());
        config.setConfiguration(viewConfigWithAdditionalData, baseView);
        if (setUpView(baseView, config, false)) {
            return baseView;
        }

        return null;
    }

    private boolean setUpView(final View parentView, IWidgetConfigurator configurator, boolean isOnClick) {

//        TODO : add the clickListener part once view rendering works
//        if(isOnClick)
//            parentView.setOnClickListener(getClickListener(mTemplate.getAction(), configurator, mTemplate.getViewConfig(), mTemplate.getTag()));

        for (Template childTemplate : mTemplate.getSubTemplates()) {
            //Set Listeners
            View childView = parentView.findViewWithTag(childTemplate.getTag());
            if (childView == null) {
                Log.d(TAG, "Unable to render view as parent container doesnt contain tag");
                return false;
            }

            IWidgetConfigurator childViewConfigurator = configFactory.createConfiguration(childTemplate.getType());
            String actionChildTemplateTag = mTemplate.getTag() + " : " + childTemplate.getTag();

//            View.OnClickListener childClickListener = getClickListener(childTemplate.getAction(), childViewConfigurator, childTemplate.getViewConfig(), actionChildTemplateTag);
//            if (null != childClickListener)
//                childView.setOnClickListener(childClickListener);

            //Set Properties
            childViewConfigurator.setConfiguration(addMetadata(childTemplate.getViewConfig(), childTemplate.getSubTemplates()), childView);

        }
        return true;
    }

    protected Map<String, Object> addMetadata(Map<String, Object> hMAp, List<Template> subTemplates) {
        if (subTemplates != null) {
            hMAp.put(KairosConstants.PARAMS.SUB_TEMPLATES, subTemplates);
        }
        return hMAp;
    }
}

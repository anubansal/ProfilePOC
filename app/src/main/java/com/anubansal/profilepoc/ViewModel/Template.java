package com.anubansal.profilepoc.ViewModel;

import com.anubansal.profilepoc.UtilsAndConstants.KairosConstants;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by anubansal on 09/11/17.
 */

public class Template {

    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("viewConfig")
    @Expose
    private JsonElement viewConfig;
    @SerializedName("subTemplates")
    @Expose
    private List<Template> subTemplates = new ArrayList<>();

    private Map<String, Object> viewConfigMap;

    private Template(Builder builder) {
        this.tag = builder.tag;
        this.type = builder.type;
        this.action = builder.action;
        this.viewConfig = builder.viewConfig;
        this.subTemplates = builder.subTemplates;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, Object> getViewConfig() {
        if(null == viewConfigMap) {
            if(null != viewConfig)
                viewConfigMap = new Gson().fromJson(viewConfig, Map.class);
            else
                viewConfigMap = new HashMap<>();
        }
        return viewConfigMap;
    }

    public String getViewConfigJson() {
        return (viewConfig == null) ? "" : viewConfig.toString();
    }

    public void setViewConfig(Map<String, Object> viewConfig) {
        this.viewConfigMap = viewConfig;
    }

    public List<Template> getSubTemplates() {
        return subTemplates;
    }

    public void setSubTemplates(List<Template> subTemplates) {
        this.subTemplates = subTemplates;
    }

    public static class Builder {

        private String tag;

        private String type;

        private String action;

        private JsonElement viewConfig;

        private List<Template> subTemplates;


        private Builder getSelfObject() {
            return this;
        }

        public Template build() {
            return new Template(this);
        }

        public Builder setTag(String tag) {
            this.tag = tag;
            return getSelfObject();
        }

        public Builder setType(String type) {
            this.type = type;
            if(type.equals(KairosConstants.TEMPLATE.TEMPLATE1)) {
                List<Template> subTemplates = new ArrayList<>();
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.IMAGE_VIEW).setType(KairosConstants.SUB_TEMPLATES.TYPES.IMAGE).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SUB_TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.BUTTON).setType(KairosConstants.SUB_TEMPLATES.TYPES.BUTTON).build());
                setSubTemplates(subTemplates);
            } else if (type.equals(KairosConstants.TEMPLATE.TEMPLATE_SHORT_GREETING)) {
                List<Template> subTemplates = new ArrayList<>();
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SHORT_GREETING_IMAGE).setType(KairosConstants.SUB_TEMPLATES.TYPES.IMAGE).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SHORT_GREETING_TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SHORT_GREETING_PROMPT).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                setSubTemplates(subTemplates);
            } else if (type.equals(KairosConstants.TEMPLATE.TEMPLATE3)) {
                List<Template> subTemplates = new ArrayList<>();
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.IMAGE_VIEW).setType(KairosConstants.SUB_TEMPLATES.TYPES.IMAGE).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                setSubTemplates(subTemplates);
            } else if (type.equals(KairosConstants.TEMPLATE.TEMPLATE_GREETING_CHOOSER) || type.equals(KairosConstants.TEMPLATE.TEMPLATE_GREETING_CHOOSER_V2)) {
                List<Template> subTemplates = new ArrayList<>();
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.GCT_IMAGE_VIEW).setType(KairosConstants.SUB_TEMPLATES.TYPES.IMAGE).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.GCT_TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.GCT_SUBTITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.GCT_ACTION_BUTTON).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.GCT_CANCEL_BUTTON).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.GCT_HORIZONTAL_SCROLL_VIEW).setType(KairosConstants.SUB_TEMPLATES.TYPES.HORIZONTAL_SCROLL_VIEW).build());
                setSubTemplates(subTemplates);
            } else if (type.equals(KairosConstants.TEMPLATE.TEMPLATE_EXPANDABLE_GREETING)) {
                List<Template> subTemplates = new ArrayList<>();
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.EG_IMAGE_VIEW).setType(KairosConstants.SUB_TEMPLATES.TYPES.IMAGE).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.EG_TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.EG_SUB_TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.EG_COLLAPSED_ACTION_BUTTON).setType(KairosConstants.SUB_TEMPLATES.TYPES.BUTTON).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.EG_EXPANDED_ACTION_BUTTON).setType(KairosConstants.SUB_TEMPLATES.TYPES.BUTTON).build());
                setSubTemplates(subTemplates);
            } else if (type.equals(KairosConstants.TEMPLATE.TEMPLATE_STICKER_POPUP)) {
                List<Template> subTemplates = new ArrayList<>();
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SPT_TITLE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SPT_SUB_TITILE).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SPT_EDIT_TEXT).setType(KairosConstants.SUB_TEMPLATES.TYPES.EDIT_TEXT).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SPT_ACTION_BUTTON).setType(KairosConstants.SUB_TEMPLATES.TYPES.LABEL).build());
                subTemplates.add(new Template.Builder().setTag(KairosConstants.SUB_TEMPLATES.TAGS.SPT_HORIZONTAL_SCROLL_VIEW).setType(KairosConstants.SUB_TEMPLATES.TYPES.HORIZONTAL_SCROLL_VIEW).build());

                setSubTemplates(subTemplates);
            }
            return getSelfObject();
        }

        public Builder setAction(String action) {
            this.action = action;
            return getSelfObject();
        }

        public Builder setViewConfig(JsonElement viewConfig) {
            this.viewConfig = viewConfig;
            return getSelfObject();
        }

        public Builder setSubTemplates(List<Template> subTemplates) {
            this.subTemplates = subTemplates;
            return getSelfObject();
        }

    }
}

package com.anubansal.profilepoc.ViewModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by anubansal on 09/11/17.
 */

public class UIModel {

    @SerializedName("identifier")
    @Expose
    private String id;

    @SerializedName("templates")
    @Expose
    private List<Template> templates = null;

    @SerializedName("source")
    @Expose(serialize = false, deserialize = false)
    private String source;

    public List<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }
}

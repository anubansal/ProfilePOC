package com.anubansal.profilepoc.DataSource;

import org.json.JSONObject;

/**
 * Created by anubansal on 10/11/17.
 */

public interface DataObserver {

    void onDataModified(JSONObject data);
}

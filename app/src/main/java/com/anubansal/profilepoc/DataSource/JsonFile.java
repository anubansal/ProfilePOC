package com.anubansal.profilepoc.DataSource;

import android.content.Context;
import android.util.Log;

import com.anubansal.profilepoc.UtilsAndConstants.Utils;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by anubansal on 09/11/17.
 */

public class JsonFile implements ISource {

    private Context context;

    String json = "{\"identifier\": \"52921664\",\"templates\": [{\"subTemplates\": [{\"tag\": \"imageview\",\"viewConfig\": {\"style\": \"circle\",\"url\": \"hike://datasource/contact/fetchdp?data={}\"},\"type\": \"image\"},{\"tag\": \"title\",\"viewConfig\": {\"style\": \"square\",\"text\": \"Irfanmoh\"},\"type\": \"label\"},{\"tag\": \"subtitle\",\"viewConfig\": {\"style\": \"square\",\"text\": \"added you as a friend\"},\"type\": \"label\"},{\"action\": \"hike://contact/acceptfriend?data={}\",\"tag\": \"btn\",\"viewConfig\": {\"style\": \"roundedCircle\",\"text\": \"ACCEPT\",\"clickedText\": \"ACCEPTED\"},\"type\": \"button\" } ],\"tag\": \"header\",\"viewConfig\": {\"padding\": 10,\"textStyle\": \"bold\" },\"type\": \"template1\" }, {\"type\": \"Timeline\"},{\"subTemplates\": [{\"tag\": \"imageview\",\"viewConfig\": {\"style\": \"circle\",\"url\": \"hike://datasource/contact/fetchdp?data={}\"},\"type\": \"image\" },{\"tag\": \"title\",\"viewConfig\": {\"style\": \"square\",\"text\": \"Irfanmoh\" },\"type\": \"label\" },{\"tag\": \"subtitle\",\"viewConfig\": {\"style\": \"square\",\"text\": \"added you as a friend\" },\"type\": \"label\" },{\"action\": \"hike://contact/acceptfriend?data={}\",\"tag\": \"btn\",\"viewConfig\": {\"style\": \"roundedCircle\",\"text\": \"ACCEPT\",\"clickedText\": \"ACCEPTED\" },\"type\": \"button\" }],\"tag\": \"header2\",\"viewConfig\": {\"padding\": 10,\"textStyle\": \"bold\" },\"type\": \"template1\" }],\"source\": \"server\" }";

    public JsonFile(Context context) {
        this.context = context;
    }

    @Override
    public JSONObject fetchData() {
        Utils utils = new Utils();
        try {
//            TODO : check the reason for FileNotFound exception
            String jsonString = utils.loadJSONFromAsset(context, "data_json.json");
            String json1 = "{\"name\":\"john\",\"age\":22,\"class\":\"mca\"}";
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject;
        } catch (JSONException e) {
            Log.d("JsonFile", "JSON parsing exception");
        }
        return null;
    }
}

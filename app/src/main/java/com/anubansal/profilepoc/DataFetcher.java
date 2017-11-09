package com.anubansal.profilepoc;

import android.content.Context;
import android.util.Log;

import com.anubansal.profilepoc.DataSource.ISource;
import com.anubansal.profilepoc.DataSource.JsonFile;
import com.anubansal.profilepoc.ViewModel.UIModel;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by anubansal on 09/11/17.
 */

public class DataFetcher {

    private static final String TAG = DataFetcher.class.getSimpleName();

    private List<ISource> dataSources;
    private UIModel uiModel;
    private Context context;

    public DataFetcher(Context context) {
        this.context = context;
        JSONObject json = new JsonFile(context).fetchData();
        Log.d(TAG, "jsonStream  : " + json.toString());
        if (null == json) {
//            json =
        }
        uiModel = parseJSON(json.toString());
    }

    private UIModel parseJSON(String jsonString) {
        try {
            Gson gson = new Gson();
            return gson.fromJson(jsonString, UIModel.class);
        } catch (JsonSyntaxException e) {
            Log.d(TAG, "Exception in parsing json : " + e);
        }
        return null;
    }

    public UIModel getUIModel() {
        return uiModel;
    }

//    public List<View> getViews() {
//        List<View> viewList = new ArrayList<>();
//        for (Template template : uiModel.getTemplates()) {
//            Log.d("UIBuilderTest", " template type : " + template.getType());
//            if (template.getType().equalsIgnoreCase("Timeline")) {
//                FragmentManager fragMan = ((Activity)context).getFragmentManager();
//                FragmentTransaction fragTransaction = fragMan.beginTransaction();
//                Fragment testFragment = new TestFragment();
//                fragTransaction.add(testFragment, TAG);
//                fragTransaction.commit();
//                viewList.add(testFragment.getView());
//            } else {
//                Widget widget = new Widget(context, template);
//                View view = widget.getView();
//                viewList.add(view);
//            }
//        }
//        return viewList;
//    }
}

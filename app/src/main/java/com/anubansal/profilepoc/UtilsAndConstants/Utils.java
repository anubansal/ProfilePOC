package com.anubansal.profilepoc.UtilsAndConstants;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by anubansal on 09/11/17.
 */

public class Utils {

    public static float densityMultiplier = 1.0f;

    public int dpToPx(float dp)
    {
        return (int) (dp * Utils.densityMultiplier);
    }

    public InputStreamReader getJsonStreamReader(Context context, String file){
        InputStreamReader reader = null;
        try {
            AssetManager assetManager = context.getAssets();
            InputStream in = assetManager.open(file);
            reader = new InputStreamReader(in);
        }catch(IOException ioe){
            Log.e("launch", "error : " + ioe);
        }
        return reader;
    }

    public String loadJSONFromAsset(Context context, String jsonFileName) {
        String json = null;
        InputStream is = null;
        try {
            AssetManager assetManager = context.getResources().getAssets();
            is = assetManager.open(jsonFileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            closeStreams(is);
        }
        return json;
    }

    public static void closeStreams(Closeable... closableStreams) {
        for (Closeable closeable : closableStreams) {
            try {
                if (closeable != null)
                    closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("Utils", "Exception on closing stream : " + e);
            }
        }
    }
}

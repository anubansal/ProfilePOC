package com.anubansal.profilepoc.DataSource;

import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by anubansal on 10/11/17.
 */

public class HttpAsyncTask extends AsyncTask<String, Void, String> {

    private HttpResponseListener listener;

    public HttpAsyncTask(HttpResponseListener listener) {
        this.listener = listener;
    }

    @Override
    protected String doInBackground(String... urls) {
        return GET(urls[0]);
    }

    public static String GET(String url){
        InputStream inputStream = null;
        Response response = null;
        try {

            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            response = client.newCall(request).execute();
            return response.body().string();

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        listener.onResponse(s);
    }
}

package com.pouyaheydari.learning.sematecandroidbasicdey99;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.pouyaheydari.learning.sematecandroidbasicdey99.model.AladhanModel;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class TestAsyncHttpClientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_http_client);

        String url = "http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8";
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Gson gson = new Gson();
                AladhanModel model = gson.fromJson(response.toString(), AladhanModel.class);
                String maqrib = model.getData().getTimings().getMaghrib();
                System.out.println(maqrib);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}
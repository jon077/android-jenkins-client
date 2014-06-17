package org.antczak.jenkins.client.http;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.builder.Builders;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by https://github.com/pawelantczak on 2014-06-17.
 */
public class JenkinsHttpClient {

    private static final String API = "api/json";

    private Context context;
    private String url;
    private String username;
    private String password;

    public JenkinsHttpClient(Context context, String url, String username, String password) {

        this.context = context;
        this.url = url;
        this.username = username;
        this.password = password;

    }

    public <T> T get(String resource, Class<T> clazz) {
        try {
            Builders.Any.B builder = Ion.with(context).load(url + resource + API);
            builder.setLogging("MyLog", Log.DEBUG);
            if (!TextUtils.isEmpty(username)) {
                builder.basicAuthentication(username, password);
            }
            return builder.as(clazz).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> List<T> getList(String resource, Class<T> clazz) {
        try {
            Builders.Any.B builder = Ion.with(context).load(url + resource + API);
            builder.setLogging("MyLog", Log.DEBUG);
            if (!TextUtils.isEmpty(username)) {
                builder.basicAuthentication(username, password);
            }

            TypeToken<List<T>> genericListType = Util.<T>listType();
            return builder.as(genericListType).get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

}

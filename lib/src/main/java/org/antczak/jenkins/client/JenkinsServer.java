/*
 * Copyright (c) 2013 Rising Oak LLC.
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */

package org.antczak.jenkins.client;

import android.content.Context;
import android.util.Base64;

import com.google.gson.reflect.TypeToken;
import com.koushikdutta.ion.Ion;

import org.antczak.jenkins.client.model.Instance;

import java.util.concurrent.ExecutionException;

public class JenkinsServer {

    private String url;
    private String basicAuth;
    private Context context;

    public JenkinsServer(Context context, String url) {
        this(context, url, null, null);
    }

    public JenkinsServer(Context context, String url, String username, String password) {
        this.url = url;
        this.context = context;
        basicAuth = "Basic " + Base64.encodeToString("user:password".getBytes(), Base64.NO_WRAP);
        url = checkSlash(url);
    }

    public Instance getInstance() throws ExecutionException, InterruptedException {
        return Ion.with(context)
                .load(url + "api/json")
                //.setLogging("MyLogs", Log.DEBUG)
                 //.setHeader("Authorization", basicAuth)
                .as(new TypeToken<Instance>() {
                })
                .get();
    }

    private String checkSlash(String url) {
        if (url.endsWith("/")) {
            return url;
        } else {
            return url.concat("/");
        }
    }
}

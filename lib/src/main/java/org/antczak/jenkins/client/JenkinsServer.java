/*
 * Copyright (c) 2013 Rising Oak LLC.
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */

package org.antczak.jenkins.client;

import android.content.Context;

import org.antczak.jenkins.client.http.JenkinsHttpClient;
import org.antczak.jenkins.client.model.Instance;

public class JenkinsServer {

    private String url;
    private JenkinsHttpClient client;

    public JenkinsServer(Context context, String url) {
        this(context, url, null, null);
    }

    public JenkinsServer(Context context, String url, String username, String password) {
        this.url = url;
        client = new JenkinsHttpClient(context, url, username, password);
    }

    public Instance getInstance() {
        Instance instance = client.get("", Instance.class);
        instance.setClient(client);
        instance.setComputers(client.get("computer/", Instance.class).getComputers());
        return instance;
    }

}

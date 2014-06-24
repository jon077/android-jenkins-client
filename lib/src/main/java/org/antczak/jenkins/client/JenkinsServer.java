/*
 * Copyright (c) 2013 Rising Oak LLC.
 *
 * Distributed under the MIT license: http://opensource.org/licenses/MIT
 */

package org.antczak.jenkins.client;

import android.content.Context;

import org.antczak.jenkins.client.http.JenkinsHttpClient;
import org.antczak.jenkins.client.model.Instance;
import org.antczak.jenkins.client.model.Job;
import org.antczak.jenkins.client.model.JobDetails;

public class JenkinsServer {

    private String url;
    private JenkinsHttpClient client;

    public JenkinsServer(Context context, String url) {
        this(context, url, null, null);
    }

    public JenkinsServer(Context context, String url, String username, String password) {
        this.url = url;
        client = new JenkinsHttpClient(context, username, password);
    }

    public Instance getInstance() {
        Instance instance = client.get(url, Instance.class);
        instance.setComputers(client.get(url + "computer/", Instance.class).getComputers());
        return instance;
    }

    public JobDetails getJobDetails(Job job) {
        return client.get(job.getUrl(), JobDetails.class);
    }

}

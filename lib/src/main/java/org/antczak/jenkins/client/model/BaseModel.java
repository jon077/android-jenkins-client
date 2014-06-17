package org.antczak.jenkins.client.model;

import org.antczak.jenkins.client.http.JenkinsHttpClient;

/**
 * Created by https://github.com/pawelantczak on 2014-06-16.
 */
public class BaseModel {
    private JenkinsHttpClient client;

    public JenkinsHttpClient getClient() {
        return client;
    }

    public void setClient(JenkinsHttpClient client) {
        this.client = client;
    }
}

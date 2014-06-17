package org.antczak.jenkins.demo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import org.antczak.jenkins.client.JenkinsServer;
import org.antczak.jenkins.client.model.Instance;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";

    JenkinsServer jenkinsServer;

    @InjectView(R.id.server)
    EditText server;
    @InjectView(R.id.username)
    EditText username;
    @InjectView(R.id.password)
    EditText password;
    @InjectView(R.id.console)
    EditText console;

    @OnClick({R.id.nodes, R.id.jobs})
    void click(View view) {
        switch (view.getId()) {
            case R.id.nodes:
                new DownloadFilesTask().execute(1);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);


    }

    private class DownloadFilesTask extends AsyncTask<Integer, Integer, Instance> {
        protected Instance doInBackground(Integer... type) {
            switch (type[0]) {
                case 1:
                    jenkinsServer = new JenkinsServer(MainApp.getmContext(), "http://jee.antczak.org/jenkins/", "github", "github");
                    Log.e(TAG, jenkinsServer.getInstance().getNodeDescription());
                    return jenkinsServer.getInstance();
            }
            return null;
        }

        protected void onPostExecute(Instance instance) {
            console.setText(instance.getJobs().get(0).getUrl());
            console.setText(console.getText().toString() + " " + instance.getComputers().get(0).getDisplayName());
        }
    }

    private String checkSlash(String url) {
        if (url.endsWith("/")) {
            return url;
        } else {
            return url.concat("/");
        }
    }
}

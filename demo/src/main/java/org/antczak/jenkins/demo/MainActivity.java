package org.antczak.jenkins.demo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import org.antczak.jenkins.client.JenkinsServer;
import org.antczak.jenkins.client.model.BaseModel;
import org.antczak.jenkins.client.model.Instance;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

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

    private class DownloadFilesTask extends AsyncTask<Integer, Integer, List<BaseModel>> {
        protected List<BaseModel> doInBackground(Integer... type) {
            switch (type[0]) {
                case 1:
                    try {
                        jenkinsServer = new JenkinsServer(MainApp.getmContext(), "http://jee.antczak.org/jenkins/");
                        Log.e(TAG, jenkinsServer.getInstance().getNodeDescription());
                        return Arrays.asList(new BaseModel[]{jenkinsServer.getInstance()});
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
            return null;
        }

        protected void onPostExecute(List<BaseModel> result) {
            console.setText(((Instance) result.get(0)).getNodeDescription());
        }
    }

}

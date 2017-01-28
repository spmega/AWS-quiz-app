package com.vpath.spachava.aws_quiz_app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

/**
 * Created by spmega on 1/27/17.
 */

public class AWSMainScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aws_choose_quiz_topic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListViewCompat listViewCompat = (ListViewCompat) findViewById(R.id.quizTopicList);
        listViewCompat.setAdapter(new QuizTopicListAdapter(this, R.layout.aws_choose_quiz_list_item, getResources().getStringArray(R.array.awsServices)));
    }
}

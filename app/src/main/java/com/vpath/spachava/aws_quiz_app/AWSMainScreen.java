package com.vpath.spachava.aws_quiz_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
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

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("AWS Quiz");

        final Intent intent = new Intent(this, AWSQuizActivity.class);

        alertDialogBuilder
                .setMessage("Take a quiz now?")
                .setCancelable(true)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No", null);

        final AlertDialog alertDialog = alertDialogBuilder.create();

        ListViewCompat listViewCompat = (ListViewCompat) findViewById(R.id.quizTopicList);
        listViewCompat.setAdapter(new QuizTopicListAdapter(this, R.layout.aws_choose_quiz_list_item, getResources().getStringArray(R.array.awsServices)));
        listViewCompat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                alertDialog.show();
            }
        });
    }
}

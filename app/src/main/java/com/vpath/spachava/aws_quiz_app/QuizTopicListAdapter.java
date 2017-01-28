package com.vpath.spachava.aws_quiz_app;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by spmega on 1/27/17.
 */

public class QuizTopicListAdapter extends ArrayAdapter {
    private String[] services = null;

    public QuizTopicListAdapter(Context context, int resource, String[] services) {
        super(context, resource, services);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.aws_choose_quiz_list_item, null);
        }

        String service = (String) getItem(position);

        if (service != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.listItem);

            if (tt1 != null) {
                tt1.setText(service);
            }
        }

        return v;
    }
}

package com.vpath.spachava.aws_quiz_app;

/**
 * Created by spmega on 1/25/17.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ScreenSlidePageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                this.getArguments().getInt("layout"), container, false);

        if(this.getArguments().getInt("layout") == R.layout.finish_quiz_layout){
            Button finishQuizButton = (Button) rootView.findViewById(R.id.finishQuiz);
            finishQuizButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getActivity().finish();
                }
            });
        }

        return rootView;
    }
}

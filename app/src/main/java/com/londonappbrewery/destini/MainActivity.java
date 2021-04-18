package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        TextView mStoryTextView;
        Button mTopButton;
        Button mBottomButton;
        int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mTopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Destini", "Top Button pressed!");
                    if(mStoryIndex == 0) {
                        Log.d("Destini", "T1_Story selected");
                       mStoryTextView.setText(R.string.T1_Story);
                       mTopButton.setText(R.string.T1_Ans1);
                       mBottomButton.setText(R.string.T1_Ans2);

                    } else if(mStoryIndex == 1) {
                        Log.d("Destini", "T3_Story selected");
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);

                    } else if (mStoryIndex == 2) {
                        Log.d("Destini", "T6_End selected");
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                    } else {
                        Log.d("Destini", "T5_End selected");
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                    }

                    updateStory();
                }
            });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destini", "Bottom Button pressed!");
                if(mStoryIndex == 0) {
                    Log.d("Destini", "T2_Story selected");
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);

                } else if(mStoryIndex == 1) {
                    Log.d("Destini", "T4_End selected");
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                } else  if(mStoryIndex == 2) {
                    Log.d("Destini", "T3_Story selected");
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                } else if (mStoryIndex == 3) {
                    Log.d("Destini", "T5_End selected");
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                } else {
                    Log.d("Destini", "T6_End selected");
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
                updateStory();
            }
        });
    }

    private void updateStory() {
        Log.d("Destini", "Update Story!");
        mStoryIndex = mStoryIndex + 1;
        Log.d("Destini", "mStoryIndex is: " + mStoryIndex);
        //mStoryIndex = (mStoryIndex + 1) % mStoryTextView.length();
    }

}

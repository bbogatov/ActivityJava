package com.example.activityjava.second_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.activityjava.R;

public class SecondActivity extends AppCompatActivity implements SecondContract.View {

    private final String LOG_TAG = "Second_activity_class";

    /**
     * Presenter that contains all business logic
     */
    private SecondContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        presenter = new SecondPresenter(this);


        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener((View v) -> {
            presenter.backButtonPressed();
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Second activity Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "Second activity Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Second activity Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "Second activity Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "Second activity Stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Second activity Destroy");
    }

    @Override
    public void finishActivity() {
        finish();
    }
}

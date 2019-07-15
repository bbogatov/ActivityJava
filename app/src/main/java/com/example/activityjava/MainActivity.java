package com.example.activityjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.activityjava.activities.mainActivity.MainContract;
import com.example.activityjava.activities.mainActivity.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private final String LOG_TAG = "Main_activity_class";

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);

        Button showNewActivityButton = findViewById(R.id.new_activity);
        showNewActivityButton.setOnClickListener((View v) -> {
            presenter.buttonPressed(this);
        });

        Log.d(LOG_TAG, "Main activity Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Main activity Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "Main activity Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Main activity Pause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "Main activity Restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "Main activity Stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Main activity Destroy");
    }

}

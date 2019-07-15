package com.example.activityjava.activities.mainActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.activityjava.activities.secondActivity.SecondActivity;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;
    private String LOG_TAG = "MainPresenter.class";

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
        Log.d(LOG_TAG, "Initialize presenter for MainActivity.class in " + LOG_TAG);
    }

    @Override
    public void buttonPressed(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
        Log.d(LOG_TAG, "Create new activity in " + LOG_TAG);
    }
}

package com.example.activityjava.activities.main_activity;

import android.content.Context;
import android.content.Intent;

import com.example.activityjava.second_activity.SecondActivity;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;

    public MainPresenter(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void buttonPressed(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }
}

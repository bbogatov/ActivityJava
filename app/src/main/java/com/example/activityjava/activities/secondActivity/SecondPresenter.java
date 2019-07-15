package com.example.activityjava.activities.secondActivity;

import android.util.Log;

public class SecondPresenter implements SecondContract.Presenter {

    private SecondContract.View mView;
    private final String LOG_TAG = "SecondPresenter.class";

    public SecondPresenter(SecondContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void backButtonPressed() {
        mView.finishActivity();
        Log.d(LOG_TAG, "Back button pressed in MainActivity.class");
    }
}

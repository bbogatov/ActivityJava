package com.example.activityjava.second_activity;

public class SecondPresenter implements SecondContract.Presenter {

    private SecondContract.View mView;


    public SecondPresenter(SecondContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void backButtonPressed() {

    }
}

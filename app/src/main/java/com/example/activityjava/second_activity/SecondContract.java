package com.example.activityjava.second_activity;

interface SecondContract {

    interface View{
        void finishActivity();
    }

    interface Presenter {
        void backButtonPressed();
    }
}

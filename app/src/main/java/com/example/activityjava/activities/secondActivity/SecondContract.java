package com.example.activityjava.activities.secondActivity;

interface SecondContract {

    interface View{
        void finishActivity();
    }

    interface Presenter {
        void backButtonPressed();
    }
}

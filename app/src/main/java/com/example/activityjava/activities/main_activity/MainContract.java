package com.example.activityjava.activities.main_activity;

import android.content.Context;

public interface MainContract {

    interface View{

    }

    interface Presenter {
        void buttonPressed(Context context);
    }
}

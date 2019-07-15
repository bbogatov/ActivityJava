package com.example.activityjava.activities.mainActivity;

import android.content.Context;

public interface MainContract {

    interface View{

    }

    interface Presenter {
        void buttonPressed(Context context);
    }
}

package com.mutwakilmo.android.mynews.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mutwakilmo.android.mynews.R;

public class NotificationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
    }

    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

}

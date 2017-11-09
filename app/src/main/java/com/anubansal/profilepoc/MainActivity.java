package com.anubansal.profilepoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout parentView = findViewById(R.id.parent_view);
        presenter = new Presenter(this, parentView);
    }
}

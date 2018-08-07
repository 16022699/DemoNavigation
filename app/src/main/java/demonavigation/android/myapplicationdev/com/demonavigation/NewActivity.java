package demonavigation.android.myapplicationdev.com.demonavigation;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import demonavigation.android.myapplicationdev.com.demonavigation.R;

public class NewActivity extends AppCompatActivity {

    ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
    }


}

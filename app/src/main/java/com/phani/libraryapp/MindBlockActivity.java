package com.phani.libraryapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MindBlockActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lib);
        Toast.makeText(getApplicationContext(),"MindBlockActivity Again 3",Toast.LENGTH_LONG).show();
    }
}

package com.phani.libmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LibModuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int layout = getIntent().getIntExtra("layout",-1);

        if(layout != -1){
            setContentView(layout);
        }else{
            setContentView(R.layout.activity_lib_module);
        }

    }
}

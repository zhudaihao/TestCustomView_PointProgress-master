package com.kincai.testcustomview_pointprogress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kincai.testcustomview_pointprogress.view.CirclePointLoadView;

/**
 * Copyright (C) 2015 The KINCAI Open Source Project
 * .
 * Create By KINCAI
 * .
 * Time 2017-06-14 10:22
 * .
 * Desc Main
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CirclePointLoadView clv= (CirclePointLoadView) findViewById(R.id.clv);
        clv.startLoad();

    }
}

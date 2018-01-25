package com.example.xyzreader.ui;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xyzreader.R;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_article_detail_coord);

        CollapsingToolbarLayout ctl = (CollapsingToolbarLayout)
                findViewById(R.id.collapsing_toolbar_layout);
        ctl.setTitle("test test");
    }
}

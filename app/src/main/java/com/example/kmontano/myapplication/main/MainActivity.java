package com.example.kmontano.myapplication.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kmontano.myapplication.R;
import com.example.kmontano.myapplication.main.MainContract;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter mainPresenter = new MainPresenter(this);
    }
}

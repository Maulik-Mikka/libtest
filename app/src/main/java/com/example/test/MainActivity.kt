package com.example.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.libtest1.toasttest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        toasttest.s(this,"this");

    }
}

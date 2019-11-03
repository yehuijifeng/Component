package com.lh.component;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.router.annotation.Extra;
import com.router.annotation.Route;

@Route(path = "/main/java/com/lh/component")
public class MainActivity extends AppCompatActivity {

    @Extra()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.gloxeer.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.gloxeer.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    /*private TextView tw1, tw2;*/
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding  = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //tw1 = findViewById(R.id.text_view1);
        //tw2 = findViewById(R.id.text_view2);
        button = findViewById(R.id.button);

       // tw1.setText('AHOJ');
        binding.textView1.setText("AHOJ");

    }
}
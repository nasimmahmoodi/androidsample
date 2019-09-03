package com.example.sampletextgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowUserInfo extends AppCompatActivity {

    TextView textVeiew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user_info);

        textVeiew=findViewById(R.id.Users_TextView);



        String username=getIntent().getExtras().getString("username");
        textVeiew.setText(username);
    }
}

package com.example.sampletextgit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username,password,email;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username_editText);
        password=findViewById(R.id.password_editText);
        email=findViewById(R.id.email_editText);
    }

    public void SaveUser_OnClick(View view)
    {
        Intent mIntent=new Intent(MainActivity.this,ShowUserInfo.class);
        Bundle bundle=new Bundle();
        bundle.putString("username",username.getText().toString());
        mIntent.putExtras(bundle);
        startActivity(mIntent);
    }
}

package com.example.hidrolife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button boton;
       boton=(Button) findViewById(R.id.btniniciarsesion);


       boton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                      startActivity(new Intent (MainActivity.this,Login_Activity.class));
                                    }
                                }

       );

    }
}
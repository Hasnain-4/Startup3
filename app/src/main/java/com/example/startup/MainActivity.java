package com.example.startup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button1=(Button) findViewById(R.id.button14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
                //setContentView(R.layout.activity_main2);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
                //setContentView(R.layout.activity_main3);
            }
        });
    }
    public void openNewActivity1(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }



        public void openNewActivity2(){

            Intent intent1 = new Intent(this, Main3Activity.class);
            startActivity(intent1);



        }





}

package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class SubActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedIntenceState) {
        super.onCreate(savedIntenceState);
        setContentView(R.layout.activity_sub);

        Button button = (Button) findViewById(R.id.bt2ac);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void btn1Click(View v) {
        Toast toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER| Gravity.BOTTOM, 10, 10);
        toast.show();
    }
}

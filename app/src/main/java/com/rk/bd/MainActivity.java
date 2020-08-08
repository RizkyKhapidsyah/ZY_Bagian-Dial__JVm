package com.rk.bd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number = (EditText) findViewById(R.id.number);
        Button dial = (Button) findViewById(R.id.dial);

        dial.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String toDial = "tel:" + number.getText().toString();

                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(toDial)));
            }
        });

    }
}
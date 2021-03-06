package com.wat.kennyg.javaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    private static Integer counter = 0;
    private String numberDisplay = counter.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        TextView textView3;
        textView3 = findViewById(R.id.textView3);
        textView3.setText(numberDisplay);
    }

    public void count(View view){
        counter += 1;
        numberDisplay = counter.toString();

        TextView textView3;
        textView3 = findViewById(R.id.textView3);
        textView3.setText(numberDisplay);
    }
}

package com.moringaschool.mylib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText etBookTitle;
    private TextView tvAuthor, tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBookTitle = (EditText) findViewById(R.id.bookInput);
        tvAuthor = (TextView) findViewById(R.id.authorText);
        tvTitle = (TextView) findViewById(R.id.titleText);
    }

    public void searchBooks(View view) {
        String queryString = etBookTitle.getText().toString();
        Log.i(TAG, "searched: "+queryString);
    }
}
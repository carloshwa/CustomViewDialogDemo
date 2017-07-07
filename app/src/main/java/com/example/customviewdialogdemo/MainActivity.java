package com.example.customviewdialogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.long_test_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiSelectCustomViewDialogFragment.newInstance(new String[]{"a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c"})
                        .show(getSupportFragmentManager(), null);
            }
        });

        findViewById(R.id.short_test_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiSelectCustomViewDialogFragment.newInstance(new String[]{"a", "b", "c"})
                        .show(getSupportFragmentManager(), null);
            }
        });
    }
}

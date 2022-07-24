package com.time.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TimePicker clockMode, spinnerMOde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clockMode = findViewById(R.id.clock_mode_clock);
        spinnerMOde = findViewById(R.id.spinner_mode_clock);


        clockMode.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Snackbar.make(findViewById(R.id.timePicker), i + ":" + i1, Snackbar.LENGTH_SHORT).show();
            }
        });
        spinnerMOde.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                Snackbar.make(findViewById(R.id.timePicker), i + ":" + i1, Snackbar.LENGTH_SHORT).show();
            }
        });


    }
}
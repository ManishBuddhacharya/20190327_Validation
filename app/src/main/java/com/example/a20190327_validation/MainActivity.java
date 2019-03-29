package com.example.a20190327_validation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText principle;
    private EditText time;
    private EditText rate;
    private Button btnCalculate;
    private TextView output;

    public boolean emptyValidation(){
        boolean result = true;
        if(TextUtils.isEmpty(principle.getText().toString())){
            principle.setError("Please enter Principle");
            principle.requestFocus();
            result = false;
        }

        else if(TextUtils.isEmpty(time.getText().toString())){
            time.setError("Please enter Time");
            time.requestFocus();
            result = false;
        }

        else if(TextUtils.isEmpty(rate.getText().toString())){
            rate.setError("Please enter Rate");
            rate.requestFocus();
            result = false;

        }
        return result;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principle = findViewById(R.id.principle);
        time = findViewById(R.id.time);
        rate = findViewById(R.id.rate);
        btnCalculate = findViewById(R.id.btnCalculate);
        output = findViewById(R.id.output);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emptyValidation()){
                    float txtPrinciple = Float.parseFloat(principle.getText().toString());
                }



            }
        });


    }
}

package com.example.bnccmath;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends Fragment {

    private Integer angkaOutput;

    public Integer getAngkaOutput() {
        return angkaOutput;
    }

    public void setAngkaOutput(Integer angkaOutput) {
        this.angkaOutput = angkaOutput;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false);


    }

//    public class CounterMath extends Activity {

//        Button plus;
//        Button minus;
//        Button outputV;




        }
    class CounterMath extends AppCompatActivity {
        Button plus;
        Button minus;
        TextView outputV;
        int num_value = 0;
        String _stringVal;

        View.OnClickListener plus_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("src", "Increasing value...");
                num_value++;
                _stringVal = Integer.toString(num_value);
                outputV.setText(_stringVal);
            }
        };

        View.OnClickListener minus_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("src", "Decreasing value...");
                num_value--;
                _stringVal = Integer.toString(num_value);
                outputV.setText(_stringVal);
            }
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_counter);

            plus = findViewById(R.id.buttonPlus);
            plus.setOnClickListener(plus_listener);

            minus = findViewById(R.id.buttonMinus);
            minus.setOnClickListener(minus_listener);

            outputV = findViewById(R.id.outputValue_layout);

        }
    }



//    class CounterMath extends Activity {
//        Button plus;
//        Button minus;
//        TextView outputV;
//        int _counter = 45;
//        String _stringVal;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.fragment_counter);
//
//            minus = (Button) findViewById(R.id.buttonPlus);
//            plus = (Button) findViewById(R.id.buttonMinus);
//            outputV = (TextView) findViewById(R.id.outputValue);
//
//            minus.setOnClickListener(new View.OnClickListener() {
//
//                @Override
//                public void onClick(View v) {
//
//                    Log.d("src", "Decreasing value...");
//                    _counter--;
//                    _stringVal = Integer.toString(_counter);
//                    outputV.setText(_stringVal);
//                }
//            });
//            plus.setOnClickListener(new View.OnClickListener() {
//
//                @Override
//                public void onClick(View v) {
//
//                    Log.d("src", "Increasing value...");
//                    _counter++;
//                    _stringVal = Integer.toString(_counter);
//                    outputV.setText(_stringVal);
//                }
//            });
//
//        }
//    }
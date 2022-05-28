package com.example.bnccmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailMA_et;
    EditText passwordMa_et;
    Button submitLogin_bt;
    Button register_bt;
    SharedPreferences login_sp;


//    View.OnClickListener mainActivity_validate = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            String temp = "";
//            boolean flag = false;
//
//            if(!emailMA_et.getText().toString().equals(R.id.inputEmail)) {
//                temp = temp + "Must input available/correct Email";
//                flag = true;
//            } else if (!passwordMa_et.getText().toString().equals(R.id.inputPassword)) {
//                temp = temp + "Must input correct Password";
//                flag = true;
//            } else if (emailMA_et.length() == 0 && passwordMa_et.length() == 0) {
//                temp = temp + "Must input both Email and Password";
//                flag = true;
//            } else {
//                Intent intent = new Intent(getApplicationContext(), HomeMenu.class);
//                startActivity(intent);
//
//                Toast.makeText(getApplicationContext(), "Login Successfully!",Toast.LENGTH_SHORT).show();
//            }
//        }
//    };

    View.OnClickListener mainActivity_validate = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), HomeMenu.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(), "Login Successfully!",Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener toRegister_menu = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), RegisterMenu.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Going to Register Menu", Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailMA_et = findViewById(R.id.inputEmail);
        passwordMa_et = findViewById(R.id.inputPassword);

        //pencet submit di halaman login lalu di-direct ke halaman home
        submitLogin_bt = findViewById(R.id.buttonSubmitLogin);
        submitLogin_bt.setOnClickListener(mainActivity_validate);

        //register ke halaman register
        register_bt = findViewById(R.id.buttonRegister);
        register_bt.setOnClickListener(toRegister_menu);

    }

}
package com.example.bnccmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterMenu extends AppCompatActivity {

    Button submitRegister_bt;
    EditText ID_et;
    EditText email_et;
    EditText name_et;
    EditText password_et;
    EditText rePassword_et;
    SharedPreferences register_sp;

    protected View.OnClickListener validate = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String temp = "";
            boolean flag = false;


            if (ID_et.getText().toString().length() == 0) {
                temp = temp + "- Must input ID\n";
                flag = true;
            }

            if (email_et.getText().toString().length() == 0) {
                temp = temp + "- Must input Email\n";
                flag = true;
            } else if (!email_et.getText().toString().contains("@")) {
                temp = temp + "- Must input Email properly\n";
                flag = true;
            } else if (!email_et.getText().toString().endsWith(".com")) {
                temp = temp + "- Must input Email properly\n";
                flag = true;
            }

            if (name_et.getText().toString().length() == 0) {
                temp = temp + "- Must input Name\n";
                flag = true;
            } else if (name_et.getText().toString().length() < 5) {
                temp = temp + "- Must input Name above than 5 characters\n";
                flag = true;
            }

            if (password_et.getText().toString().length() == 0) {
                temp = temp + "- Must input Password\n";
                flag = true;
            }

            if (rePassword_et.getText().toString().length() == 0) {
                temp = temp + "- input Re-Password\n";
                flag = true;
//kalo pake !rePassword_et jawaban yang sesuai tetep disalahin
            } else if (rePassword_et.getText().toString().equals(password_et)) {
                temp = temp + "- Must input Re-Password equals to Password\n";
                flag = true;
            }

            if (flag == false) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                //masukin fungsi shared preference
                SharedPreferences.Editor edit = register_sp.edit();
                edit.putString("ID", ID_et.getText().toString());
                edit.putString("Email", email_et.getText().toString());
                edit.putString("Nama", name_et.getText().toString());
                edit.putString("Password", password_et.getText().toString());
                edit.putString("Re-Password", rePassword_et.getText().toString());
                Toast.makeText(getApplicationContext(), "Register Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Re-check register requirement below:\n" + temp, Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_menu);

        //pencet submit di halaman login lalu di-direct ke halaman home
        submitRegister_bt = findViewById(R.id.buttonSubmitRegister);
        submitRegister_bt.setOnClickListener(validate);
        //biar shared preferencenya masuk ke button submit

        ID_et = findViewById(R.id.inputID);
        ID_et.setOnClickListener(validate);

        email_et = findViewById(R.id.inputEmail);
        email_et.setOnClickListener(validate);

        name_et = findViewById(R.id.inputName);
        name_et.setOnClickListener(validate);

        password_et = findViewById(R.id.inputPassword);
        password_et.setOnClickListener(validate);

        rePassword_et = findViewById(R.id.inputRePassword);
        rePassword_et.setOnClickListener(validate);

        register_sp = getSharedPreferences("User Data", MODE_PRIVATE);
    }
}

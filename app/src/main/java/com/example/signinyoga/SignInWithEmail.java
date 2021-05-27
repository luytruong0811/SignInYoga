package com.example.signinyoga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;

public class SignInWithEmail extends AppCompatActivity {
    private CheckBox cbPassword;
    private EditText etPassword;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cbPassword = findViewById(R.id.cb_password);
        etPassword = findViewById(R.id.et_set_password);
        iv = findViewById(R.id.iv_hide);
        setContentView(R.layout.activity_sign_in_with_email);
//        cbPassword.setChecked(true);
//
//        cbPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                int start,end;
//                if(!isChecked){
//                    start=etPassword.getSelectionStart();
//                    end=etPassword.getSelectionEnd();
//                    etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());;
//                    etPassword.setSelection(start,end);
//                }else{
//                    start=etPassword.getSelectionStart();
//                    end=etPassword.getSelectionEnd();
//                    etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
//                    etPassword.setSelection(start,end);
//                }
//            }
//        });

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etPassword.getTransformationMethod().getClass().getSimpleName().equals("PasswordTransformationMethod")) {
                    etPassword.setTransformationMethod(new SingleLineTransformationMethod());
                    iv.setImageResource(R.drawable.ic_show);
                }
                else {
                    etPassword.setTransformationMethod(new PasswordTransformationMethod());
                    iv.setImageResource(R.drawable.ic_hide);
                }
                etPassword.setSelection(etPassword.getText().length());
            }
        });
    }
}
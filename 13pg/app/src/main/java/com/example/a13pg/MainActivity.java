package com.example.a13pg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnStatus;
    TextView tvLoginStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnStatus = (Button) findViewById(R.id.button);
        tvLoginStatus = (TextView) findViewById(R.id.tvLoginStatus);
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });
    }
    public void check(){
        if(etUsername.getText().toString().equals("sufiya") &&
                etPassword.getText().toString().equals("12345")){
            tvLoginStatus.setText("Login successful");
        }else{
            Toast.makeText(this, "Login fail", Toast.LENGTH_LONG).show();
        }
    }
}




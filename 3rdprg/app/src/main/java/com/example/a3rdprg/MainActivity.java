package com.example.a3rdprg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    private HashMap<String, String> credentials;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Initialize the credentials
        credentials = new HashMap<>();
        credentials.put("admin", "password");
        credentials.put("user1", "pass1");
        credentials.put("user2", "pass2");
        credentials.put("sufiya", "sufi1234");  // Adding the new username-password pair
        // Add more username-password pairs as needed

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (validateLogin(username, password)) {
                    // Perform the login action (e.g., navigate to another activity)
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    // Show error message
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateLogin(String username, String password) {
        // Check if the username exists and the password matches
        return credentials.containsKey(username) && credentials.get(username).equals(password);
    }
}

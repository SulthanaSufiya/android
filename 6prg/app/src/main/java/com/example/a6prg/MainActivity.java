package com.example.a6prg;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button sub=findViewById(R.id.submit);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                showMessage(MainActivity.this,"User Information","Successfully completed");
        }
        });
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    public void showMessage(Context con,String t, String msg)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(con); builder.setTitle(t);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
        public void onClick(DialogInterface dialog, int which) { dialog.dismiss();
        }
        });
        builder.show();

    }
}


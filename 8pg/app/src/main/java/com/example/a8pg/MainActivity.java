package com.example.a8pg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    Button Read,Write;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Read=findViewById(R.id.btnRead);
        Write=findViewById(R.id.btnWrite);
        editText=findViewById(R.id.txtWrite);
        textView=findViewById(R.id.tv_text);

        Write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textMassage=editText.getText().toString();
                try {
                    FileOutputStream fileOutputStream=openFileOutput("myFile.txt",MODE_PRIVATE);
                    fileOutputStream.write(textMassage.getBytes());
                    fileOutputStream.close();
                    Toast.makeText(MainActivity.this, "file saved", Toast.LENGTH_SHORT).show();
                    editText.setText("");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileInputStream fileInputStream=openFileInput("myFile.txt");
                    InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
                    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
                    StringBuffer stringBuffer=new StringBuffer();
                    String lines;
                    while ((lines=bufferedReader.readLine())!=null){
                        stringBuffer.append(lines+"\n");
                    }
                    textView.setText(stringBuffer.toString());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
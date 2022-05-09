package com.example.appm9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private TextView tv;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = ((EditText) findViewById(R.id.editText));
        tv = ((EditText) findViewById(R.id.textView));
        context = MainActivity.this;
    }
    public void llamada(View v){
        if (et.getText().toString().length()>0){
            MyTaskCliente myTaskYW = new MyTaskCliente();
            myTaskYW.execute(et.getText().toString());
        } else{
            Toast.makeText(context, "Escribe la URL a atacar", Toast.LENGTH_LONG).show();
        }
    }
}
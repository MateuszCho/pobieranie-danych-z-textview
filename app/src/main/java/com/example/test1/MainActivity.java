package com.example.test1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_przycisk1;
    EditText et_poleimie;
    EditText et_polenazwisko;
    TextView tv_data;
    String str_poleimie, str_polenazwisko;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_poleimie = (EditText) findViewById(R.id.et_poleimie);
        et_polenazwisko = (EditText) findViewById(R.id.et_polenazwisko);
        btn_przycisk1 = (Button) findViewById(R.id.btn_przycisk1);
        tv_data = (TextView) findViewById(R.id.tv_data) ;

        btn_przycisk1.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
        str_poleimie = et_poleimie.getText().toString().trim();
        str_polenazwisko = et_polenazwisko.getText().toString().trim();
        String name = str_poleimie + " " + str_polenazwisko;
        tv_data.setText(name);
    }

}

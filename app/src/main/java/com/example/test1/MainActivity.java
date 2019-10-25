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
        private boolean validateImie(){
            String ImieInput = et_poleimie.getEditableText().toString().trim();

            if(ImieInput.isEmpty()){
                et_poleimie.setError("No podaj imię");
                return false;
            }
            else{
                et_poleimie.setError(null);
                return true;
            }
        }

    private boolean validateNazwisko(){
        String NazwiskoInput = et_polenazwisko.getEditableText().toString().trim();

        if(NazwiskoInput.isEmpty()){
            et_poleimie.setError("No podaj nazwisko");
            return false;
        }
        else{
            et_poleimie.setError(null);
            return true;
        }

    }
    public void sprawdzDane(View v){
        if (!validateImie() | !validateNazwisko()){
            return;
        }

    }
    @Override
    public void onClick(View v) {
        str_poleimie = et_poleimie.getText().toString().trim();
        String imieInput = str_poleimie;
        if (imieInput.isEmpty()) {
            et_poleimie.setError("No podaj imię");
        }

        str_polenazwisko = et_polenazwisko.getText().toString().trim();
        String nazwiskoInput = str_polenazwisko;
        if (nazwiskoInput.isEmpty()){
            et_polenazwisko.setError("no podaj nazwisko");
        }
//TODO brak wyśietlania Striing name jeżeli nie przejdzie warunków

        String name = "Witaj " + str_poleimie + " " + str_polenazwisko + "!";
        tv_data.setText(name);
    }



}

package com.example.user.sharedpref;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etnombre,etcorreo,etnumero;
    private Button btn1,btn2;
    private String nombre,correo,numero;
    private ListView tvt;
    Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnombre = (EditText)findViewById(R.id.etnombre);
        etcorreo = (EditText)findViewById(R.id.etcorreo);
        etnumero = (EditText)findViewById(R.id.etnumero);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
    }

    public void guardarpref(View v){

        SharedPreferences misharedPreferences = getSharedPreferences("Datos Personales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = misharedPreferences.edit();

         nombre = etnombre.getText().toString();
         correo = etcorreo.getText().toString();
         numero = etnumero.getText().toString();

         editor.putString("nombre", nombre);
         editor.putString("correo",correo);
         editor.putString("numero",numero);
         editor.commit();

        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto("nombre", "correo", "numero"));
        adaptador = new Adaptador(this, contactos);
        tvt = (ListView) findViewById(R.id.tvt);
        tvt.setAdapter(adaptador);

         Toast.makeText(getApplicationContext(), "Datos Guardados", Toast.LENGTH_SHORT).show();
         etnombre.setText("");
         etcorreo.setText("");
         etnumero.setText("");
    }

    public void mostrarpref(View v){
        SharedPreferences misharedPreferences = getSharedPreferences("Datos Personales", Context.MODE_PRIVATE);
        Toast.makeText(getApplicationContext(), "Datos Mostrados", Toast.LENGTH_SHORT).show();
        nombre = misharedPreferences.getString("nombre","no existe");
        correo = misharedPreferences.getString("correo","no existe");
        numero = misharedPreferences.getString("numero","no existe");





    }
}

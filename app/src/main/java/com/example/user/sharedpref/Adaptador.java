package com.example.user.sharedpref;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;


import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context miContexto;
    private ArrayList<Contacto>miArraylist;
    public Adaptador (Context miContexto, ArrayList<Contacto> miArrayList){
        this.miContexto=miContexto;
        this.miArraylist=miArrayList;
    }
    @Override
    public int getCount() {
        return 0;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(miContexto);
        convertView = layoutInflater.inflate(R.layout.activity_main, null);

        EditText nombre=(EditText) convertView.findViewById(R.id.etnombre);
        EditText correo=(EditText) convertView.findViewById(R.id.etcorreo);
        EditText numero=(EditText) convertView.findViewById(R.id.etnumero);

        nombre.setText(miArraylist.get(position).getNombre());
        correo.setText(miArraylist.get(position).getCorreo());
        numero.setText(miArraylist.get(position).getNumero());

        return convertView;
    }
}

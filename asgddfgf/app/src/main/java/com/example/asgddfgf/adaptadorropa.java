package com.example.asgddfgf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptadorropa extends BaseAdapter {
    ArrayList <ropa> lista;
    Context context;

    public adaptadorropa(ArrayList<ropa> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context); // contexto
        view = layoutInflater.inflate(R.layout.item_ropa, null);
        TextView tv = view.findViewById(R.id.textView5);
        tv.setText(lista.get(i).getNombre());
        return view;
    }
}

package com.example.t_f_u_3;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PkmAdaptador extends RecyclerView.Adapter<PkmAdaptador.PkmViewHolder> {
    ArrayList<Pokemon> lista;
    private boolean coloresActivados = false;
    private boolean mostrarTipo = false;
    private boolean mostrarImagen = false;
    public PkmAdaptador(ArrayList<Pokemon> lista){
        this.lista = lista;
    }


    @NonNull
    @Override
    public PkmAdaptador.PkmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PkmAdaptador.PkmViewHolder pkmViewHolder =
                new PkmViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.ficha,parent,false)
                );
        return pkmViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PkmAdaptador.PkmViewHolder holder, int position) {
        Pokemon pkm = lista.get(position);
        holder.tv_nombre.setText(pkm.getName());
        holder.tv_type.setText(pkm.getType());
        holder.imagen.setImageResource(pkm.getImage());

        if(coloresActivados){
            holder.tv_nombre.setTextColor(getColor(pkm.getType()));
        }else{
            holder.tv_nombre.setTextColor(Color.BLACK);
        }

        if(mostrarTipo){
            holder.tv_type.setTextColor(Color.BLACK);
        }else{
            holder.tv_type.setTextColor(Color.WHITE);
        }

        if (mostrarImagen) {
            holder.imagen.setVisibility(View.VISIBLE); // Mostrar imagen
            holder.imagen.setImageResource(pkm.getImage());
        } else {
            holder.imagen.setVisibility(View.GONE); // Ocultar imagen
        }
    }

    private int getColor(String type){
        switch (type.toLowerCase()){
            case "planta":
                return Color.GREEN;
            case "fuego":
                return Color.RED;
            case "agua":
                return Color.BLUE;
            case "normal":
                return Color.GRAY;
            case "veneno":
                return Color.MAGENTA;
            case "roca":
                return Color.parseColor("#A52A2A"); // Marrón
            case "electrico":
                return Color.YELLOW;
            case "hada":
                return Color.parseColor("#FFC0CB"); // Rosa
            case "lucha":
                return Color.parseColor("#FFA500"); // Naranja
            case "psiquico":
                return Color.parseColor("#800080"); // Púrpura
            default:
                return Color.BLACK;
        }

    }
    public void activarColores(boolean activar){
        coloresActivados = activar;
        notifyDataSetChanged();
    }
    public void mostrarTipo(boolean mostrar) {
        mostrarTipo = mostrar;
        notifyDataSetChanged(); // Notificar al RecyclerView que los datos han cambiado
    }
    public void mostrarImagen(boolean mostrar) {
        mostrarImagen = mostrar;
        notifyDataSetChanged(); // Notificar al RecyclerView que los datos han cambiado
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class PkmViewHolder extends RecyclerView.ViewHolder{
        TextView tv_nombre;
        TextView tv_type;
        ImageView imagen;

        public PkmViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nombre = itemView.findViewById(R.id.tv_nombre);
            tv_type = itemView.findViewById(R.id.tv_type);
            imagen = itemView.findViewById(R.id.imagen);
        }
    }



}

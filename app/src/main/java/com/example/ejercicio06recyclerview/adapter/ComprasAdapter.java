package com.example.ejercicio06recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio06recyclerview.R;
import com.example.ejercicio06recyclerview.modelos.ListaCompra;

import java.util.List;

public class ComprasAdapter extends RecyclerView.Adapter<ComprasAdapter.ComprasVH> {

    private List<ListaCompra> objects;
    private int resource;
    private Context context;

    public ComprasAdapter(List<ListaCompra> objects, int resource, Context context) {
        this.objects = objects;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public ComprasVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View comprasView = LayoutInflater.from(context).inflate(resource,null);

        return new ComprasVH(comprasView);
    }

    @Override
    public void onBindViewHolder(@NonNull ComprasVH holder, int position) {

        ListaCompra listaCompra= objects.get(position);
        holder.lblProducto.setText(listaCompra.getProducto());
        holder.lblPrecio.setText(listaCompra.getPrecio());
        holder.lblCantidad.setText(listaCompra.getCantidad());

        holder.btnEliminar.setImageResource(android.R.drawable.ic_delete);
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ComprasVH extends RecyclerView.ViewHolder {

        TextView lblProducto,lblCantidad,lblPrecio;
        ImageButton btnEliminar;

        public ComprasVH(@NonNull View itemView) {
            super(itemView);
            lblProducto= itemView.findViewById(R.id.lblProductoCompraViewModel);
            lblCantidad=itemView.findViewById(R.id.lblCantidadCompraViewModel);
            lblPrecio=itemView.findViewById(R.id.lblPrecioCompraViewModel);
            btnEliminar=itemView.findViewById(R.id.btnEliminarCompraViewModel);
        }
    }
}

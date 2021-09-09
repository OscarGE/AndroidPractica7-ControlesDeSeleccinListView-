package com.example.practica6_controlesdeseleccinlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.practica6_controlesdeseleccinlistview.databinding.ItemProductoBinding

class ProductosAdapter(private val mContext: Context, private val listaProductos: List<Producto>) : ArrayAdapter<Producto>(mContext,0,listaProductos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding  = ItemProductoBinding.inflate(LayoutInflater.from(mContext),parent,false)

        val producto = listaProductos[position]

        binding.txtNombre.text = producto.nombre
        binding.txtPrecio.text = "$${producto.precio}"
        binding.imageView.setImageResource(producto.imagen)

        return binding.root
    }
}
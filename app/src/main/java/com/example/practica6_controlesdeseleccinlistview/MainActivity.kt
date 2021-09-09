package com.example.practica6_controlesdeseleccinlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica6_controlesdeseleccinlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val producto1=Producto("Cámara", 8000.00, "Cámara digital Canon",R.drawable.camara)
        val producto2=Producto("Laptop", 13000.00, "Laptop Acer, 16 GB RAM",R.drawable.laptop)
        val listaProductos= listOf<Producto>(producto1,producto2)

        val adaptador=ProductosAdapter(this,listaProductos)
        binding.lista.adapter=adaptador

        binding.lista.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, ProductoActivity::class.java)
            intent.putExtra("producto",listaProductos[i])
            startActivity(intent)
        }
    }
}
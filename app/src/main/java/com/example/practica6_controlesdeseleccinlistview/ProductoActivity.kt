package com.example.practica6_controlesdeseleccinlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica6_controlesdeseleccinlistview.databinding.ActivityProductoBinding

class ProductoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProductoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val producto=intent.getSerializableExtra("producto") as Producto
        binding.txtNombreProd.text=producto.nombre
        binding.txtPrecioProd.text="$${producto.precio}"
        binding.txtDescripcionProd.text=producto.descripcion
        binding.imageView2.setImageResource(producto.imagen)

    }
}
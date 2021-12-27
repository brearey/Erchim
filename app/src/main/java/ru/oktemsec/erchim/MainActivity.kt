package ru.oktemsec.erchim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import ru.oktemsec.erchim.models.Product
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.oktemsec.erchim.adapters.Adapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(
            listOf(
                Product("яблоки", 113, "описание товара", "Магазин Алгыс"),
                Product("Свинина", 286, "описание товара", "Магазин Алгыс"),
                Product("Рыба", 189, "описание товара", "Магазин Алгыс"),
                Product("Яйца", 80, "описание товара", "Магазин Алгыс"),
                Product("Сахар", 50, "описание товара", "Магазин Алгыс"),
                Product("Соль", 14, "описание товара", "Магазин Алгыс"),
                Product("Чай", 952, "описание товара", "Магазин Алгыс"),
                Product("Хлеб", 58, "ржаной", "Магазин Алгыс")
            )
        )
    }
}
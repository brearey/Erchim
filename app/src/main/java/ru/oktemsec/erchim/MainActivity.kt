package ru.oktemsec.erchim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import ru.oktemsec.erchim.models.Product
import android.widget.ArrayAdapter




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.list_view)

        val prod:Product = Product("хлеб", 48, "тут хлеб хороший Немюгюнский", "магазин \"Сардана\"")
        Log.d("bearey", prod.name + " " + prod.price)

        val catNames = arrayOf(
            "Рыжик", "Барсик", "Мурзик", "Мурка", "Васька",
            "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
            "Китти", "Масяня", "Симба"
        )

        val products = arrayOf(
            Product("яблоки", 113, "обычные", "Магазин Алгыс"),
            Product("Свинина", 286, "обычные", "Магазин Алгыс"),
            Product("Рыба", 189, "обычные", "Магазин Алгыс"),
            Product("Яйца", 80, "обычные", "Магазин Алгыс"),
            Product("Сахар", 50, "обычные", "Магазин Алгыс"),
            Product("Соль", 14, "обычные", "Магазин Алгыс"),
            Product("Чай", 952, "обычные", "Магазин Алгыс"),
            Product("Хлеб", 58, "ржаной", "Магазин Алгыс")
        )

        val adapter: ArrayAdapter<Product> = ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1, products)
        listView.adapter = adapter
    }
}
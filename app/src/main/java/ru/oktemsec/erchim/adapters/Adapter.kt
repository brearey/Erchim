package ru.oktemsec.erchim.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.oktemsec.erchim.R
import ru.oktemsec.erchim.models.Product

class Adapter(private val products: List<Product>): RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productName: TextView? = null
        var productPrice: TextView? = null
        var productDesc: TextView? = null
        var productCoord: TextView? = null

        init {
            productName = itemView.findViewById(R.id.product_name)
            productPrice = itemView.findViewById(R.id.product_price)
            productDesc = itemView.findViewById(R.id.product_desc)
            productCoord = itemView.findViewById(R.id.product_coord)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.productName?.text = products[position].name
        holder.productPrice?.text = products[position].price.toString() + " руб."
        holder.productDesc?.text = products[position].desc
        holder.productCoord?.text = products[position].coordinate.toString()
    }

    override fun getItemCount() = products.size
}
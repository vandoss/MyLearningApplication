package com.katran.mylearningapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.katran.mylearningapplication.R
import com.katran.mylearningapplication.Product

class ShoppingListAdapter: Adapter<ShoppingListAdapter.ShoppingListViewHolder>() {

    private var shoppingList: List<Product> = listOf()

    fun setList(list: List<Product>) {
        shoppingList = list
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ShoppingListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoppingList.count()
    }

    override fun onBindViewHolder(holder: ShoppingListViewHolder, position: Int) {
        holder.countTextView.text = shoppingList[position].count.toString()
        holder.dimensionTextView.text = shoppingList[position].dimension
        holder.nameTextView.text = shoppingList[position].name
    }

    class ShoppingListViewHolder(
        private val itemView: View
    ) : ViewHolder(itemView) {

        val countTextView: TextView
        val dimensionTextView: TextView
        val nameTextView: TextView

        init {
            countTextView = itemView.findViewById(R.id.product_count)
            dimensionTextView = itemView.findViewById(R.id.product_dimension)
            nameTextView = itemView.findViewById(R.id.product_name)
        }

    }
}
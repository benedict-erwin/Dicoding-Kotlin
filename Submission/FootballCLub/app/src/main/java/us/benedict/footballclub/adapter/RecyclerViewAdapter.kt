/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.AnkoContext
import us.benedict.footballclub.R
import us.benedict.footballclub.layout.ItemListLayout
import us.benedict.footballclub.model.Item
import com.bumptech.glide.Glide

/*
*
* @context Context : Untuk mendefinisikan context
* @list ArrayList<Item> : Mendeklarasikan model/Item sebagai ArrayList
* @listener : Variable listener, supaya bisa menerima event
*
* */
class RecyclerViewAdapter(val context: Context, var list: ArrayList<Item> = arrayListOf(), private val listener: (Item) -> Unit) : RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemListLayout().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val club = list[position]
        Glide.with(context).load(club.image).into(holder.club_img)
        holder.club_text.text = "${club.name}"
        holder.bindItem(club, listener)
    }

    /* Hitung Item */
    override fun getItemCount(): Int {
        return list.size
    }

    /* Class ItemViewHolder */
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var club_img : ImageView
        var club_text : TextView

        init {
            club_img = itemView.findViewById(R.id.img_club)
            club_text = itemView.findViewById(R.id.tx_club)
        }

        /* Method untuk set Listener */
        fun bindItem(items: Item, listener: (Item) -> Unit){
            itemView.setOnClickListener { listener(items) }
        }

    }
}
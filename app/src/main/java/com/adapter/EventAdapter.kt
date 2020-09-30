package com.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.data.model.GoogleEventModel
import com.example.gdcbitirmeprojesi.R
import kotlinx.android.synthetic.main.item_event.view.*

class EventAdapter(
    private val eventList: MutableList<GoogleEventModel>,
    //private val bannerList: MutableList<String>,
    private val onClick: (GoogleEventModel) -> Unit
) :
    RecyclerView.Adapter<EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(parent.inflate(R.layout.item_event))
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = eventList[position]
        holder.bind(event, onClick)
    }

    override fun getItemCount(): Int = eventList.size
}

fun ViewGroup.inflate(layoutId: Int): View {
    val layoutInflater = LayoutInflater.from(context)
    return layoutInflater.inflate(layoutId, this, false)
}

class EventViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(event: GoogleEventModel, onClick: (GoogleEventModel) -> Unit) {
        itemView.imageView.load(event.banner)

        itemView.setOnClickListener {
            onClick(event)
        }
    }
}
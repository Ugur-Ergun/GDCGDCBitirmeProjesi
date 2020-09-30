package com.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.data.model.CommunityModel
import com.example.gdcbitirmeprojesi.R
import kotlinx.android.synthetic.main.item_community.view.*

class CommunityAdapter(
    private val communityList: MutableList<CommunityModel>,
    private val onClick: (CommunityModel) -> Unit
) :
    RecyclerView.Adapter<CommunityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunityViewHolder {
        return CommunityViewHolder(parent.inflate(R.layout.item_community))
    }

    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        val community = communityList[position]
        holder.bind(community, onClick)
    }

    override fun getItemCount(): Int = communityList.size
}

fun ViewGroup.inflate(layoutId: Int): View {
    val layoutInflater = LayoutInflater.from(context)
    return layoutInflater.inflate(layoutId, this, false)
}

class CommunityViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(community: CommunityModel, onClick: (CommunityModel) -> Unit) {
        itemView.imageView.load(community.banner)

        itemView.setOnClickListener {
            onClick(community)
        }
    }
}
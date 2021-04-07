package com.example.validationform

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FeedAdapter(private val feedList: List<FeedItem>) :
    RecyclerView.Adapter<FeedAdapter.FeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.feed_item,
            parent, false
        )

        return FeedViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
        val currentItem = feedList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textViewTop.text = currentItem.textTop
        holder.textViewBottom.text = currentItem.textBottom
    }

    override fun getItemCount() = feedList.size


    class FeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivFeedImage)
        val textViewTop: TextView = itemView.findViewById(R.id.tvFeedTextTop)
        val textViewBottom: TextView = itemView.findViewById(R.id.tvFeedTextBottom)
    }


}
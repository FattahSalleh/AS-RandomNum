package com.example.ocbc_vendor_guideline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActivityAdapter(
    private val optionList: List<ActivityItem>,
    private val listener: OnItemClickListener
) :
    RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActivityAdapter.ActivityViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_item,
            parent, false
        )
        return ActivityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ActivityAdapter.ActivityViewHolder, position: Int) {
        val currentItem = optionList[position]

        holder.textView.text = currentItem.optionText
    }

    override fun getItemCount(): Int {
        return optionList.size
    }

    inner class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val textView: TextView = itemView.findViewById(R.id.tvOptionText)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}
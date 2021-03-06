package com.example.newsappc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsappc.R
import com.example.newsappc.model.BaseNewsModel
import com.example.newsappc.model.NewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*

class BigNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_big_news,
        parent,
        false
    )
) {
    fun bind(bigNewsModel: BaseNewsModel, onItemClickListener: (BaseNewsModel) -> Unit) {
        Glide.with(itemView.context)
            .load((bigNewsModel as NewsModel).newsImageUrl)
            .centerCrop()
            .into(itemView.imgNews)
        itemView.txtNewsTitle.text = bigNewsModel.newsTitle

        itemView.setOnClickListener {
            onItemClickListener(bigNewsModel)
        }
    }
}


package com.example.newsappc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsappc.R
import com.example.newsappc.model.BaseNewsModel
import com.example.newsappc.model.NewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.imgNews
import kotlinx.android.synthetic.main.adapter_item_big_news.view.txtNewsTitle
import kotlinx.android.synthetic.main.adapter_item_small_news.view.*

class SmallNewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_small_news,
        parent,
        false
    )
) {
    fun bind(smallNewsModel: BaseNewsModel, onItemClickListener: (BaseNewsModel) -> Unit) {
        Glide.with(itemView.context).load((smallNewsModel as NewsModel).newsImageUrl).centerCrop()
            .into(itemView.imgNews)
        itemView.txtNewsTitle.text = smallNewsModel.newsTitle

        itemView.setOnClickListener {
            onItemClickListener(smallNewsModel)
        }

        itemView.swIsSaved.isChecked = smallNewsModel.isSaved
        itemView.swIsSaved.setOnClickListener(null)
        itemView.swIsSaved.setOnCheckedChangeListener { buttonView, isChecked ->
            smallNewsModel.isSaved = isChecked

        }
    }
}


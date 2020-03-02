package com.example.newsappc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsappc.R
import com.example.newsappc.model.BigNewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*

class BigNewsViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater
        .from(container.context)
        .inflate(
            R.layout.adapter_item_big_news,
            container,
            false
        )
) {
    fun bind(
        bigNewsModel: BigNewsModel,
        onItemClickListener: (BigNewsModel) -> Unit
    ) {
        itemView.txtNewsTitle.text = bigNewsModel.newsTitle
        //itemView.imgNews.background = bigNewsModel.newsImageUrl

        itemView.setOnClickListener {
            onItemClickListener(bigNewsModel)
        }

    }

}
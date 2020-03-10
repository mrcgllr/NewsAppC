package com.example.newsappc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsappc.R
import com.example.newsappc.model.BaseNewsModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.adapter_item_ads_banner.view.*

class AdsBannerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_ads_banner,
        parent,
        false
    )
) {
    fun bind(adsNewsModel: BaseNewsModel, onItemClickListener: (BaseNewsModel) -> Unit) {
        MobileAds.initialize(itemView.context) {}
        val adRequest = AdRequest.Builder().build()
        itemView.adView.loadAd(adRequest)
    }
}


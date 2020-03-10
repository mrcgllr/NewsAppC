package com.example.newsappc.model

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    override val itemViewType:Int
):BaseNewsModel()
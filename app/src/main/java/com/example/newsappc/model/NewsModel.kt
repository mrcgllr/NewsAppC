package com.example.newsappc.model

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    var isSaved: Boolean,
    override val itemViewType: Int
) : BaseNewsModel()
package com.example.newsappc.mock

import com.example.newsappc.model.FragmentModel
import com.example.newsappc.ui.NewsFragment
import java.util.*

object MockData {
    private const val newsCategorySize = 7
    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat( getTitleList().size) { position ->
            val fragment = NewsFragment()
            val fragmentModel = FragmentModel(position, fragment, getTitleList()[position])
            fragmentList.add(fragmentModel)

        }

        return fragmentList
    }

    private fun getTitleList(): ArrayList<String> {
        val arrayTitleList = ArrayList<String>()
        arrayTitleList.add("Anasayfa")
        arrayTitleList.add("Yazarlar")
        arrayTitleList.add("Gündem")
        arrayTitleList.add("Siyaset")
        arrayTitleList.add("Teknoloji")

        return arrayTitleList

    }
}
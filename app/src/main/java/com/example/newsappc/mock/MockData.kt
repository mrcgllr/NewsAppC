package com.example.newsappc.mock

import com.example.newsappc.model.FragmentModel
import com.example.newsappc.ui.NewsFragment
import java.util.*

object MockData {
    fun getNewsCategoryFragment(fragmentSize: Int): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(fragmentSize) { position ->
            val fragment = NewsFragment()
            val fragmentModel = FragmentModel(position, fragment,getFragmentTitle(position))
            fragmentList.add(fragmentModel)

        }

        return fragmentList
    }

    private fun getFragmentTitle(position: Int): String {
       return when (position) {
            0 ->"Anasayfa"
            1->"Yazarlar"
            2->"Gündem"
            3->"Siyaset"
            else ->"Diğer"
        }
    }
}
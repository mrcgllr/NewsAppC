package com.example.newsappc.mock

import com.example.newsappc.enums.NewsType
import com.example.newsappc.model.AdsModel
import com.example.newsappc.model.BaseNewsModel
import com.example.newsappc.model.FragmentModel
import com.example.newsappc.model.NewsModel
import com.example.newsappc.ui.NewsFragment
import com.google.android.gms.ads.AdSize
import java.util.*

object MockData {
    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentList = ArrayList<FragmentModel>()

        repeat(getTitleList().size) { position ->
            val newsFragment = NewsFragment()

            val fragmentModel = FragmentModel(
                position,
                newsFragment,
                getTitleList()[position]
            )

            fragmentList.add(fragmentModel)
        }

        return fragmentList
    }

    private fun getTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("ANASAYFA")
        titleList.add("YAZARLAR")
        titleList.add("GÜNDEM")
        titleList.add("EKONOMİ")
        titleList.add("SPOR")
        titleList.add("CADDE")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")
        return titleList
    }

    fun getNewsList(newsListSize: Int): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()
        repeat(newsListSize) {
            val adsModel = AdsModel(
                AdSize.BANNER,
                "ca-app-pub-3940256099942544/6300978111",
                NewsType.ADS_BANNER.id
            )

            val bigNewsModel = NewsModel(
                "https://i4.hurimg.com/i/hurriyet/75/900x350/5e5d7a1a18c7732484f1e05c.jpg",
                "Ertelendi...!",
                true,
                NewsType.BIG_NEWS.id
            )
            val smalNewsModel = NewsModel(
                "https://i4.hurimg.com/i/hurriyet/75/900x350/5e5d7a1a18c7732484f1e05c.jpg",
                "Ertelendi...!",
                true,
                NewsType.SMALL_NEWS.id
            )
            val smalNewsModel2 = NewsModel(
                "https://i4.hurimg.com/i/hurriyet/75/900x350/5e5d7a1a18c7732484f1e05c.jpg",
                "Ertelendi...!",
                false,
                NewsType.SMALL_NEWS.id
            )
            val smalNewsModel3 = NewsModel(
                "https://i4.hurimg.com/i/hurriyet/75/900x350/5e5d7a1a18c7732484f1e05c.jpg",
                "Ertelendi...!",
                false,
                NewsType.SMALL_NEWS.id
            )
            val smalNewsModel4 = NewsModel(
                "https://i4.hurimg.com/i/hurriyet/75/900x350/5e5d7a1a18c7732484f1e05c.jpg",
                "Ertelendi...!",
                true,
                NewsType.SMALL_NEWS.id
            )
            newsList.add(adsModel)
            newsList.add(smalNewsModel2)
            newsList.add(smalNewsModel3)
            newsList.add(smalNewsModel4)
            newsList.add(smalNewsModel)
            newsList.add(bigNewsModel)
        }
        return newsList
    }
}
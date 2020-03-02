package com.example.newsappc.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.newsappc.R
import com.example.newsappc.adapter.NewsListAdapter
import com.example.newsappc.mock.MockData
import kotlinx.android.synthetic.main.fragment_news.*

/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerNews.adapter=NewsListAdapter(MockData.getNewsList(10)){

        }

    }


}

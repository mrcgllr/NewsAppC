package com.example.newsappc.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsappc.R
import com.example.newsappc.adapter.NewsListAdapter
import com.example.newsappc.mock.MockData
import com.example.newsappc.util.extToast
import kotlinx.android.synthetic.main.fragment_news.*


class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycNewsList.layoutManager = LinearLayoutManager(view.context)
        recycNewsList.adapter = NewsListAdapter(MockData.getNewsList(10)) {

        }

        swipeLayout.setOnRefreshListener {
           /* Toast.makeText(
                requireContext(),
                "Yenilendi",
                Toast.LENGTH_SHORT
            ).show()*/

            requireActivity().extToast("Yenilendi")
            swipeLayout.isRefreshing=false
        }

    }
}
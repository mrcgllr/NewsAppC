package com.example.newsappc.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newsappc.R
import com.example.newsappc.adapter.CategoryNewsAdapter
import com.example.newsappc.mock.MockData
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        init()

    }

    private fun init() {
        vpNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment(5)
            )

        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)

    }
}

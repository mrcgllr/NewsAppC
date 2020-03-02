package com.example.newsappc.ui

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.newsappc.R
import com.example.newsappc.adapter.CategoryNewsAdapter
import com.example.newsappc.mock.MockData
import com.example.newsappc.util.extGetDrawable
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
                MockData.getNewsCategoryFragment()
            )

        tabLayNewsCategory.setupWithViewPager(vpNewsCategory)

      // toolbar.logo = extGetDrawable(R.drawable.newsicon)



    }
}

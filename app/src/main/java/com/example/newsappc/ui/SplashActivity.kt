package com.example.newsappc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.newsappc.R
import com.example.newsappc.util.extStartActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        object: CountDownTimer(3000,1000){ //3 saniyeye kadar 1 sn 1 sn git
            override fun onFinish() {// 3 sn dolunca olması gereken
                this@SplashActivity extStartActivity DashboardActivity::class.java
            }

            override fun onTick(p0: Long) { // her 1 saniyede bir çalışması gereken metod
            }

        }.start()
    }
}

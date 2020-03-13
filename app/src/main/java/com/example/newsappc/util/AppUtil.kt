package com.example.newsappc.util

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity

infix fun <T : AppCompatActivity> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, className))
}

fun Context.extGetDrawable(@DrawableRes drawable: Int): Drawable {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        resources.getDrawable(drawable, theme)
    } else {
        resources.getDrawable(drawable)
    }

}

fun Context.extToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
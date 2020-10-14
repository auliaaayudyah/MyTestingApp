package com.auliaayu.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView
    private lateinit var imgPreview: ImageView

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetValue = findViewById(R.id.btn_set_value)
        tvText = findViewById(R.id.tv_next)

        btnSetValue.setOnClickListener(this)

        names.add("Aulia Ayu")
        names.add("Dyah")
        names.add("Lestari")

        imgPreview = findViewById(R.id.img_preview)
        imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big))
        imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big))
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview)



    }

    override fun onClick(view: View) {
        if (view.id == R.id.btn_set_value) {
        Log.d("MainActivty", names.toString())
        val name = StringBuilder()
        for (i in 0..3) {
            name.append(names[i]).append("\n")
        }
            tvText.text = name.toString()
        }
    }
}
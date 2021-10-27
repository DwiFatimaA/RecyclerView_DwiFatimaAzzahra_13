package com.example.recyclerview_dwifatimaazzahra_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailNovelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_novel)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val novelsirhayani =
            intent.getParcelableExtra<NovelSirhayani>(MainActivity.INTENT_PARCELABLE)

        val imgNovel = findViewById<ImageView>(R.id.img_item_photo)
        val titleNovel = findViewById<TextView>(R.id.tv_item_name)
        val descNovel = findViewById<TextView>(R.id.tv_item_description)

        imgNovel.setImageResource(novelsirhayani?.imgNovel!!)
        titleNovel.text = novelsirhayani.titleNovel
        descNovel.text = novelsirhayani.descNovel
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
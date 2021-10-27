package com.example.recyclerview_dwifatimaazzahra_13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NovelSirhayaniList = listOf<NovelSirhayani>(
            NovelSirhayani(
                R.drawable.true_stalker,
                "True Stalker",
                "Menceritakan tentang kisah kehidupan seorang Adiba yang merupakan siswi SMA kelas X. Diba yang hobinya kepo alias stalking membuatnya berurusan dengan kaka kelasnya, ketua OSIS, Agam. "
            ),
            NovelSirhayani(
                R.drawable.geigi,
                "Geigi",
                "Menceritakan kisah cinta dan harapan Geigi dengan dua cowo bernama Dirgam dan Mars, juga permasalahan keluarganya yang pernah retak."
            ),
            NovelSirhayani(
                R.drawable.persona,
                "Persona",
                "Kisah hubungannya Ara yang masih menyukai Elvan setelah lama putus. Lalu mereka balikan di cerita ini. Ada jg tentang Della, Kezia,Dany, juga Tama yg masing-masing  punya sisi kelam dalam hidupnya."
            ),
            NovelSirhayani(
                R.drawable.memori,
                "Memori",
                "Cerita pertemuan kembali 2 remaja yg dulunya hanya anak kecil perempuan dan laki-laki yg pernah tetanggan, tetapi kemudian si anaka laki-laki pindah rumah"
            ),
            NovelSirhayani(
                R.drawable.our_years,
                "Our Years",
                "Tentang perbedaan Agatha dan Ghali yang saling jatuh cinta. Tetapi ada tembok bernama perbedaan yang menghalangi mereka bersatu."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.nvl_sirhayani)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NovelAdapter(this, NovelSirhayaniList){
            val intent = Intent (this,DetailNovelActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}
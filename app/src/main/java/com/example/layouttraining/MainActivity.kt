package com.example.layouttraining


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.layouttraining.GameTagsRecycler.AdapterForGameScreen
import com.example.layouttraining.Hardcode_Data.PageParams
import com.example.layouttraining.Hardcode_Data.ReviewsParams


// TODO: IMPLEMENT COROUTINE FOR IMAGE LOADING

class MainActivity : AppCompatActivity() {
    private lateinit var ivBackgroundImage: ImageView
    private lateinit var ivGameIcon: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameImagesInitialization()

        val tagRecyclerView: RecyclerView = findViewById(R.id.rvTags)
        tagRecyclerView.adapter = AdapterForGameScreen(PageParams.tagList)
        tagRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val reviewRecyclerView: RecyclerView = findViewById(R.id.rvReview)
        reviewRecyclerView.adapter = AdapterForGameScreen(ReviewsParams.reviews)
        reviewRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun gameImagesInitialization() {
        ivBackgroundImage = findViewById(R.id.ivBackgroundImage)
            Glide.with(this)
            .load(PageParams.BACKGROUND_IMAGE_URL)
            .centerCrop()
            .into(ivBackgroundImage)
        ivGameIcon = findViewById(R.id.ivGameIcon)
            Glide.with(this)
            .load(PageParams.GAME_ICON_URL)
            .centerCrop()
            .into(ivGameIcon)
    }
}
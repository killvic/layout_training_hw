package com.example.layouttraining


import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.layouttraining.Data.ReviewClass
import com.example.layouttraining.Data.TagClass
import com.example.layouttraining.Data.UserClass
import com.example.layouttraining.GameTagsRecycler.AdapterForGameScreen

class MainActivity : AppCompatActivity() {
    private lateinit var ivBackgroundImage: ImageView
    private lateinit var ivGameIcon: ImageView
    private val adapter = AdapterForGameScreen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tagList = listOf(
            TagClass(1, "MOBA"),
            TagClass(2, "MULTIPLAYER"),
            TagClass(3, "STRATEGY"),
            TagClass(4, "test4"),
            TagClass(5, "veryLongTestTagNameForTesting")
        )

        var reviewList = listOf(
            ReviewClass(1, 1550102400000, "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.", UserClass(1, "https://s3-alpha-sig.figma.com/img/50d7/87dc/de907b9c097cd7f9ce6f8703ed2b03f1?Expires=1680480000&Signature=qkYk~rqJevw-IlMT4BcLO70mAGCagK-FGaSzyE38nziDm-YTjgDJHNoAffk6SDLNQQ-db8WXbQachiR7BuXf9akGyfoHCJVphwCMPHyqYuV1-V-z8M7r6uSaSwMZc5C1JhodpENx02eBSZOeTibkGHLeFPCvShXfoDo~2CA7rEEpbq4D7rSLMgJpEGjNU7OGEOg0VvtgwUBvvk7zq-zlprackUsgGW2M6guUUqUjEfrmn1s0wTdcv9T0F2wuaRwTEmMGpSQSlUvcf3zYShp78JmT9tCvfSpS7P0xVfvPAHvbSl2roWMQ6I0cXsAJo8FklvDV-47~hja0vp8-XT8QXA__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4", "Auguste Conte")),
            ReviewClass(2, 1550102400000, "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”", UserClass(1, "https://s3-alpha-sig.figma.com/img/6212/e251/4d28d9fa8e1c1ffdeb79b8525b209e00?Expires=1680480000&Signature=qrUcXb81tJQUQ2EYqd9bqBrqaHUxyrkf8lFI75V9uj7D3ADUJtiHSMWf5W4To2Ldrct4mrAoHSTHsqpzEJVePaj~0Dt5pGhMeO9tJwi2v8MkiNcTENIRze-5yUJp-kICE2A65q12oIg2fcg2l6H4JauZ7crdMeQdCrJJ2TvrTJv3SYPAu00IrRy2iuE3JINiaAuh2NZFw58tVSvt7pmWdb3W4UV365VsWpv0JS51eY~rXn4yTeUGkYr72Li38z1rNBPyTFgVv04GNki68GI7ypWfBVwQTYGZEhSrkYgYGo7tjCkUUmiMbqdgILcrZ-qSzdiGTjlteGD36~5UamwAKQ__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4", "Jang Marcelino"))
        )

        gameImagesInitialization()

        val tagRecyclerView: RecyclerView = findViewById(R.id.rvTags)
        tagRecyclerView.adapter = AdapterForGameScreen(tagList)
        tagRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val reviewRecyclerView: RecyclerView = findViewById(R.id.rvReview)
        reviewRecyclerView.adapter = AdapterForGameScreen(reviewList)
        reviewRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun gameImagesInitialization() {
        ivBackgroundImage = findViewById(R.id.ivBackgroundImage)
        val backgroundImageURL = "https://s3-alpha-sig.figma.com/img/284d/401f/f98fb91fbba05e15f99cdcd8e4f9d673?Expires=1680480000&Signature=SOTU7egX1t~82UR~RcV3qhyYiC-dhLa~~boKqlHs6RF58sMEMROyeaie~68HxX1X1rcdI5P7awo0twv05gBX3IYDHg-3ba~-ap2PO3-5moC0am9Q7tHv1DTL94Z8pxz3ysgn8BhgBZnpYHyxvqV2Cbo8QqoKDIpESCKo8JGqU3NSUVXRGRZw2TPunD6gDZIbQ9qOgqPvpK4HxGKmSGppxg-HHD5eFNg47b5GWVjNU6eWB9VcewqjxG-L0q-UAShNJYLQhO3rj7O6t2IFd5W0oNWaPZ2EcJW6mQ-w2WM3lsvsTsMR1lTidtDliJD6skZJFLUeZB7hDltMpnnvpDfLag__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
        Glide.with(this)
            .load(backgroundImageURL)
            .centerCrop()
            .into(ivBackgroundImage)

        ivGameIcon = findViewById(R.id.ivGameIcon)
        val gameIconImageURL = "https://s3-alpha-sig.figma.com/img/cf52/a010/d2d8badd19c3de46d88b8a74f80aaef6?Expires=1680480000&Signature=nwF6kDI34GCW1oOURfjUMol6UlM3K5468t7K01mqEyBMVzA1n48oLi~8dYpblQD0RScr3zkJEMREOugl1tMTUJh8-W2MsFZG-akr-H2MuE3MoWSXrImkpx3tzN576tuhog0XIy8d9DJUOZGFQPjQQUTq9MNAsJ6IZQmerJ0Nbq-eUZspGKt5XTcH5yC~3UAWP4yvCy3lOeeNHD~HpDxhZYgclzRBtCq1~2VImE2~M1i92-xaNHW1RHQFFY1XQsGcWb9O8LJ7dW1ByXdJEyMeuDh38T2r0EQrxMpBqjd3RzpS5vYe0bdK1mbszzsvPfeibwgjzMWO1OOUF4sNBafeuQ__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
        Glide.with(this)
            .load(gameIconImageURL)
            .centerCrop()
            .into(ivGameIcon)
    }
}
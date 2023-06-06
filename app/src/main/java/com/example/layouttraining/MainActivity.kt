package com.example.layouttraining


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.layouttraining.Data.ReviewClass
import com.example.layouttraining.Data.TagClass
import com.example.layouttraining.Data.UserClass
import com.example.layouttraining.GameTagsRecycler.AdapterForGameScreen

// TODO: FIX IMAGE LOADING
// TODO: IMPLEMENT COROUTINE FOR IMAGE LOADING

private const val BACKGROUND_IMAGE_URL = "https://s3-alpha-sig.figma.com/img/284d/401f/f98fb91fbba05e15f99cdcd8e4f9d673?Expires=1687132800&Signature=EXkWaKQQpK~~Fm9tWRf3bgw-s0LP5inq-BKiTnyy6cvuCfXnoqV78xVxziyeyD5mTAGgyPdd1xDHKzqXtRewBnGKjp~PWEh7JARYUI7aqFHtuJw5JxzpqaP9DUlToGfgiBDv1r4Y0Wbee2VgHPhP7iMIDarUVMjVs-xFLh3F4ZpCqcJ~jQOwBDVw9ypGaG4tjMfhf9tK3c69r1ofH-cevlkf4xzyx0I3WusSrRlf6bTku7MiI53xqjy2Ng4zm1h9mcJQMP9ufKumI0wFqJmIZEQFnVkAXio6kLYRfripMuwS-l-4HJHh3SVFsKL8t1oOnxqEBRIm7r3GnxwQVIcGPQ__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
private const val GAME_ICON_URL = "https://s3-alpha-sig.figma.com/img/cf52/a010/d2d8badd19c3de46d88b8a74f80aaef6?Expires=1687132800&Signature=BIcrDlpvWzdhkPHseksvkamUOp3wGcfhw5-wn81p7V6HKcbHf9UhCjr6pmv4Gu-IdwQ-ZdxSNPO2g9GBAU2Jrb76XKlJZgNVp1YRwGoqjPjtip7ooCgJJV73B222nFbHZSOu9Je8Jnsc~Cex3-YJ9YljizKVN8fieroK9aC3EITt1CsQRCcnkBXctyFN2HSuwCm0QmQBOGOwiRuN0mOTcUa5cxFoXBh7eZiOfUYZR8raEXEoJ~UaVj5Bz03ctoMxVaEbSCB1V33QpCfMPaNxRT9H1uHO0ITbdlg6HnrWi50C38HgDhgitaBt228mfoayv1Y3CxEJC63a10FE4WP2Og__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
private const val AVATAR_1_URL = "https://s3-alpha-sig.figma.com/img/50d7/87dc/de907b9c097cd7f9ce6f8703ed2b03f1?Expires=1687132800&Signature=YcnCq5UpYnWzR2JuZL9QezTkuc200UCzSZ5j4xVmU~8NMlQ7X-t9CKPELQi7-aj0C70yzDrXigXrDFXUqpGNq~nJy4jpvBZ3M3SOl9hbinizfcN5YRnOprQz3K01Vm4TJk1PvyBtlO8myJdkkHqQ-7KD4y9lMaEq6uzR0F69Gv2Sbt70QzUf3D~WhRRkpZxoeTVNtB-Kx2Z-b6s8D9DxnTljUOmuWcFWMtGZZsmW6pV4EVVoYSafTHYz~ZI3g43VlXHppnyWnTysDSwhehSi8Vv5yVJYnIFBGZs8bw8RhAzTdgsmwNCCdtqIp~rJyl6mUuIvvMfJiAbLrXIQqQAW9g__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
private const val AVATAR_2_URL = "https://s3-alpha-sig.figma.com/img/6212/e251/4d28d9fa8e1c1ffdeb79b8525b209e00?Expires=1687132800&Signature=ZhVo0kWgAJUS9~NlCIT69MxZN7GpFigJ4ro2Mv5zTo8IgV7H8Z6DUKg~-952iJs-cgNMuJqm0nGV~1ihoQ0uzgSkrncq59uqeMgrKnrN4kIdQjPWeB1u11shclNp6DyKTKHfZ7otEs6enmSd-JpSirvuJlf6Y6BY3krbJnQOAs~maiLeOFKM3NYLLWKwOtCmO1hos9qrpg--LQr11UcKOydzKkxi4gv3L7MqozfuGcIaHhkYEM4T0urCA8zh9fWOs88ZcEKuHrPg2usuy3PdefiQUTpIIO5Zyhe-UbQoc1UQ67CLRq349ewO7MXno-2pd~DpvNmd3ew8FAsuyYyYQg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"

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
            ReviewClass(
                1,
                1550102400000,
                "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
                UserClass(1, AVATAR_1_URL, "Auguste Conte")),
            ReviewClass(
                2,
                1550102400000,
                "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                UserClass(1, AVATAR_2_URL, "Jang Marcelino"))
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
            Glide.with(this)
            .load(BACKGROUND_IMAGE_URL)
            .centerCrop()
            .into(ivBackgroundImage)
        ivGameIcon = findViewById(R.id.ivGameIcon)
            Glide.with(this)
            .load(GAME_ICON_URL)
            .centerCrop()
            .into(ivGameIcon)
    }
}
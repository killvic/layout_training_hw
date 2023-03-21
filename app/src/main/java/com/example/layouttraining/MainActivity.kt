package com.example.layouttraining


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var ivBackgroundImage: ImageView
    private lateinit var ivGameIcon: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
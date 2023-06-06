package com.example.layouttraining.Hardcode_Data

import com.example.layouttraining.Data.UserClass

object UsersParams {
    private const val AVATAR_1_URL = "https://s3-alpha-sig.figma.com/img/50d7/87dc/de907b9c097cd7f9ce6f8703ed2b03f1?Expires=1687132800&Signature=YcnCq5UpYnWzR2JuZL9QezTkuc200UCzSZ5j4xVmU~8NMlQ7X-t9CKPELQi7-aj0C70yzDrXigXrDFXUqpGNq~nJy4jpvBZ3M3SOl9hbinizfcN5YRnOprQz3K01Vm4TJk1PvyBtlO8myJdkkHqQ-7KD4y9lMaEq6uzR0F69Gv2Sbt70QzUf3D~WhRRkpZxoeTVNtB-Kx2Z-b6s8D9DxnTljUOmuWcFWMtGZZsmW6pV4EVVoYSafTHYz~ZI3g43VlXHppnyWnTysDSwhehSi8Vv5yVJYnIFBGZs8bw8RhAzTdgsmwNCCdtqIp~rJyl6mUuIvvMfJiAbLrXIQqQAW9g__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"
    private const val AVATAR_2_URL = "https://s3-alpha-sig.figma.com/img/6212/e251/4d28d9fa8e1c1ffdeb79b8525b209e00?Expires=1687132800&Signature=ZhVo0kWgAJUS9~NlCIT69MxZN7GpFigJ4ro2Mv5zTo8IgV7H8Z6DUKg~-952iJs-cgNMuJqm0nGV~1ihoQ0uzgSkrncq59uqeMgrKnrN4kIdQjPWeB1u11shclNp6DyKTKHfZ7otEs6enmSd-JpSirvuJlf6Y6BY3krbJnQOAs~maiLeOFKM3NYLLWKwOtCmO1hos9qrpg--LQr11UcKOydzKkxi4gv3L7MqozfuGcIaHhkYEM4T0urCA8zh9fWOs88ZcEKuHrPg2usuy3PdefiQUTpIIO5Zyhe-UbQoc1UQ67CLRq349ewO7MXno-2pd~DpvNmd3ew8FAsuyYyYQg__&Key-Pair-Id=APKAQ4GOSFWCVNEHN3O4"

    val firstUser : UserClass = UserClass(1, AVATAR_1_URL, "Auguste Conte")
    val secondUser : UserClass = UserClass(1, AVATAR_2_URL, "Jang Marcelino")
}
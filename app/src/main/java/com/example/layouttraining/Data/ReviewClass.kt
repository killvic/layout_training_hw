package com.example.layouttraining.Data

data class ReviewClass(
    val id: Int = 0,
    var date: Long = 0,
    var reviewText: String = "",
    val reviewer: UserClass
) : RecyclerListItem
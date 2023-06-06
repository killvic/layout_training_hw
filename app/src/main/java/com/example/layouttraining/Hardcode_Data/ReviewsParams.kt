package com.example.layouttraining.Hardcode_Data

import com.example.layouttraining.Data.ReviewClass

object ReviewsParams {
    private const val REVIEW_TEXT = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"

    val reviews by lazy {listOf(firstReview, secondReview)}

    private val firstReview : ReviewClass = ReviewClass(
        1,
        1550102400000,
        REVIEW_TEXT,
        UsersParams.firstUser
    )

    private val secondReview : ReviewClass = ReviewClass(
        2,
        1550102400000,
        REVIEW_TEXT,
        UsersParams.secondUser
    )

}
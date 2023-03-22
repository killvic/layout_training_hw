package com.example.layouttraining.GameTagsRecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.layouttraining.Data.RecyclerListItem
import com.example.layouttraining.Data.ReviewClass
import com.example.layouttraining.Data.TagClass
import com.example.layouttraining.MainActivity
import com.example.layouttraining.R

class AdapterForGameScreen(
    var itemList: List<RecyclerListItem> = listOf()
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val TAG_VIEW_TYPE = 1
        const val REVIEW_VIEW_TYPE = 2
    }
    class TagViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvGameTag = view.findViewById<TextView>(R.id.tvGameTag)

        fun bind(tag: TagClass) {
            tvGameTag.text = tag.tagName
        }
    }

    class ReviewViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivReviewerAvatar = view.findViewById<ImageView>(R.id.ivReviewerAvatar)
        val tvReviewUserName = view.findViewById<TextView>(R.id.tvReviewUserName)
        val tvReviewDate = view.findViewById<TextView>(R.id.tvReviewDate)
        val tvReviewText = view.findViewById<TextView>(R.id.tvReviewText)

        fun bind(review: ReviewClass, avatarURL: String, view: View) {
            tvReviewUserName.text = review.reviewer.reviewerName
            tvReviewDate.text = review.date.toString() // Implement conversion from long to string
            tvReviewText.text = review.reviewText
            Glide.with(view.context)
                .load(avatarURL)
                .centerCrop()
                .into(ivReviewerAvatar)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int)
    : RecyclerView.ViewHolder {
        return when (viewType) {
            REVIEW_VIEW_TYPE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.review_view_row, parent, false)
                ReviewViewHolder(view)
            }
            TAG_VIEW_TYPE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.tags_view_row, parent, false)
                TagViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        when (getItemViewType(position)) {
            REVIEW_VIEW_TYPE -> {
                val item = itemList[position] as ReviewClass
                val itemHolder = holder as ReviewViewHolder
                itemHolder.bind(item, item.reviewer.reviewerAvatar, itemHolder.itemView)
            }
            TAG_VIEW_TYPE -> {
                val item = itemList[position] as TagClass
                val itemHolder = holder as TagViewHolder
                itemHolder.bind(item)
            }
        }
    }

    override fun getItemCount() = itemList.size

    override fun getItemViewType(position: Int): Int {
        return when (itemList[position]) {
            is TagClass -> TAG_VIEW_TYPE
            is ReviewClass -> REVIEW_VIEW_TYPE
            else -> throw IllegalArgumentException("Invalid item type")
        }
    }
}
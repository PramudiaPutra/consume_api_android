package com.pramudiaputr.restaurantreview.network.response
import com.google.gson.annotations.SerializedName
import com.pramudiaputr.restaurantreview.network.model.CustomerReview

data class PostReviewResponse(
    @SerializedName("customerReviews")
    val customerReviews: List<CustomerReview>,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message: String
)
package com.pramudiaputr.restaurantreview.network.response
import com.google.gson.annotations.SerializedName
import com.pramudiaputr.restaurantreview.network.model.Restaurant

data class RestaurantResponse(
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("restaurant")
    val restaurant: Restaurant
)
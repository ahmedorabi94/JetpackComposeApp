package com.example.recipeapp.domain.network.response

import com.example.recipeapp.domain.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeNetworkEntity>,
)
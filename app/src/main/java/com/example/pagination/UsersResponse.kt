package com.example.pagination

import com.google.gson.annotations.SerializedName

data class UsersResponse(
    val data: ArrayList<Data>,
    val page: Int,
    @SerializedName("total_pages")
    val totalPages: Int
)

data class Data(
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("last_name")
    val lastName: String
)

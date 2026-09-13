package com.carlo_mederos.lazylayoutsdemo

data class UserProfile(
    val id: Int,
    val name: String,
    val bio: String,
    val interests: List<String>,
    val imageUrl: String = ""
)
package com.example.myapplication

import android.graphics.Bitmap
import com.ahmedapps.geminichatbot.data.Chat

/**
 * @author Ahmad
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
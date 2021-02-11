package com.geekbrains.video.model

import android.provider.MediaStore

interface RepositoryForVideo {
    fun getVideoForServer():Video
}
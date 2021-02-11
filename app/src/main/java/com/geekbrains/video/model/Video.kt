package com.geekbrains.video.model

@Parcelize
data class Video(
        var nameVideo: VideoParam = getNameVideo()
)


fun getNameVideo(): VideoParam {}()



//annotation class Parceriz










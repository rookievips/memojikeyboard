package com.rookievips.memojikeyboard.category

import com.rookievips.memojikeyboard.R
import com.rookievips.memojikeyboard.chunk.ActivitiesCategoryChunkAndroidStyle
import com.vanniktech.emoji.emoji.EmojiCategory
import com.vanniktech.emoji.google.GoogleEmoji

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class ActivitiesCategoryAndroidStyle : EmojiCategory {
    override fun getEmojis(): Array<GoogleEmoji> {
        return ActivitiesCategoryChunkAndroidStyle.get()
    }

    override fun getIcon(): Int {
        return R.drawable.emoji_google_category_activities
    }

    override fun getCategoryName(): Int {
        return R.string.emoji_google_category_activities
    }
}
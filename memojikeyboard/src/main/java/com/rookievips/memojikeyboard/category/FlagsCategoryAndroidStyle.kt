package com.rookievips.memojikeyboard.category

import com.rookievips.memojikeyboard.R
import com.rookievips.memojikeyboard.chunk.FlagsCategoryChunkAndroidStyle
import com.vanniktech.emoji.emoji.EmojiCategory
import com.vanniktech.emoji.google.GoogleEmoji

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class FlagsCategoryAndroidStyle : EmojiCategory {
    override fun getEmojis(): Array<GoogleEmoji> {
        return FlagsCategoryChunkAndroidStyle.get()
    }

    override fun getIcon(): Int {
        return R.drawable.emoji_google_category_flags
    }

    override fun getCategoryName(): Int {
        return R.string.emoji_google_category_flags
    }
}
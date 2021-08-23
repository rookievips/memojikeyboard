package com.rookievips.memojikeyboard.category

import com.rookievips.memojikeyboard.R
import com.rookievips.memojikeyboard.chunk.SmileysCategoryChunkIosStyle
import com.vanniktech.emoji.emoji.EmojiCategory
import com.vanniktech.emoji.ios.IosEmoji

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class SmileysCategoryIosStyle : EmojiCategory {
    override fun getEmojis(): Array<IosEmoji> {
        return SmileysCategoryChunkIosStyle.get()
    }

    override fun getIcon(): Int {
        return R.drawable.emoji_ios_category_smileysandpeople
    }

    override fun getCategoryName(): Int {
        return R.string.emoji_ios_category_smileysandpeople
    }
}
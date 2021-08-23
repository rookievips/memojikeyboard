package com.rookievips.memojikeyboard.category

import com.rookievips.memojikeyboard.chunk.FoodsDrinkCategoryChunkIosStyle
import com.vanniktech.emoji.emoji.EmojiCategory
import com.vanniktech.emoji.ios.IosEmoji
import com.vanniktech.emoji.ios.R

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class FoodsDrinkCategoryIosStyle : EmojiCategory {
    override fun getEmojis(): Array<IosEmoji> {
        return FoodsDrinkCategoryChunkIosStyle.get()
    }

    override fun getIcon(): Int {
        return R.drawable.emoji_ios_category_foodanddrink
    }

    override fun getCategoryName(): Int {
        return R.string.emoji_ios_category_foodanddrink
    }
}
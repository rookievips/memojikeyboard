package com.rookievips.memojikeyboard.provider

import com.rookievips.memojikeyboard.category.*
import com.vanniktech.emoji.EmojiProvider
import com.vanniktech.emoji.emoji.EmojiCategory

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class CustomEmojiProviderAndroidStyle : EmojiProvider {
    override fun getCategories(): Array<EmojiCategory> {
        return arrayOf(
            SmileysCategoryAndroidStyle(),
            AnimalsNatureCategoryAndroidStyle(),
            FoodsDrinkCategoryAndroidStyle(),
            ActivitiesCategoryAndroidStyle(),
            FlagsCategoryAndroidStyle()
        )
    }
}
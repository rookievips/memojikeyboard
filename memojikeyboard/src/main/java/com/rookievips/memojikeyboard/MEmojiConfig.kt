package com.rookievips.memojikeyboard

import com.rookievips.memojikeyboard.provider.CustomEmojiProviderAndroidStyle
import com.rookievips.memojikeyboard.provider.CustomEmojiProviderIosStyle
import com.vanniktech.emoji.EmojiManager

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
object MEmojiConfig {
    @JvmStatic
    fun init() {
        EmojiManager.install(CustomEmojiProviderIosStyle())
    }

    @JvmStatic
    fun init(style: MEmojiStyle) {
        when (style) {
            MEmojiStyle.IOS -> EmojiManager.install(CustomEmojiProviderIosStyle())
            MEmojiStyle.Android -> EmojiManager.install(CustomEmojiProviderAndroidStyle())
        }
    }

    @JvmStatic
    fun clear() {
        EmojiManager.destroy()
    }
}
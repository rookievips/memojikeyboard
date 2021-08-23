package com.rookievips.android.app.memojikeyboard

import android.app.Application
import com.rookievips.memojikeyboard.MEmojiConfig
import com.rookievips.memojikeyboard.MEmojiStyle

/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MEmojiConfig.init(MEmojiStyle.Android)
    }
}
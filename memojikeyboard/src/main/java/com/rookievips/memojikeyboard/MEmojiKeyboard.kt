package com.rookievips.memojikeyboard

import android.view.View
import android.widget.EditText
import androidx.viewpager.widget.ViewPager
import com.vanniktech.emoji.EmojiPopup
import com.vanniktech.emoji.listeners.OnEmojiBackspaceClickListener
import com.vanniktech.emoji.listeners.OnEmojiClickListener
import com.vanniktech.emoji.listeners.OnEmojiPopupDismissListener
import com.vanniktech.emoji.listeners.OnEmojiPopupShownListener


/**
 * Function:
 * Author Name: rookievips
 * Date: 2021/7/8
 * Copyright © 2006-2021,All Rights Reserved.
 */
class MEmojiKeyboard private constructor(emojiBuilder: EmojiPopup.Builder?, editText: EditText){
    private var emojiPopup:EmojiPopup? = null

    init {
        emojiPopup = emojiBuilder?.build(editText)
    }

    class Builder {
        private var emojiBuilder: EmojiPopup.Builder? = null

        fun fromRootView(rootView: View) = apply {
            emojiBuilder = EmojiPopup.Builder.fromRootView(rootView)
        }

        fun selectedIconColor(color: Int) = apply {
            emojiBuilder?.setSelectedIconColor(color)
        }

        fun backgroundColor(color: Int) = apply {
            emojiBuilder?.setBackgroundColor(color)
        }

        fun dividerColor(color: Int) = apply {
            emojiBuilder?.setDividerColor(color)
        }

        fun iconColor(color: Int) = apply {
            emojiBuilder?.setIconColor(color)
        }

        fun keyboardAnimationStyle(animation: Int) = apply {
            emojiBuilder?.setKeyboardAnimationStyle(animation)
        }

        fun pageTransformer(transformer: ViewPager.PageTransformer) = apply {
            emojiBuilder?.setPageTransformer(transformer)
        }

        fun addOnEmojiClickListener(listener: OnEmojiClickListener) = apply {
            emojiBuilder?.setOnEmojiClickListener(listener)
        }

        fun addOnEmojiPopupShownListener(listener: OnEmojiPopupShownListener) = apply {
            emojiBuilder?.setOnEmojiPopupShownListener(listener)
        }

        fun addOnEmojiPopupDismissListener(listener: OnEmojiPopupDismissListener) = apply {
            emojiBuilder?.setOnEmojiPopupDismissListener(listener)
        }

        fun addOnEmojiBackspaceClickListener(listener: OnEmojiBackspaceClickListener) = apply {
            emojiBuilder?.setOnEmojiBackspaceClickListener(listener)
        }

        // TODO: 2021/7/9 可以继续扩展...

        fun build(editText: EditText) = MEmojiKeyboard(emojiBuilder,editText)
    }

    fun show() {
       emojiPopup?.let { if (!it.isShowing) it.show() }
    }

    fun hide() {
        emojiPopup?.let { if (it.isShowing) it.dismiss() }
    }

    fun toggle() {
        emojiPopup?.toggle()
    }
}
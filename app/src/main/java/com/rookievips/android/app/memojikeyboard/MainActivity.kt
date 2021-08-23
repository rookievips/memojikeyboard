package com.rookievips.android.app.memojikeyboard

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rookievips.memojikeyboard.MEmojiKeyboard

class MainActivity : AppCompatActivity() {
    private var rootView: ViewGroup? = null
    private var editText: EditText? = null
    private var emojiKeyboard: MEmojiKeyboard? = null
    private var txt: TextView? = null
    private  var txt1: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.edit)
        txt = findViewById(R.id.txt)
        txt1 = findViewById<TextView>(R.id.txt1)
        editText?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {}
        })
        rootView = findViewById(R.id.root_view)
        findViewById<View>(R.id.emoji_btn).setOnClickListener { v: View? -> emojiKeyboard?.toggle() }
        setUpEmojiPopup()
        val str: String = txt1?.getText().toString()
        txt?.text = getStringWidth(str, txt1!!).toString() + "+" + getScreenWidth()

    }

    //    @SuppressFBWarnings(value = "SIC_INNER_SHOULD_BE_STATIC_ANON", justification = "Sample app we do not care")
    private fun setUpEmojiPopup() {
        emojiKeyboard = MEmojiKeyboard.Builder()
            .fromRootView(rootView!!)
            .selectedIconColor(Color.parseColor("#FF6E00"))
            .build(editText!!)
    }


    private fun getStringWidth(string: String, textView: TextView): Float {
        return textView.paint.measureText(string)
    }

    private fun getScreenWidth(): Float {
        val resources = this.resources
        val dm = resources.displayMetrics
        return dm.widthPixels.toFloat()
    }
}
package com.adrianotelesc.expandablesearchbar

import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat
import android.widget.EditText
import android.widget.TextView

/**
 * Tint the cursor. Tint and change text select handles drawables of an [EditText].
 */

object EditTextHelper {

    fun setTextCursorColor(editText: EditText, textCursorColor: Int){
        // Get the editor
        var field = TextView::class.java.getDeclaredField("mEditor")
        field.isAccessible = true
        val editor = field.get(editText)

        // Get the cursor drawable, tint it, and set it on the TextView Editor
        field = TextView::class.java.getDeclaredField("mCursorDrawableRes")
        field.isAccessible = true
        val cursorDrawableRes = field.getInt(editText)
        val cursorDrawable = ContextCompat.getDrawable(editText.context, cursorDrawableRes)!!.mutate()
        cursorDrawable.setColorFilter(textCursorColor, PorterDuff.Mode.SRC_IN)
        val drawables = arrayOf(cursorDrawable, cursorDrawable)
        field = editor.javaClass.getDeclaredField("mCursorDrawable")
        field.isAccessible = true
        field.set(editor, drawables)
    }

}
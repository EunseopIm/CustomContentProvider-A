package com.study.providera

import android.net.Uri

object MyContract {

    const val TABLE_NAME = "item"
    const val AUTHORITY = "com.study.providera.MyContentProvider"
    const val URL = "content://$AUTHORITY/$TABLE_NAME"
    val CONTENT_URI: Uri = Uri.parse(URL)
}
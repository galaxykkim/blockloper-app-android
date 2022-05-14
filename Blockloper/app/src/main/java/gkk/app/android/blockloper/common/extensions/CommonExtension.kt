package gkk.app.android.blockloper.common.extensions

import android.view.View
import gkk.app.android.blockloper.common.interfaces.OnSafeClickListener

fun View.setOnSafeClickListener(onSafeClick: ((View?) -> Unit)?) {
    onSafeClick?.let {
        val safeClickListener = object: OnSafeClickListener() {
            override fun onSafeClick(view: View?) {
                onSafeClick.invoke(view)
            }
        }
        setOnClickListener(safeClickListener)
    }
}
package gkk.app.android.blockloper.presenters.bindingadapter

import android.view.View
import androidx.databinding.BindingAdapter
import gkk.app.android.blockloper.common.extensions.setOnSafeClickListener

object CommonBindingAdapter {

    @BindingAdapter("onSafeClick")
    @JvmStatic
    fun View.onSafeClick(clickListener: View.OnClickListener?) {
        clickListener?.let {
            setOnSafeClickListener {
                clickListener.onClick(it)
            }
        }
    }


}
package gkk.app.android.blockloper.common.interfaces

import android.util.Log
import android.view.View

abstract class OnSafeClickListener: View.OnClickListener {
    private var clickIntervalMillis = 500L
    private var lastClickMillis: Long = 0L

    override fun onClick(view: View?) {
        val currentClickMillis = System.currentTimeMillis()
        if ((currentClickMillis - lastClickMillis) >= clickIntervalMillis) {
            onSafeClick(view)
        }
        lastClickMillis = currentClickMillis
    }

    abstract fun onSafeClick(view: View?)

    fun setClickIntervalMillis(interval: Long) {
        if (interval < 0) {
            Log.e("OnSafeClickListener", "0 혹은 0 보다 큰 값을 설정해야 합니다.")
            return
        }
        clickIntervalMillis = interval
    }
}